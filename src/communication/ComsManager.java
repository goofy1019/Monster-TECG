package communication;

import java.io.IOException;
import java.net.ServerSocket;

public class ComsManager {

	Object player;

	public ComsManager(int PORT) throws IOException {
		while (true) {
			try {
				player = new HostPlayer(PORT);
				break;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
