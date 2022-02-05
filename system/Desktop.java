package org.system;

public class Desktop {
	public void desktopSize() {
		System.out.println("My desktop size is 15inches");
	}
	public static void main(String[] args) {
		Computer comp = new Computer();
		Desktop desk = new Desktop();
		comp.computerModel();
		desk.desktopSize();
	}

}
