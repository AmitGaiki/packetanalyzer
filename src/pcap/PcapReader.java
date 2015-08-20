/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcap;

import java.util.ArrayList;
import org.jnetpcap.Pcap;
import org.jnetpcap.PcapHeader;
import org.jnetpcap.packet.PcapPacket;
import org.jnetpcap.packet.PcapPacketHandler;
import pcap.util.ConfigProperties;

/**
 *
 * @author amit
 */
public class PcapReader {

	private ConfigProperties configProperties = new ConfigProperties();
	private Packet packet;

	public Packet getPacket() {
		return packet;
	}

	public void setPacket(Packet packet) {
		this.packet = packet;
	}

	public int getHeaderCount(Packet packet) {
		return packet.getHeaderCount();
	}

	public PcapHeader getPacketHeader(Packet packet) {
		return packet.getCaptureHeader();
	}

	public ArrayList<Packet> readFile() {

		int packetCount = 1000;

		String filename = configProperties.getPcapfile();
		StringBuilder stringBuilder = new StringBuilder();
		Pcap captor = Pcap.openOffline(filename, stringBuilder);
		if (captor == null) {
			System.out.println("Unable to open pcap file.");
			System.out.println(stringBuilder);
		}

		PcapPacketHandler<ArrayList<Packet>> handler = new PcapPacketHandler<ArrayList<Packet>>() {

			@Override
			public void nextPacket(PcapPacket pcapPacket, ArrayList<Packet> packets) {

				Packet packet = new Packet(pcapPacket);
				packets.add(packet);
			}
		};

		ArrayList<Packet> packets = new ArrayList<>();
		if (packetCount == 0) {
			captor.loop(Pcap.LOOP_INFINITE, handler, packets);
		} else {
			captor.loop(packetCount, handler, packets);
		}
		captor.close();
		return packets;
	}

}
