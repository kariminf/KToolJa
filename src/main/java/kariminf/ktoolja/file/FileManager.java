/*
 * This file is part of KToolJa project
 * 
 * Copyright 2014-2015 Abdelkrime Aries <kariminfo0@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package kariminf.ktoolja.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * This class is used to manage files
 * 
 * @author Abdelkrime Aries
 */
public class FileManager {

	/**
	 * Save a text into a specified file
	 * @param filePath The path of the destiation file
	 * @param content The content to be saved
	 * @throws IOException The exception can be thrown when writing the content
	 */
	public static void saveFile(String filePath, String content)
			throws IOException {
		Writer out = new OutputStreamWriter(new FileOutputStream(filePath), "UTF-8");

		try {
			out.write(content);
		} finally {
			out.close();
		}
	}


	/**
	 * Read a textual files's content and return it
	 * @param file The file from which we want to read the text
	 * @return The content of the file as a text
	 */
	public static String readFile(File file) {
		try {
			String contents = "";

			BufferedReader input = new BufferedReader(new FileReader(file));
			
			String line = input.readLine();
			
			while (line != null){
				contents += line;
				line = input.readLine();
				if (line != null) 
					contents += System.lineSeparator();
			}

			input.close();

			return contents;

		} catch (IOException e) {
			//e.printStackTrace();
			//System.exit(1);
			System.err.println("Input/Output problem");
			return null;
		}
	}


	/**
	 * Create a folder; if the parents of the folder doesn't exist, they will be created as well
	 * @param folder The folder which we want to create
	 * @return true: if the folder is created. false: if the folder exists 
	 * or you haven't permission
	 */
	public static boolean createFolder(File folder) {

		if (folder.exists()) {
			System.err.println("The directory already exists");
			// System.out.println("The directory already exists");
			return false;
		}

		try {
			folder.mkdirs();
		} catch (SecurityException se) {
			System.err.println("Can't create the directory!!");
			//System.out.println("Can't create the directory!!");
			return false;
		}

		//System.out.println("folder" + dirName + "created");

		return true;
	}
	
	/**
	 * Delete a folder with all its content
	 * @param folder The folder which we want to delete
	 * @param force if this is false and the folder has content, it won't be deleted
	 * @return 
	 * true: if the folder doesn't exist, or deleted successfully.<br>
	 * false: if <ul>
	 * <li>the target is a file and not a directory</li>
	 * <li>if it has content and force is false</li>
	 * </ul>
	 */
	public static boolean deleteFolder(File folder, boolean force){
		
		if (! folder.exists()) return true;
		if (! folder.isDirectory()) return false;
		
		File[] files = folder.listFiles();
		
		if (!force && files.length > 0) return false;
		
		for(File file: files){
			if(file.isDirectory()){
				deleteFolder(file, true);
				continue;
			}
			file.delete();
		}
		folder.delete();
		return true;
	}

}
