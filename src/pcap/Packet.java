/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcap;

import java.io.Serializable;
import org.jnetpcap.packet.PcapPacket;

/**
 *
 * @author amit
 */
public class Packet extends PcapPacket implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * setter for Packet that instantiates the PcapPacket class by calling the
	 * constructor
	 *
	 * @param packet instance of PcapPacket
	 */
	public Packet(PcapPacket packet) {
		super(packet);
	}

	public Packet(byte[] packet) {
		super(packet);
	}
}
