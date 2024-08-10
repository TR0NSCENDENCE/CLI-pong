package org.tr0nscendence.clipong;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;

public class LibraryLoader {
	public static void load(String name) throws IOException {
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
}
