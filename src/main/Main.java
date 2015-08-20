/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.List;
import pcap.Packet;
import pcap.PcapClassifier;
import pcap.PcapReader;
import pcap.enums.Protocol;
import pcap.util.Pair;

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

		PcapClassifier pcapClassifier = new PcapClassifier();
//        pcapClassifier.setPackets(p);
		List<Pair<Packet, Protocol>> pp = pcapClassifier.classifyPackets(p);
		for (Pair pair : pp) {
			Packet pkt = (Packet) pair.getKey();
			System.out.println(pkt.getHeaderCount());
			System.out.println(pair.getValue());
		}
	}

}
