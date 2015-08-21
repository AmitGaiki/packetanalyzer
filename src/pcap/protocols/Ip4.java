/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcap.protocols;

import org.jnetpcap.packet.JHeader;
import org.jnetpcap.packet.JHeaderChecksum;
import org.jnetpcap.protocol.JProtocol;

/**
 *
 * @author amit
 */
public class Ip4 extends JHeader implements JHeaderChecksum{
	
	public static final int ID = JProtocol.IP4_ID;

	@Override
	public int checksum() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public int calculateChecksum() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public boolean isChecksumValid() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
}
