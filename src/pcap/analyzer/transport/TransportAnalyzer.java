/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcap.analyzer.transport;

/**
 *
 * @author amit
 */
public abstract class TransportAnalyzer {
	
	public abstract int getSourcePort();
	public abstract int getDestinationPort();
	public abstract long getAckNumber();
	public abstract long getSeqNumber();
	
	
}
