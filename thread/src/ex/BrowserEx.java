package ex;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

	class myFrame extends JFrame implements ActionListener{

		JButton			btView, btnew, btDel;
		JTextArea		taDir;
		JList<String>	lViewer;
		JLabel			lbDir;
				
	myFrame() {
		btView = new JButton("파일보기");
		btnew = new JButton("새 파일 만들기");
		btDel = new JButton("파일 지우기");
		taDir = new JTextArea("C:\\imsi");
		lbDir = new JLabel("경로");
		lViewer = new JList<>();
		
	}
	
	public void addLayout(){
		
		setLayout(new BorderLayout());		
		setSize(600, 700);
		setVisible(true);

		JPanel pButton = new JPanel();			
			pButton.setLayout(new GridLayout(3, 1));
			pButton.add(btView);
			pButton.add(btnew);
			pButton.add(btDel);
		
		JPanel pDir = new JPanel();			
			
			pDir.add(lbDir);
			pDir.add(taDir);
		
		add(pButton, BorderLayout.EAST);
		add(pDir, BorderLayout.NORTH);		
		add(lViewer, BorderLayout.CENTER);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
	}
	
	public void eventProc(){		
		btDel.addActionListener(this);
		btnew.addActionListener(this);
		btView.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton evt = (JButton)e.getSource();
		if ( evt == btView ) {
			try{
			File[] fileList = (new File("c:\\imsi")).listFiles();
			String [] fileName = new String[fileList.length];
			for (int i = 0; i < fileName.length; i++) {
				if(fileList[i].isFile()){
				fileName[i] = fileList[i].getName();
				lViewer.setListData(fileName);
				}
			}
			}catch (Exception ex){
			ex.printStackTrace();
			}
		}else if( evt == btnew ){
			String input = JOptionPane.showInputDialog("파일명을 입력하세요");
			
			File f = new File("c:\\imsi\\"+input);
			try {
				f.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}else if( evt == btDel ){
			String input = lViewer.getSelectedValue();
			File f = new File("c:\\imsi\\"+input);
			f.delete();
			
			}
		} 	
	}
	
public class BrowserEx{
	public static void main(String[] args) {
		myFrame f = new myFrame();
		f.addLayout();
		f.eventProc();		
	}
}