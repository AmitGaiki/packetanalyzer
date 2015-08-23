/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.List;
import pcap.Packet;
import pcap.PcapReader;

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
		
		Packet packet = p.get(0);
		
		int headers = packet.getHeaderCount();
		System.out.println(headers);
		
		for(int i = 0; i < headers; i++){
			int id = packet.getHeaderIdByIndex(i);
			if(packet.hasHeader(id));
			
			System.out.println(id);
		}
		
//		PayloadRetreiver plr = new PayloadRetreiver();
//		byte[] ethpl = plr.getPayload(p.get(0), new Ethernet());
//		byte[] ip4pl = plr.getPayload(p.get(0), new Ip4());
//		byte[] tcppl = plr.getPayload(p.get(0), new Tcp());
//		byte[] httppl = plr.getPayload(p.get(0), new Http());
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
