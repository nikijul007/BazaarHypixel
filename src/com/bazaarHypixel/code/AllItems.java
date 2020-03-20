package com.bazaarHypixel.code;

public enum AllItems {

	COCOA_BEANS("COCOA_BEANS", "INK_SACK:3", 0),
	ENCHANTED_CHICKEN("ENCHANTED_CHICKEN", "ENCHANTED_RAW_CHICKEN", 1),
	BROWN_MUSHROOM("BROWN_MUSHROOM", "BROWN_MUSHROOM", 2),
	ENCHANTED_WATER_LILY("ENCHANTED_WATER_LILY", "ENCHANTED_WATER_LILY", 3),
	LAPIS_LAZULI("LAPIS_LAZULI", "INK_SACK:3", 4),
	TARATULA_WEB("TARATULA_WEB", "TARANTULA_WEB", 5),
	CARROT("CARROT", "CARROT_ITEM", 6),
	ENCHANTED_POTATO("ENCHANTED_POTATO", "ENCHANTED_POTATO", 7),
	SPRUCE_WOOD("SPRUCE_WOOD", "LOG:1", 8),
	ENCHANTED_SLIME_BALL("ENCHANTED_SLIME_BALL", "ENCHANTED_SLIME_BALL", 9),
	ENCHANTED_GOLDEN_CARROT("ENCHANTED_GOLDEN_CARROT", "ENCHANTED_GOLDEN_CARROT", 10),
	JUNGLE_WOOD("JUNGLE_WOOD", "LOG:3", 11),
	BIRCH_WOOD("BIRCH_WOOD", "LOG:2", 12);
	

	private String name;
	private String apiName;
	private int id;

	private AllItems(String name, String apiName, int id) {
		this.name = name;
		this.apiName = apiName;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public String getApiName() {
		return apiName;
	}

	public int getId() {
		return id;
	}
}
