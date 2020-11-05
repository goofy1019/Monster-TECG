package communication;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;

/**
 * This class' purpose is to provide communication between the two players of the game
 * 
 * @author Abner Arroyo y Adolfo Amador
 *
 */
public class ComsManager {
	
	HostPlayer hplayer = null;
	GuestPlayer gplayer = null;
	DataOutputStream dos;
	DataInputStream dis;
	
	/**
	 * Constructor with port as parameter. It is created this way if the user selects to play as guest. It sets the 
	 * Data output and input streams to math the selected player (Host or Guest)
	 * @param PORT
	 * @throws IOException
	 */
	public ComsManager(int PORT) throws IOException {
		while(true) {
			try {
				this.hplayer = new HostPlayer(PORT);
				this.dos = hplayer.getDos();
				this.dis = hplayer.getDis();
				break;
			} catch (IOException e){
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Constructor with ip and port as parameters. It is created this way if the user selects to play as guest. It sets the 
	 * Data output and input streams to math the selected player (Host or Guest)
	 * 
	 * @param ip
	 * @param PORT
	 * @throws IOException
	 */
	public ComsManager(String ip, int PORT) throws IOException {
		InetAddress def_ip = InetAddress.getByName(ip);
		while(true) {
			try {
				this.gplayer = new GuestPlayer(def_ip, PORT);
				this.dos = gplayer.getDos();
				this.dis = gplayer.getDis();
				break;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}
	
	/**
	 * This method sends a message through the DataOutPutStream
	 * 
	 * @param message
	 * @return message
	 * @throws IOException
	 */
	public String send(String message) throws IOException {
		dos.writeUTF(message);
		return message;
	}
	

}
