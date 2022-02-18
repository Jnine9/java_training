package com.scm.javatrainning.day5;

import java.io.*;


/**
 * <h2> TestJavaIO Class</h2>
 * <p>
 * Process for Displaying TestJavaIO
 * </p>
 * 
 * @author Acer
 *
 */
public class TestJavaIO {
	
	/**
	 * <h2> file</h2>
	 * <p>
	 * to select file.
	 * </p>
	 */
	File file;
	/**
	 * <h2> finput</h2>
	 * <p>
	 * To input a file.
	 * </p>
	 */
	FileInputStream finput;
	/**
	 * <h2> fout</h2>
	 * <p>
	 * To output a file.
	 * </p>
	 */
	FileOutputStream fout;
	
	/**
	 * <h2> contentbyte</h2>
	 * <p>
	 * Bytes of content.
	 * </p>
	 */
	byte[] contentbyte;
	/**
	 * <h2> writeFile</h2>
	 * <p>
	 * Write content to specify file.
	 * </p>
	 *
	 * @param filedistination - String
	 * @param content - String
	 * @return void
	 * @throws IOException 
	 */
	public void writeFile(String filedistination,String content) throws IOException {
		file = new File(filedistination);
		fout = new FileOutputStream(file);
		contentbyte = content.getBytes();
		fout.write(contentbyte);
		fout.close();
	}
	/**
	 * <h2> readFile</h2>
	 * <p>
	 * Read content from file.
	 * </p>
	 *
	 * @param filename - String
	 * @return
	 * @return String
	 */
	public String readFile(String filename) throws IOException {
		String filecontent = "";
		file = new File(filename);
		finput = new FileInputStream(file);
		int i = 0;
		while((i = finput.read())!=-1) {
			filecontent += (char)i;
		}
		finput.close();
		return filecontent;
	}
	/**
	 * <h2> convertByteToString</h2>
	 * <p>
	 * Read byte and convert into String.
	 * </p>
	 *
	 * @param bytes - byte array
	 * @return
	 * @throws IOException
	 * @return String
	 */
	public String convertByteToString(byte[] bytes) throws IOException {
		String res = "";
		ByteArrayInputStream bytai = new ByteArrayInputStream(bytes);
		int i = 0;
		while((i = bytai.read())!=-1) {
			res += (char) i;
		}
		return res;
	}
	/**
	 * <h2> main</h2>
	 * <p>
	 * Main method to run program.
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestJavaIO io = new TestJavaIO();
		String fileloc = "D:\\git\\java_training\\basic_learning\\src\\com\\scm\\javatrainning\\day5\\Files\\test.txt";
		try {
			System.out.println("Current File content : \n" + io.readFile(fileloc));
			String updateFile = "SCM Java Training\nUpdate File.";
			io.writeFile(fileloc, updateFile);
			String filecontent = io.readFile(fileloc);
			byte[] byt = filecontent.getBytes();
			System.out.println("Read File as Byte and convert to String : \n" + io.convertByteToString(byt));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No file found.\nReason : " + e.getMessage());
		}
	}

}
