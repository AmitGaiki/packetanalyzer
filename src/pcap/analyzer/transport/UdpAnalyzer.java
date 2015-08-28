/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcap.analyzer.transport;

import java.util.List;
import org.jnetpcap.protocol.tcpip.Udp;
import pcap.Packet;

/**
 *
 * @author amit
 */
public class UdpAnalyzer extends TransportAnalyzer{
    
    private List<Packet> udpPackets;
    private Packet packet;
	private Udp udp = new Udp();

    public Packet getPacket() {
        return packet;
    }

    public void setPacket(Packet packet) {
        this.packet = packet;
		packet.getHeader(udp);
    }

    public List<Packet> getUdpPackets() {
        return udpPackets;
    }

    public void setUdpPackets(List<Packet> udpPackets) {
        this.udpPackets = udpPackets;
    }

	@Override
	public int getSourcePort() {
		return this.udp.source();
	}

	@Override
	public int getDestinationPort() {
		return this.udp.destination();
	}

	@Override
	public long getAckNumber() {
		return -1;
	}

	@Override
	public long getSeqNumber() {
		return -1;
	}
    
}
