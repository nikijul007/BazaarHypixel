package com.bazaarHypixel.code;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import com.bazaarHypixel.BazaarMain;

public class ActivateItems {
	private ArrayList<String> selectedItems = new ArrayList<String>();
	
	public void saveItems() {
		
		try{ 
		
			File file = new File(BazaarMain.RESSOURCES_PATH + "ShowedItems.dat");
			file.createNewFile();
			
			FileWriter writer = new FileWriter(file);
			BufferedWriter bWriter = new BufferedWriter(writer);
			
			for(String item : selectedItems) {
				bWriter.write(item);
				bWriter.newLine();
			}
			bWriter.close();
			
		} catch (Exception e) {
			System.out.println("FEHLER!");
			
		}	
	}
	
	public void addItem(String name) {
		name = name.toUpperCase();
		if(!selectedItems.contains(name)) {
		selectedItems.add(name);
		} else {
			System.out.println(name + " ist bereits vorhanden!");
		}
	}
	
	public void addItem(String name, int position) {
		name = name.toUpperCase();
		
		if(!selectedItems.contains(name)) {
		selectedItems.add(position-1, name);
		} else {
			System.out.println(name + " wird verschoben!");
			selectedItems.remove(name);
			selectedItems.add(position - 1, name);
		}
	}
	
	public ArrayList<String> getSelectedItems() {
		return selectedItems;
	}
	
	
	
}
