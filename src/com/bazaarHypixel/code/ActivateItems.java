package com.bazaarHypixel.code;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import com.bazaarHypixel.BazaarMain;

public class ActivateItems {
	private ArrayList<String> selectedItems = new ArrayList<String>();

	public ArrayList<String> loadItems() {
		String item = null;
		ArrayList<String> items = new ArrayList<String>();

		try {
			File file = new File(BazaarMain.RESSOURCES_PATH + "ShowedItems.dat");
			Scanner reader = new Scanner(file);

			while (reader.hasNextLine()) {
				item = reader.nextLine();
				items.add(item);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}

		return items;
	}

	public void saveItems() {
		try {

			File file = new File(BazaarMain.RESSOURCES_PATH + "ShowedItems.dat");
			file.createNewFile();

			FileWriter writer = new FileWriter(file);
			BufferedWriter bWriter = new BufferedWriter(writer);

			for (String item : selectedItems) {
				bWriter.write(item);
				bWriter.newLine();
			}
			bWriter.close();

		} catch (Exception e) {
			System.out.println("FEHLER!");

		}
	}

	public void addItem(String name) {
		selectedItems = loadItems();
		name = name.toUpperCase();
		if (!selectedItems.contains(name)) {
			selectedItems.add(name);
		}
		saveItems();
	}

	public void addItem(String name, int position) {
		selectedItems = loadItems();
		name = name.toUpperCase();

		if (!selectedItems.contains(name)) {
			selectedItems.add(position - 1, name);
		} else {
			selectedItems.remove(name);
			selectedItems.add(position - 1, name);
		}
		saveItems();
	}

	public ArrayList<String> getSelectedItems() {
		selectedItems = loadItems();
		return selectedItems;
	}

}
