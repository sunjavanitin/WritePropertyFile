package com.nitin.writepropertyfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertyFile {
	
	public static void main(String[] args) {
		try {
			Properties properties = new Properties();
			properties.setProperty("profile", "Java Developer");
			properties.setProperty("Location", "pune");
			

			File file = new File("nitin.properties");
			FileOutputStream fOut = new FileOutputStream(file);
			properties.store(fOut, "this is nitin.properties file");
			fOut.close();
			System.out.println("Done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	

}
