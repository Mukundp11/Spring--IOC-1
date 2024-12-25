package com.nit;

public class ATM {

	private IPrinter printer;
	
	public ATM(IPrinter printer) {
		this.printer=printer;
	}
/*	public void setPrinter(IPrinter printer) {
		this.printer=printer;
	} */
	public String withdraw() {
		printer.print();
		return " withdraw successful..";
	}
}
