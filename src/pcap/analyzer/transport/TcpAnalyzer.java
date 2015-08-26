/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcap.analyzer.transport;

import java.util.List;
import org.jnetpcap.protocol.tcpip.Tcp;
import pcap.Packet;

/**
 *
 * @author amit
 */
public class TcpAnalyzer extends TransportAnalyzer{
    
    private List<Packet> tcpPackets;
    private Packet packet;
	private Tcp tcp = new Tcp();

    public Packet getPacket() {
        return packet;
    }

    public void setPacket(Packet packet) {
        this.packet = packet;
		packet.getHeader(tcp);
    }

    public List<Packet> getTcpPackets() {
        return tcpPackets;
    }

    public void setTcpPackets(List<Packet> tcpPackets) {
        this.tcpPackets = tcpPackets;
    }

	@Override
	public int getSourcePort() {
		return this.tcp.source();
	}

	@Override
	public int getDestinationPort() {
		return this.tcp.destination();
	}

	@Override
	public long getAckNumber() {
		return this.tcp.ack();
	}

	@Override
	public long getSeqNumber() {
		return this.tcp.seq();
	}
    
}
