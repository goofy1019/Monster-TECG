package communication;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;

public class ComsManager {
	
	HostPlayer hplayer = null;
	GuestPlayer gplayer = null;
	DataOutputStream dos;
	DataInputStream dis;
	
	public ComsManager(int PORT) throws IOException {
		while(true) {
			try {
				hplayer = new HostPlayer(PORT);
				
				break;
			} catch (IOException e){
				e.printStackTrace();
			}
		}
	}
	
	public ComsManager(String ip, int PORT) throws IOException {
		InetAddress def_ip = InetAddress.getByName(ip);
		while(true) {
			try {
				gplayer = new GuestPlayer(def_ip, PORT);
				break;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}
	
	public String send(String message) throws IOException {
		dos.writeUTF(message);
		return message;
	}
	

}
