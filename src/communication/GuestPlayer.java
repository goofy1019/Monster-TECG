package communication;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 
 * @author Abner Arroyo y Adolfo Amador
 * This class is inherited from Socket. It is the way the ComsManager will create the player if the user
 * selects to play as Guest. It creates a socket to connect with player that chose to be host. 
 */

public class GuestPlayer extends Socket{
	private DataInputStream dis;
	private DataOutputStream dos;
	

	public GuestPlayer(InetAddress ip, int PORT) throws IOException {
		super(ip, PORT);
		this.dis = new DataInputStream(this.getInputStream());
		this.dos = new DataOutputStream(this.getOutputStream());
		
	}
	
	/**
	 * 
	 * @return dis
	 */
	public DataInputStream getDis() {
		return this.dis;
	}

	/**
	 * 
	 * @return dos
	 */
	public DataOutputStream getDos() {
		return this.dos;
	}


}
