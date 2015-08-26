/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcap.analyzer;

import pcap.Packet;

/**
 *
 * @author amit
 * Holds the state of packet.
 */
public class PcapAnalyzer {
	
	//Store all packet fields that will be returned from various analyzers.
	private Packet packet;
	private int headers;
	
	public int setHeaderCount(){
		
		this.headers =  packet.getHeaderCount();
		return this.headers;
	}
	
	public void analyzePacket(){
		
		if(headers == 4){
			//send to application layer analyzer;
		}
		if(headers == 3){
			//send to transport layer analyzer;
		}
	}
	
}
