/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcap.enums;

/**
 *
 * @author amit
 */
public enum Protocol {

	HTTP("http"),
	TCP("tcp"),
	UDP("udp");

	private final String userFriendlyName;

	private Protocol() {
		this.userFriendlyName = null;
	}

	private Protocol(String userFriendlyName) {
		this.userFriendlyName = userFriendlyName;
	}

	@Override
	public String toString() {
		return this.userFriendlyName;
	}

}
