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
public class HttpAnalyzer {
    
    private List<Packet> httpPackets;
    private Packet packet;
    
    public Packet getPacket() {
        return packet;
    }

    public void setPacket(Packet packet) {
        this.packet = packet;
    }

    public List<Packet> getHttpPackets() {
        return httpPackets;
    }

    public void setHttpPackets(List<Packet> httpPackets) {
        this.httpPackets = httpPackets;
    }
    
}
