/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcap.analyzer.link;

/**
 *
 * @author amit
 */
public abstract class LinkAnalyzer {
	
	public abstract byte[] getSource();
	public abstract byte[] getDestination();
	
}
