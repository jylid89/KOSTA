package network.chat;


import java.io.*;
import java.util.*;
import java.net.*;

public class ChatServer implements Runnable {
	ArrayList<ChatService> vc = new ArrayList<ChatService>();

	public void run() {
		ServerSocket ss = null;
		try{
			ss = new ServerSocket(1234);
		}catch( Exception e ) {
			System.out.println(e);
		}

		while(true) {
			try{
				Socket s = ss.accept();
				System.out.println("Client 가 접속시도 :" + s );
				ChatService cs = new ChatService(s);
				cs.start();
				vc.add(cs);

			} catch( Exception e ) { }
		}
	}  // run ends

	public static void main( String [] arg ) {
		ChatServer cs = new ChatServer();
		new Thread(cs).start();
	}

	class ChatService extends Thread {
		String myname = "quest";
		BufferedReader in;
		OutputStream out;
		ChatService( Socket s ) {
			try{
				in = new BufferedReader( new InputStreamReader(s.getInputStream()));
				out = s.getOutputStream();
			}catch( Exception e ) { }
		}// 생성자 종료



		public void run() {
			while(true) {
				try{
					String msg = in.readLine();
					if( msg == null || msg.equals("")) continue;

					StringTokenizer st = new StringTokenizer(msg);
					if( st.countTokens() > 1 ) {
						String temp = st.nextToken();

						if( temp.equalsIgnoreCase("/name" )) {
							temp = st.nextToken();
							putMessageAll(myname + "님의 이름이 " + temp + "으로 바뀌었습니다.");
							myname = temp;
							MakeMembers();
							continue;
						}
						//"/start 바고\n
						else if( temp.equals("/start")){
							myname = st.nextToken();
							putMessageAll(myname + "님의 이 들어왔습니다");

							MakeMembers();
							continue;
						}//end of else if
						else if( temp.equals("/exit")){
							myname = st.nextToken();
							putMessageAll(myname + "님이 나가셨습니다");
							removeMember(myname);
							MakeMembers();
							continue;
						}//end of else if
					}//end of if

					putMessageAll( myname + ">" + msg );


				}catch( Exception ex ) { return; }
			}//end of while
		}//end of run

		void removeMember( String rn ) {
			for (int i = 0; i < vc.size(); i++) {
			ChatService cs = ( ChatService ) vc.get(i);
				if (rn.equals(cs.myname) ) {
					vc.remove(i);
				}
			}
		}
		
		void MakeMembers(){
			String msg = "/member "; // /member 난천재
			//		for (int i = 0; i < vc.size(); i++) {
			//			ChatService sc = (ChatService)vc.get(i);
			//		}
			for(ChatService sc : vc ){
				msg += sc.myname + " ";
			}
			putMessageAll(msg);
		}

		void putMessageAll( String msg ) {
			for( int i =0 ; i<vc.size() ; i++ ) {
				ChatService cs = ( ChatService ) vc.get(i);
					
				try {
					cs.putMessage(msg);
				}catch( Exception e ) {
					vc.remove(i--);
				}
			}
		} // putMessageAll ends


		void putMessage( String msg )
				throws Exception {
			out.write( (msg+"\r\n").getBytes() );
		}

	} // ChatService class ends


}// ChatServer class ends
