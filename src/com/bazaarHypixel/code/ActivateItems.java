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
		selectedItems.add(name.toUpperCase());
	}
	
	public void addItem(String name, int position) {
		selectedItems.add(position-1, name.toUpperCase());
	}
	
	public ArrayList<String> getSelectedItems() {
		return selectedItems;
	}
	
	
	
}
