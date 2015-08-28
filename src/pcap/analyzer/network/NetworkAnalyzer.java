/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcap.analyzer.network;

/**
 *
 * @author amit
 */
public abstract class NetworkAnalyzer {
	
	public abstract byte[] getSource();

	public abstract byte[] getDestination();
	
	public abstract int getVersion();
	
	public abstract int getHeaderLength();
	
	public abstract int getLength();
	
	public abstract int getId();
	
	public abstract int getFlags();
	
	public abstract int getOffset();
	
	public abstract int getChecksum();
	
}
