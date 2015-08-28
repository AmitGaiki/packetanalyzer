/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcap.analyzer.link;

import java.util.List;
import org.jnetpcap.protocol.lan.Ethernet;
import pcap.Packet;

/**
 *
 * @author amit
 */
public class EthernetAnalyzer extends LinkAnalyzer{
	
	private List<Packet> tcpPackets;
    private Packet packet;
	private Ethernet ethernet = new Ethernet();

	public Packet getPacket() {
        return packet;
    }

    public void setPacket(Packet packet) {
        this.packet = packet;
		packet.getHeader(ethernet);
    }
	
	@Override
	public byte[] getSource() {
		return this.ethernet.source();
	}

	@Override
	public byte[] getDestination() {
		return this.ethernet.destination();
	}
	
}
