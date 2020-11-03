package communication;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataOutputStream;
import java.io.DataInputStream;

public class HostPlayer extends ServerSocket{

	private Socket socket = null;
	private DataInputStream dis = null;
	private DataOutputStream dos = null;
	
	public HostPlayer(int PORT) throws IOException {
		super(PORT);
		this.socket = super.accept();
		this.dis = new DataInputStream(this.socket.getInputStream());
		this.dos = new DataOutputStream(this.socket.getOutputStream());
		
		
	}

}
