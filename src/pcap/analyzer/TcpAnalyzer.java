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
public class TcpAnalyzer {
    
    private List<Packet> tcpPackets;
    private Packet packet;

    public Packet getPacket() {
        return packet;
    }

    public void setPacket(Packet packet) {
        this.packet = packet;
    }

    public List<Packet> getTcpPackets() {
        return tcpPackets;
    }

    public void setTcpPackets(List<Packet> tcpPackets) {
        this.tcpPackets = tcpPackets;
    }
    
}
