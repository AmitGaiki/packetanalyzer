/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcap;

import org.jnetpcap.packet.JHeader;

/**
 *
 * @author amit
 */
public class PayloadRetriever {
	
	public byte[] getPayload(Packet packet, JHeader header){
		
		byte[] payload = null;
		if(packet.hasHeader(header)){
			if(header.hasPayload()){
				payload = header.getPayload();
			}
		}
		
		return payload;
	}
	
}
