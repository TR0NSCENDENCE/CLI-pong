package org.tr0nscendence.clipong;

public class TerminalManager {
	private static final TerminalManager instance = new TerminalManager();
	private final boolean IS_TTY;

	private TerminalManager() {
		IS_TTY = isatty();
	}

	public boolean isTTY() {
		return (IS_TTY);
	}

	public static TerminalManager getInstance() {
		return (instance);
	}

	private native boolean isatty();
}
