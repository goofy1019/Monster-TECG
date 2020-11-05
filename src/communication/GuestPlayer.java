package communication;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;


public class GuestPlayer extends Socket{
	private DataInputStream dis;
	private DataOutputStream dos;
	

	public GuestPlayer(InetAddress ip, int PORT) throws IOException {
		super(ip, PORT);
		this.dis = new DataInputStream(this.getInputStream());
		this.dos = new DataOutputStream(this.getOutputStream());
		
	}
	public DataInputStream getDis() {
		return dis;
	}

	public DataOutputStream getDos() {
		return dos;
	}


}
