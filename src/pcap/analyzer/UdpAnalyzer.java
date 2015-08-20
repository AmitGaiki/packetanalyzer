/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcap.analyzer;

import java.util.List;
import pcap.Packet;

/**
 *
 * @author amit
 */
public class UdpAnalyzer {
    
    private List<Packet> udpPackets;
    private Packet packet;

    public Packet getPacket() {
        return packet;
    }

    public void setPacket(Packet packet) {
        this.packet = packet;
    }

    public List<Packet> getUdpPackets() {
        return udpPackets;
    }

    public void setUdpPackets(List<Packet> udpPackets) {
        this.udpPackets = udpPackets;
    }
    
}
