/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.List;
import org.jnetpcap.protocol.lan.Ethernet;
import org.jnetpcap.protocol.network.Ip4;
import org.jnetpcap.protocol.tcpip.Http;
import org.jnetpcap.protocol.tcpip.Tcp;
import pcap.Packet;
import pcap.PayloadRetriever;
import pcap.reader.PcapReader;

/**
 *
 * @author amit
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		PcapReader pcapReader = new PcapReader();
		List<Packet> p = pcapReader.readFile();

//		PcapClassifier pcapClassifier = new PcapClassifier();
//        pcapClassifier.setPackets(p);
//		List<Pair<Packet, Protocol>> pp = pcapClassifier.classifyPackets(p);
//		for (Pair pair : pp) {
//			Packet pkt = (Packet) pair.getKey();
//			System.out.println(pkt.getHeaderCount());
//			System.out.println(pair.getValue());
//		}
//		
//		Packet packet = p.get(0);
//		
//		int headers = packet.getHeaderCount();
//		System.out.println(headers);
//		
//		for(int i = 0; i < headers; i++){
//			int id = packet.getHeaderIdByIndex(i);
//			if(packet.hasHeader(id));
//			
//			System.out.println(id);
//		}
		
		Packet packet = p.get(0);
		PayloadRetriever plr = new PayloadRetriever();
		byte[] ethpl = plr.getPayload(packet, new Ethernet());	
		byte[] ip4pl = plr.getPayload(packet, new Ip4());
		byte[] tcppl = plr.getPayload(packet, new Tcp());
		byte[] httppl = plr.getPayload(packet, new Http());
//		
//		for(int i = 0; i < ethpl.length; i++){
//			System.out.print(ethpl[i]);
//		}
//		System.out.println();
//		for(int i = 0; i < ip4pl.length; i++){
//			System.out.print(ip4pl[i]);
//		}
//		System.out.println();
//		for(int i = 0; i < tcppl.length; i++){
//			System.out.print(tcppl[i]);
//		}
//		System.out.println();
//		for(int i = 0; i < httppl.length; i++){
//			System.out.print(httppl[i]);
//		}
//		System.out.println();

	}

}
