/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcap.analyzer.network;

import java.util.List;
import org.jnetpcap.protocol.network.Ip4;
import pcap.Packet;

/**
 *
 * @author amit
 */
public class Ipv4 extends NetworkAnalyzer{
	
	private List<Packet> tcpPackets;
    private Packet packet;
	private Ip4 ip4 = new Ip4();

	public Packet getPacket() {
        return packet;
    }

    public void setPacket(Packet packet) {
        this.packet = packet;
		packet.getHeader(ip4);
    }
	
	@Override
	public byte[] getSource() {
		return this.ip4.source();
	}

	@Override
	public byte[] getDestination() {
		return this.ip4.destination();
	}
	
	@Override
	public int getVersion(){
		return this.ip4.version();
	}
	
	@Override
	public int getHeaderLength(){
		return this.ip4.hlen();
	}
	
	@Override
	public int getLength(){
		return this.ip4.length();
	}
	
	@Override
	public int getId(){
		return this.ip4.id();
	}
	
	@Override
	public int getFlags(){
		return this.ip4.flags();
	}
	
	@Override
	public int getOffset(){
		return this.ip4.offset();
	}
	
	@Override
	public int getChecksum(){
		return this.ip4.checksum();
	}
	
	
}
