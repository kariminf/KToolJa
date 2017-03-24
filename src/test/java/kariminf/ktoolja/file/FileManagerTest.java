package kariminf.ktoolja.file;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;

public class FileManagerTest {
	
	static String tstFldr = 
			System.getProperty("user.home") + File.separator + "tstFldr";
	static String msg = "It works!!";
	
	static String tstFile = tstFldr + File.separator + "tstFile.txt";

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCreateFolder() {
		FileManager.deleteFolder(new File(tstFldr), true);
		assertEquals(true, FileManager.createFolder(new File(tstFldr)));
		assertFalse(FileManager.createFolder(new File(tstFldr)));
	}
	
	@Test
	public void testSaveFile() {
		
		try {
			FileManager.saveFile(tstFile, msg);
		} catch (IOException e) {
			fail("The method must save the file");
		}
	}
	
	@Test
	public void testReadFile() {
		assertEquals(msg, FileManager.readFile(new File(tstFile)));
	}
	
	@Test
	public void testDeleteFolder() {
		assertTrue(FileManager.deleteFolder(new File(tstFldr), true));
	}

}
