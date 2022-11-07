package br.edu.ifsuldeminas.sd.sockets.client;

public class MainClient {
	private static final int TIME_OUT = 5000;
	private static int SERVER_PORT = 3000;
	private static int BUFFER_SIZE = 200;
	private static String KEY_TO_EXIT = "q";
	
	public static void main(String[] args) {
			try {
				UDPClient.start(TIME_OUT,SERVER_PORT,BUFFER_SIZE,KEY_TO_EXIT);
			} catch (UDPClientException udpClientException) {
				System.err.println(udpClientException.getMessage());
				udpClientException.printStackTrace();
			}
	}

}
