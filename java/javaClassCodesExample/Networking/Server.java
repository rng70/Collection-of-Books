package tcpobject;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private ServerSocket ServSock;
	
	Server() {
		try {
			ServSock = new ServerSocket(33333);
			while (true) {
				ServerThread m = new ServerThread(ServSock.accept());
			}
		}catch(Exception e) {
			System.out.println("Server starts:"+e);
		}
	}
	
	public static void main(String args[]) {
		Server objServer = new Server();
	}
}

class ServerThread implements Runnable {
	private Socket ClientSock;
	private Thread thr;
	private NetworkUtil nc;

	ServerThread(Socket client) {
		this.ClientSock = client;
		this.thr = new Thread(this);
		thr.start();
	}

	public void run() {
		this.nc=new NetworkUtil(ClientSock);
		new ReadThread(this.nc);
		new WriteThread(this.nc,"Server");			
	}
}

