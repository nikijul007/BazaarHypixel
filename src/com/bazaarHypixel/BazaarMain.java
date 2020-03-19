package com.bazaarHypixel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BazaarMain {
	public static void main(String[] args) {
		String s = getkey();
	}
	
	public static String getkey() {
		String key = null;
		
		try {
		File file = new File("src/com/bazaarHypixel/ressources/ApiKey.dat");
		Scanner reader = new Scanner(file);
		
		while(reader.hasNextLine()) {
			key = reader.nextLine();
			System.out.println(key);
		}
		reader.close();
		} catch(FileNotFoundException e) {
			System.out.println("File not found!");
		}
		
		
		return key;
	}

}
