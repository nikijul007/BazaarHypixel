package com.bazaarHypixel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.bazaarHypixel.code.ActivateItems;
import com.bazaarHypixel.code.AllItems;

public class BazaarMain {
	
	static String key;
	public static final String RESSOURCES_PATH = "src/com/bazaarHypixel/ressources/";
	
	public static void main(String[] args) {
		ActivateItems items = new ActivateItems();
		
		for(AllItems item : AllItems.values()) {
			items.addItem(item.name());
		}
		
		items.saveItems();
		
		key = getkey();
	}

	public static String getkey() {
		String keyTemp = null;

		try {
			File file = new File(RESSOURCES_PATH+"ApiKey.dat");
			Scanner reader = new Scanner(file);

			while (reader.hasNextLine()) {
				keyTemp = reader.nextLine();
				System.out.println(keyTemp);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}

		return keyTemp;

	}

}
