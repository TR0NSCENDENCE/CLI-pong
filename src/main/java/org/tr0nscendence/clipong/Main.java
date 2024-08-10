package org.tr0nscendence.clipong;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;

public class Main {

	static {
		try {
			loadLibrary("native");
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	public static void main(String[] args) {
		sayHello();
	}

	public static void loadLibrary(String name) throws Exception {
		URL		libraryUrl;
		File	tmpDir;
		File	nativeLibTmpFile;

		libraryUrl = Main.class.getResource("/" + name + ".so");
		tmpDir = Files.createTempDirectory("cli-pong-native-libs").toFile();
		tmpDir.deleteOnExit();
		nativeLibTmpFile = new File(tmpDir, name);
		nativeLibTmpFile.deleteOnExit();
		try (InputStream in = libraryUrl.openStream()) {
			Files.copy(in, nativeLibTmpFile.toPath());
		}
		System.load(nativeLibTmpFile.getAbsolutePath());
	}

	private static native void sayHello();
}
