package basic.ex;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CounterTest extends JFrame {
	JPanel p1, p2;
	JButton btn;
	JTextArea ta;
	JLabel lb, lbImage, lbImage2;
	
	boolean isChecked = false;
	boolean isAnswerd = false;
	
		public CounterTest() {
			lbImage = new JLabel(new ImageIcon("src/images/bomb.png"));
//			lbImage2 = new JLabel(new ImageIcon("src/images/explosion.png");
			
			p1 = new JPanel();
			p1.add( btn = new JButton("클릭"));
			p1.add( lb = new JLabel("카운트!!!"));
			p1.add( lbImage );
			add(p1, BorderLayout.NORTH);
			
			p2 = new JPanel();
			p2.add( ta = new JTextArea(20, 50));
			add(p2, BorderLayout.CENTER);
			
			setBounds(200,200, 600, 400);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//1. 카운트 다운을 하여 라벨에 출력
					new Thread ( new Runnable() {
						public void run() {
							for (int i = 10; i >= 0; i--) {
								if ( isChecked ) {
//									lb.setText("빙고");
//									lbImage.setIcon(new ImageIcon("src/images/explosion.png"));
									break;
								}
								lb.setText(Integer.toString(i));
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									e.printStackTrace();								
								}														//end of catch
							}															//end of for
						}																//end of run
					}).start();															//end of Thread
					
					//2. 입력값을 받아들여 텍스트에어리어에 출력
					new Thread( new Runnable() {
						public void run() {
							String txt = JOptionPane.showInputDialog("데이터를 입력하세요");
							ta.append("입력 값 : " + txt + "입니다 \n");
//							isChecked = true;
						
						if (txt.equals("점심")) {
							lb.setText("성공!");						
							isChecked = true;
						}else lbImage.setIcon(new ImageIcon("src/images/explosion.png")); isChecked = true;
						
						
						}																										//end of run2
					}).start();															//end of Thread
				}																		//end of actionPerformed
			});																			//end of new ActionListener;
		}																				//end of CounterTest
		
	public static void main(String[] args) {
		new CounterTest();
				
	}																					//end of main
}																						//end of CounterTest class