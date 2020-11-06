package communication;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataOutputStream;
import java.io.DataInputStream;


/**
 * 
 * @author Abner Arroyo y Adolfo Amador
 * 
 * This class is inherited from ServerSocket. It creates a ServerSOcket and ONE socket with a client (the guest).It is the way the ComsManager will create the player if the user
 * selects to play as Host
 *
 */
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
	/**
	 * Getter for the DataInputStream
	 * @return dis
	 */
	public DataInputStream getDis() {
		return this.dis;
	}

	/**
	 * Getter for the DataOutputStream
	 * @return dos
	 */
	public DataOutputStream getDos() {
		return this.dos;
	}

}
