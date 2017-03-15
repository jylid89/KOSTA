package network.chat;

import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import javax.swing.*;

import sun.management.snmp.util.SnmpNamedListTableCache;

import java.util.*;

class ChatClient implements ActionListener, Runnable{
	JFrame f;

	JTextField connTF, sendTF;
	JButton connB, sendB, delete;
	JTextArea ta;
	
	Socket s;
	BufferedReader in;
	OutputStream out;
	
	JScrollPane scrl;

	// 추가0 : 대화명을 바꾸기
	JTextField changeNameTF;
	JButton    changeNameB;

	// 추가2 : 방인원의 대명 보여주기
	// 변수 선언
	JList  memberList;
	Vector list;
	
	public ChatClient() {
		f = new JFrame("Chat Client");
		
		
		scrl = new JScrollPane();
		connTF = new JTextField();
		sendTF = new JTextField();
		connB = new JButton("접 속");
		sendB = new JButton("확 인");
		delete = new JButton("강 퇴");
		ta = new JTextArea(15,40);
		
		// 추가0: 대화명 바꾸기
		changeNameTF	= new JTextField("guest", 10);
		changeNameB		= new JButton("바꾸기");
		JPanel p_changeName = new JPanel();
		p_changeName.add( new JLabel("대화명 : "),"West" );
		p_changeName.add(changeNameTF, "Center");
		p_changeName.add(changeNameB, "East");
		
		JPanel p_serverName = new JPanel();
		p_serverName.setLayout( new BorderLayout() );
		p_serverName.add( new JLabel("서버입력 : "),"West" );
		p_serverName.add(connTF, "Center");
		p_serverName.add(connB, "East");

		JPanel p_north = new JPanel();
		p_north.setLayout( new GridLayout(1, 2));
		p_north.add( p_changeName );
		p_north.add( p_serverName );

		JPanel p2 = new JPanel();
		p2.setLayout( new BorderLayout() );
		p2.add( new JLabel("메세지입력 : "),"West" );
		p2.add(sendTF,"Center");
		p2.add(sendB, "East");
		
		// 추가2 : 방인원의 대명 보여주기
		memberList = new JList();
		list		= new Vector();
		JPanel  p_east = new JPanel();
		p_east.setLayout( new BorderLayout());
		p_east.add("North", new JLabel("   우 리 방 멤 버   "));
		p_east.add("Center", memberList );
		p_east.add("South", delete );
		


		f.getContentPane().add("North", p_north);
		scrl = new JScrollPane(ta);
		f.getContentPane().add("Center", scrl);
		f.getContentPane().add("South", p2);
		f.getContentPane().add("East", p_east);
		
//		ta.setCaretPosition(ta.getDocument().getLength());
		//f.setSize(500, 300);
		f.pack();
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				exitRoom();			
			}
			
		});
		connTF.addActionListener(this);
		connB.addActionListener(this);
		sendTF.addActionListener(this);
		sendB.addActionListener(this);
		delete.addActionListener(this);
		//  추가0: 대화명 바꾸기
		changeNameTF.addActionListener(this);
		changeNameB.addActionListener(this);
		
		
	}// 생성자 종료
	
	public void actionPerformed( ActionEvent e ) {
		Object o = e.getSource();

		if( o == connTF || o == connB ) {
			connProc();
		}
		
		else if( o == sendTF || o == sendB ) {
			sendProc();
		}

		//  추가0: 대화명 바꾸기
		else if( o == changeNameTF || o == changeNameB ) {
			changeNameProc();
		}else if( o == delete ){
			
		}
		
	} // actionPerformed ends
	
	void deleteMember(){
		String msg = (String) memberList.getSelectedValue();
		
	}
	
	void changeNameProc(){
//		JOptionPane.showMessageDialog(null, "대화명바꾸기");
		String msg = "/name " + changeNameTF.getText() + "\n";
		try{
		out.write(msg.getBytes());
		}catch(Exception ex){
			System.out.println("별칭부여실패 : " + ex.getMessage());
		}
	}

	void connProc() {
		//JOptionPane.showMessageDialog(null, "서버연결");
		//1.소켓생성 (서버IP, 서버 PORT )
		//2.입출력 스트립 얻어오기
		try{
			s = new Socket( connTF.getText(), 1234);
		in = new BufferedReader( new InputStreamReader (s.getInputStream()) );			//byte형을 문자형으로 변환해주는
		out = s.getOutputStream();
		new Thread( this ).start();
		enterRoom();
		}catch(Exception ex){
			ta.append("접속실패 : " + ex.getMessage());
		}
	} // connProc ends
	
		void enterRoom(){
			String msg = "/start " + changeNameTF.getText() + "\n";
			try{
				out.write(msg.getBytes());
			}catch(Exception ex){
				System.out.println("방에 입장하지 못하였습니다" + ex.getMessage());
			}
		}
		
		void exitRoom(){
			String msg = "/exit " + changeNameTF.getText() + "\n";
			try{
				out.write(msg.getBytes());
			}catch(Exception ex){
				System.out.println("방에서 나가지 못하였습니다" + ex.getMessage());
			}
		}
	
	void sendProc() {
//		JOptionPane.showMessageDialog(null, "메세지보내기");
		String msg = sendTF.getText() + "\n";
		try{
		out.write(msg.getBytes());
		sendTF.setText(null);
		sendTF.requestFocus();
		}catch(Exception ex){
			System.out.println("전송실패 : " + ex.getMessage());
		}
	}// sendProc ends

	public void run()	{
		while( s != null ){
			try{
				String msg = in.readLine();
				
				//서버로 온 신호 감지
				StringTokenizer st = new StringTokenizer(msg);
				String temp = st.nextToken();
				if ( temp.equals("/member")) {
					
					list.removeAllElements();
					
					while(st.hasMoreTokens()) {
						list.addElement(st.nextToken());
						memberList.setListData(list);						
					}
					continue;
				}
								
				ta.append(msg+"\n");
			}catch(Exception ex){
				ta.append("읽기 실패: " + ex.getMessage() + "\n");
			}
			scrl.getVerticalScrollBar().setValue(scrl.getVerticalScrollBar().getMaximum());
		}
	}
	public static void main(String [] args ) {
		new ChatClient();
	}
	
}// ChatClient ends