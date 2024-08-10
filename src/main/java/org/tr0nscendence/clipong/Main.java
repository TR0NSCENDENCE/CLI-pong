package org.tr0nscendence.clipong;

import java.io.IOException;

public class Main {

	static {
		try {
			LibraryLoader.load("native");
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	public static void main(String[] args) {
		if (!TerminalManager.getInstance().isTTY()) {
			System.err.println("You should be running inside a TTY");
			System.exit(1);
		}
		System.out.println("Hello world !");
	}
}
