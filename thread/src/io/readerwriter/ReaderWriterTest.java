package io.readerwriter;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReaderWriterTest
{
	public static void main( String args[])
	{
		UIForm3 ui = new UIForm3();
		ui.addLayout();
		ui.eventProc();	
	}	
}

//========================================
//	화면을 관리하는 클래스 
//----------------------------------------
class UIForm3 extends JFrame
{
	JTextArea	ta;
	JButton 		bSave, bLoad, bClear;
	
	UIForm3()
	{
		ta		= new JTextArea();		
		bSave 	= new JButton("파일저장");
		bLoad	= new JButton("파일읽기");
		bClear	= new JButton("화면지우기");
	}
	
	void addLayout()
	{
		JPanel pCenter 	= new JPanel();
		pCenter.setLayout( new BorderLayout() );
		pCenter.add("Center", new JScrollPane(ta) );
	
		JPanel pSouth	= new JPanel();
		pSouth.add( bSave );
		pSouth.add( bLoad );
		pSouth.add( bClear );
		
		getContentPane().add("Center", pCenter );
		getContentPane().add("South",  pSouth );
		
		setSize( 400, 350 );
		setVisible( true );
		
		addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "저장하시겠습니까?");
				if (result == JOptionPane.OK_OPTION) {
					JFileChooser fc = new JFileChooser();
					int returnVa = fc.showSaveDialog(null);
					if ( returnVa == JFileChooser.APPROVE_OPTION ) {
						File f = fc.getSelectedFile();
						try{														//파일과 디렉토리를 관리하는 클래스
						FileWriter out = new FileWriter(f);
						String msg = ta.getText();
						out.write(msg);
						out.close();
						}catch(Exception ex){
							System.out.println("저장실패: "+ ex.getMessage());
					}				
				}else if ( returnVa == JOptionPane.NO_OPTION){	
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				}else if( returnVa == JOptionPane.CANCEL_OPTION ) {
					System.out.println("취소");
					System.exit(0);
				}
			}
		}
			
			@Override
			public void windowClosed(WindowEvent e) {
				
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				
				
			}
		});
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
	
	void eventProc()
	{
		EventHandler hdlr = new EventHandler();
		
		bSave.addActionListener(hdlr);
		bLoad.addActionListener(hdlr);
		bClear.addActionListener(hdlr);
	}
	
	class EventHandler implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			Object evt = ev.getSource();
			
			// "화일저장" 버튼이 눌렸을 때 
			if( evt == bSave ){
				JFileChooser fc = new JFileChooser();
				int returnVa = fc.showSaveDialog(null);
				if ( returnVa == JFileChooser.APPROVE_OPTION ) {
					File f = fc.getSelectedFile();
					try{														//파일과 디렉토리를 관리하는 클래스
					FileWriter out = new FileWriter(f);
					String msg = ta.getText();
					out.write(msg);
					out.close();
					}catch(Exception ex){
						System.out.println("저장실패: "+ ex.getMessage());
					}				
				}
			}else if( evt == bClear ){
				ta.setText(null);
		
			//파일 열기 버튼이 눌러졌을 때 
			}else if( evt == bLoad ){
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showOpenDialog(null);
			if (returnVal == JFileChooser.APPROVE_OPTION ) {
				File f = fc.getSelectedFile();
				try{
					FileReader in = new FileReader(f);
					int data = 0;
					StringBuffer msg = new StringBuffer(); 				//StringBuilder
					do{
						data = in.read();
						msg.append((char)data);		
					}while(data != -1);
					ta.setText(msg.toString());;
					in.close();
				}catch(Exception e){
				System.out.println("열기 실패: " + e.getMessage());
					}
				}
			}
		}
	}
}