package jangjichan;

import java.net.*;
import java.net.*;


public class ReceiveSetData {
	public String msg, ip, id;
	
	public ReceiveSetData(DatagramPacket pack) {
		byte[] buff = pack.getData();
		msg = new String(buff, 0, buff.length);
		
		InetAddress addr = pack.getAddress();
		ip = addr.getHostAddress();
		id = addr.getHostName();
		
	}

}
