/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcap;

import java.util.ArrayList;
import java.util.List;
import org.jnetpcap.packet.JHeader;
import org.jnetpcap.protocol.tcpip.Http;
import org.jnetpcap.protocol.tcpip.Udp;
import pcap.analyzer.HttpAnalyzer;
import pcap.analyzer.UdpAnalyzer;
import pcap.enums.Protocol;
import pcap.util.Pair;

/**
 *
 * @author amit
 */
public class PcapClassifier {

	List<Packet> packets;
	PcapReader pcapReader = new PcapReader();

	public List<Packet> getPackets() {
		return packets;
	}

	public void setPackets(List<Packet> packets) {
		this.packets = packets;
	}

	public List<Pair<Packet, Protocol>> classifyPackets(List<Packet> packets) {

		List<Pair<Packet, Protocol>> packetProtocols = new ArrayList<>();

		for (Packet packet : packets) {

			if (packet.hasHeader(Http.ID)) {
				Pair pair = new Pair(packet, Protocol.HTTP);
				packetProtocols.add(pair);
				HttpAnalyzer httpAnalyzer = new HttpAnalyzer();
				httpAnalyzer.setPacket(packet);
			}
			else if (packet.hasHeader(Udp.ID)) {
				Pair pair = new Pair(packet, Protocol.UDP);
				packetProtocols.add(pair);
				UdpAnalyzer udpAnalyzer = new UdpAnalyzer();
				udpAnalyzer.setPacket(packet);
			}
		}
		return packetProtocols;
	}
	
	public byte[] getPayload(JHeader header, Packet packet){
		
		byte[] payload = null;
		if(packet.hasHeader(header)){
			if(header.hasPayload()){
				payload = header.getPayload();
			}
		}
		
		return payload;
		
	}
}
