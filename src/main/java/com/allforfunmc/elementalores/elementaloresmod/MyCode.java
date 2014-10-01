

public class MyCode {
// item and block declaration gohere
	public static Block fireOre;
	public static Block iceore;
	public static Block lightningore;
	public static Block fireblock;
	public static Block iceblock;
	public static Block lightningblock;
	public static Item firecrystal;
	public static Item icecrystal;
	public static Item lightningcrystal;
	public static Item firepick;
	public static Item icepick;
	public static Item lightningpick;
	public static Item lightningshovel;
	public static Item lightningsword;
	public static Item lightningaxe;
	public static Item lightninghoe;
	public static Item firehoe;
	public static Item firesword;
	public static Item fireshovel;
	public static Item fireaxe;
	public static Item iceaxe;
	public static Item icehoe;
	public static Item icesword;
	public static Item iceshovel;
	public static ToolMaterial fireMaterial;
    public static ToolMaterial iceMaterial;
    public static ToolMaterial lightningMaterial;
    public static ArmorMaterial myArmorMaterial;
    
   
    
    public static Item FlameHelmet;
    public static Item FlamePlate;
    public static Item FlameLegs;
    public static Item FlameBoots;
    
    public static Item IceHelmet;
    public static Item IcePlate;
    public static Item IceLegs;
    public static Item IceBoots;
    
    
    public static Item LightningHelmet;
    public static Item LightningPlate;
    public static Item LightningLegs;
    public static Item LightningBoots;
    
	public static void MyBlocks(){
		//block code goes here
		
	}
	
	public static void MyRecipes(){
		//shapeless Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(icecrystal, 1),new ItemStack(iceore));
		GameRegistry.addShapelessRecipe(new ItemStack(iceblock, 1),new ItemStack(icecrystal, 9));
		GameRegistry.addShapelessRecipe(new ItemStack(fireblock, 1),new ItemStack(firecrystal, 9));
		GameRegistry.addShapelessRecipe(new ItemStack(lightningblock, 1),new ItemStack(lightningcrystal, 9));
		//shaped Recipes
		
		GameRegistry.addRecipe(new ItemStack(icepick), new Object[]{
			"AAA",
			" B ",
			" B ",
			'A', new ItemStack(icecrystal), 'B', new ItemStack(Items.stick)});
		
		GameRegistry.addRecipe(new ItemStack(lightningpick), new Object[]{
			"AAA",
			" B ",
			" B ",
			'A', new ItemStack(lightningcrystal), 'B', new ItemStack(Items.stick)});
		
		GameRegistry.addRecipe(new ItemStack(iceshovel), new Object[]{
		"A  ",
		"B  ",
		"B  ",
		'A', new ItemStack(icecrystal), 'B', new ItemStack(Items.stick)});

		GameRegistry.addRecipe(new ItemStack(lightningshovel), new Object[]{
		"A  ",
		"B  ",
		"B  ",
		'A', new ItemStack(lightningcrystal), 'B', new ItemStack(Items.stick)});
		
		
		GameRegistry.addRecipe(new ItemStack(iceshovel), new Object[]{
		" A ",
		" B ",
		" B ",
		'A', new ItemStack(icecrystal), 'B', new ItemStack(Items.stick)});

		GameRegistry.addRecipe(new ItemStack(lightningshovel), new Object[]{
		" A ",
		" B ",
		" B ",
		'A', new ItemStack(lightningcrystal), 'B', new ItemStack(Items.stick)});
		
		GameRegistry.addRecipe(new ItemStack(iceshovel), new Object[]{
		"  A",
		"  B",
		"  B",
		'A', new ItemStack(icecrystal), 'B', new ItemStack(Items.stick)});

		GameRegistry.addRecipe(new ItemStack(lightningshovel), new Object[]{
		"  A",
		"  B",
		"  B",
		'A', new ItemStack(lightningcrystal), 'B', new ItemStack(Items.stick)});
		
		GameRegistry.addRecipe(new ItemStack(icesword), new Object[]{
				"A  ",
				"A  ",
				"B  ",
			    'A', new ItemStack(icecrystal), 'B', new ItemStack(Items.stick)});
		
		GameRegistry.addRecipe(new ItemStack(icesword), new Object[]{
			" A ",
			" A ",
			" B ",
		    'A', new ItemStack(icecrystal), 'B', new ItemStack(Items.stick)});
		
		GameRegistry.addRecipe(new ItemStack(icesword), new Object[]{
			"  A",
			"  A",
			"  B",
		    'A', new ItemStack(icecrystal), 'B', new ItemStack(Items.stick)});
	
	GameRegistry.addRecipe(new ItemStack(lightningsword), new Object[]{
		"A  ",
		"A  ",
		"B  ",
	    'A', new ItemStack(lightningcrystal), 'B', new ItemStack(Items.stick)});

GameRegistry.addRecipe(new ItemStack(lightningsword), new Object[]{
	" A ",
	" A ",
	" B ",
    'A', new ItemStack(lightningcrystal), 'B', new ItemStack(Items.stick)});

GameRegistry.addRecipe(new ItemStack(lightningsword), new Object[]{
	"  A",
	"  A",
	"  B",
    'A', new ItemStack(lightningcrystal), 'B', new ItemStack(Items.stick)});

GameRegistry.addRecipe(new ItemStack(iceaxe), new Object[]{
		" AA",
		" BA",
		" B ",
	'A', new ItemStack(icecrystal), 'B', new ItemStack(Items.stick)});

GameRegistry.addRecipe(new ItemStack(iceaxe), new Object[]{
	"AA ",
	"BA ",
	"B  ",
'A', new ItemStack(icecrystal), 'B', new ItemStack(Items.stick)});

	GameRegistry.addRecipe(new ItemStack(lightningaxe), new Object[]{
	" AA",
	" BA",
	" B ",
	'A', new ItemStack(lightningcrystal), 'B', new ItemStack(Items.stick)});

	GameRegistry.addRecipe(new ItemStack(lightningaxe), new Object[]{
    "AA ",
    "BA ",
    "B  ",
    'A', new ItemStack(lightningcrystal), 'B', new ItemStack(Items.stick)});

	GameRegistry.addRecipe(new ItemStack(icehoe), new Object[]{
	" AA",
	" B ",
	" B ",
	'A', new ItemStack(icecrystal), 'B', new ItemStack(Items.stick)});

	GameRegistry.addRecipe(new ItemStack(icehoe), new Object[]{
		"AA ",
		"B  ",
		"B  ",
		'A', new ItemStack(icecrystal), 'B', new ItemStack(Items.stick)});


	GameRegistry.addRecipe(new ItemStack(lightninghoe), new Object[]{
		" AA",
		" B ",
		" B ",
	'A', new ItemStack(lightningcrystal), 'B', new ItemStack(Items.stick)});

	GameRegistry.addRecipe(new ItemStack(lightninghoe), new Object[]{
		"AA ",
		"B  ",
		"B  ",
		'A', new ItemStack(lightningcrystal), 'B', new ItemStack(Items.stick)});
		GameRegistry.addRecipe(new ItemStack(fireblock), new Object[]{
			"AAA",
			"AAA",
			"AAA",
			'A', new ItemStack(firecrystal)});
		GameRegistry.addRecipe(new ItemStack(lightningblock), new Object[]{
			"AAA",
			"AAA",
			"AAA",
			'A', new ItemStack(lightningcrystal)});
		GameRegistry.addRecipe(new ItemStack(iceblock), new Object[]{
			"AAA",
			"AAA",
			"AAA",
			'A', new ItemStack(icecrystal)});
		
		GameRegistry.addRecipe(new ItemStack(LightningHelmet), new Object[]{
			"   ",
			"AAA",
			"A A",
			'A', new ItemStack(lightningcrystal)});
		GameRegistry.addRecipe(new ItemStack(LightningHelmet), new Object[]{
			"AAA",
			"A A",
			"   ",
			'A', new ItemStack(lightningcrystal)});
		GameRegistry.addRecipe(new ItemStack(LightningPlate), new Object[]{
			"A A",
			"AAA",
			"AAA",
			'A', new ItemStack(lightningcrystal)});
		GameRegistry.addRecipe(new ItemStack(LightningLegs), new Object[]{
			"AAA",
			"A A",
			"A A",
			'A', new ItemStack(lightningcrystal)});
		GameRegistry.addRecipe(new ItemStack(LightningBoots), new Object[]{
			"   ",
			"A A",
			"A A",
			'A', new ItemStack(lightningcrystal)});
		GameRegistry.addRecipe(new ItemStack(LightningBoots), new Object[]{
			"A A",
			"A A",
			"   ",
			'A', new ItemStack(lightningcrystal)});
		
		GameRegistry.addRecipe(new ItemStack(IceHelmet), new Object[]{
			"   ",
			"AAA",
			"A A",
			'A', new ItemStack(icecrystal)});
		GameRegistry.addRecipe(new ItemStack(IceHelmet), new Object[]{
			"AAA",
			"A A",
			"   ",
			'A', new ItemStack(icecrystal)});
		GameRegistry.addRecipe(new ItemStack(IcePlate), new Object[]{
			"A A",
			"AAA",
			"AAA",
			'A', new ItemStack(icecrystal)});
		GameRegistry.addRecipe(new ItemStack(IceLegs), new Object[]{
			"AAA",
			"A A",
			"A A",
			'A', new ItemStack(icecrystal)});
		GameRegistry.addRecipe(new ItemStack(IceBoots), new Object[]{
			"   ",
			"A A",
			"A A",
			'A', new ItemStack(icecrystal)});
		GameRegistry.addRecipe(new ItemStack(IceBoxts), new Object[]{
			"A A",
			"A A",
			"   ",
			'A', new ItemStack(icecrystal)});
			
		//smelting
		GameRegistry.addSmelting(new ItemStack(fireOre), new ItemStack(firecrystal), 5f);
		GameRegistry.addSmelting(new ItemStack(lightningore), new ItemStack(lightningcrystal), 5f);
		//enchantment
		
		ItemStack newEnch = new ItemStack(firepick);
		newEnch.addEnchantment(Enchantment.fireAspect, 10);
		GameRegistry.addRecipe(newEnch, new Object[]{
			"AAA",
			" B ",
			" B ",
			'A', new ItemStack(firecrystal), 'B', new ItemStack(Items.stick)});
		
		ItemStack newEnch2 = new ItemStack(fireshovel);
		newEnch2.addEnchantment(Enchantment.fireAspect, 10);
		GameRegistry.addRecipe(newEnch2, new Object[]{
				"A  ",
				"B  ",
				"B  ",
				'A', new ItemStack(firecrystal), 'B', new ItemStack(Items.stick)});
		
		ItemStack newEnch3 = new ItemStack(fireshovel);
		newEnch3.addEnchantment(Enchantment.fireAspect, 10);
		GameRegistry.addRecipe(newEnch3, new Object[]{
				" A ",
				" B ",
				" B ",
				'A', new ItemStack(firecrystal), 'B', new ItemStack(Items.stick)});
		
		ItemStack newEnch4 = new ItemStack(fireshovel);
		newEnch4.addEnchantment(Enchantment.fireAspect, 10);
		GameRegistry.addRecipe(newEnch4, new Object[]{
				"  A",
				"  B",
				"  B",
				'A', new ItemStack(firecrystal), 'B', new ItemStack(Items.stick)});
		
		ItemStack newEnch5 = new ItemStack(firesword);
		newEnch5.addEnchantment(Enchantment.fireAspect, 10);
		GameRegistry.addRecipe(newEnch5, new Object[]{
				"A  ",
				"A  ",
				"B  ",
			    'A', new ItemStack(firecrystal), 'B', new ItemStack(Items.stick)});
		
		ItemStack newEnch6 = new ItemStack(firesword);
		newEnch6.addEnchantment(Enchantment.fireAspect, 10);
		GameRegistry.addRecipe(newEnch6, new Object[]{
				" A ",
				" A ",
				" B ",
			    'A', new ItemStack(firecrystal), 'B', new ItemStack(Items.stick)});
		
		ItemStack newEnch7 = new ItemStack(firesword);
		newEnch7.addEnchantment(Enchantment.fireAspect, 10);
		GameRegistry.addRecipe(newEnch7, new Object[]{
				"  A",
				"  A",
				"  B",
			'A', new ItemStack(firecrystal), 'B', new ItemStack(Items.stick)});
		
		ItemStack newEnch8 = new ItemStack(fireaxe);
		newEnch8.addEnchantment(Enchantment.fireAspect, 10);
		GameRegistry.addRecipe(newEnch8, new Object[]{
				" AA",
				" BA",
				" B ",
			'A', new ItemStack(firecrystal), 'B', new ItemStack(Items.stick)});
		
		ItemStack newEnch9 = new ItemStack(fireaxe);
		newEnch9.addEnchantment(Enchantment.fireAspect, 10);
		GameRegistry.addRecipe(newEnch9, new Object[]{
				"AA ",
				"BA ",
				"B  ",
			'A', new ItemStack(firecrystal), 'B', new ItemStack(Items.stick)});
		
		ItemStack newEnch10 = new ItemStack(firehoe);
		newEnch10.addEnchantment(Enchantment.fireAspect, 10);
		GameRegistry.addRecipe(newEnch10, new Object[]{
				"AA ",
				"B  ",
				"B  ",
			'A', new ItemStack(firecrystal), 'B', new ItemStack(Items.stick)});
		
		ItemStack newEnch11 = new ItemStack(firehoe);
		newEnch11.addEnchantment(Enchantment.fireAspect, 10);
		GameRegistry.addRecipe(newEnch11, new Object[]{
				" AA",
				" B ",
				" B ",
			'A', new ItemStack(firecrystal), 'B', new ItemStack(Items.stick)});
	
		
	ItemStack newEnch12 = new ItemStack(FlameHelmet);
	newEnch12.addEnchantment(Enchantment.fireProtection, 10);
	GameRegistry.addRecipe(newEnch12, new Object[]{
			"AAA",
			"A A",
			"   ",
		'A', new ItemStack(firecrystal)});
	
	ItemStack newEnch13 = new ItemStack(FlameHelmet);
	newEnch13.addEnchantment(Enchantment.fireProtection, 10);
	GameRegistry.addRecipe(newEnch13, new Object[]{
			"   ",
			"AAA",
			"A A",
		'A', new ItemStack(firecrystal)});
	
	ItemStack newEnch14 = new ItemStack(FlameBoots);
	newEnch14.addEnchantment(Enchantment.fireProtection, 10);
	GameRegistry.addRecipe(newEnch14, new Object[]{
			"   ",
			"A A",
			"A A",
		'A', new ItemStack(firecrystal)});
	
	ItemStack newEnch15 = new ItemStack(FlameBoots);
	newEnch15.addEnchantment(Enchantment.fireProtection, 10);
	GameRegistry.addRecipe(newEnch15, new Object[]{
			"A A",
			"A A",
			"   ",
		'A', new ItemStack(firecrystal)});
	
	ItemStack newEnch16 = new ItemStack(FlameLegs);
	newEnch16.addEnchantment(Enchantment.fireProtection, 10);
	GameRegistry.addRecipe(newEnch16, new Object[]{
			"AAA",
			"A A",
			"A A",
		'A', new ItemStack(firecrystal)});
	
	ItemStack newEnch17 = new ItemStack(FlamePlate);
	newEnch17.addEnchantment(Enchantment.fireProtection, 10);
	GameRegistry.addRecipe(newEnch17, new Object[]{
			"A A",
			"AAA",
			"AAA",
		'A', new ItemStack(firecrystal)});
	
	ItemStack newEnch18 = new ItemStack(Items.stick);
	newEnch18.addEnchantment(Enchantment.knockback, 100);
	GameRegistry.addShapelessRecipe(newEnch18, Items.stick);
	}
	


	
	
    public static void MyItems(){
    	//what comes out of block
    	
    	icecrystal = new IceCrystal();
    	GameRegistry.registerItem(icecrystal, "ice_crystal");
    	
    	lightningcrystal = new LightningCrystal();
    	GameRegistry.registerItem(lightningcrystal, "lightning_crystal");
    	
    	iceMaterial = EnumHelper.addToolMaterial("ice_material", 3, 2000, 10f, 5f, 30);
    	icepick = new IcePick(iceMaterial);
    	GameRegistry.registerItem(icepick, "ice_pick");
    	
    	iceMaterial = EnumHelper.addToolMaterial("ice_material", 3, 2000, 10f, 5f, 30);
    	icesword = new IceSword(iceMaterial);
    	GameRegistry.registerItem(icesword, "ice_sword");
    	
    	iceMaterial = EnumHelper.addToolMaterial("ice_material", 3, 2000, 10f, 5f, 30);
    	iceaxe = new IceAxe(iceMaterial);
    	GameRegistry.registerItem(iceaxe, "ice_axe");
    	
    	iceMaterial = EnumHelper.addToolMaterial("ice_material", 3, 2000, 10f, 5f, 30);
    	iceshovel = new IceShovel(iceMaterial);
    	GameRegistry.registerItem(iceshovel, "ice_shovel");
    	
    	iceMaterial = EnumHelper.addToolMaterial("ice_material", 3, 2000, 10f, 5f, 30);
    	icehoe = new IceHoe(iceMaterial);
    	GameRegistry.registerItem(icehoe, "ice_hoe");
    	
    	lightningMaterial = EnumHelper.addToolMaterial("lightning_material", 3, 1500, 30f, 5f, 30);
    	lightningpick = new LightningPick(lightningMaterial);
    	GameRegistry.registerItem(lightningpick, "lightning_pick");
    	
    	lightningMaterial = EnumHelper.addToolMaterial("lightning_material", 3, 1500, 0f, 30f, 30);
    	lightningsword = new LightningSword(lightningMaterial);
    	GameRegistry.registerItem(lightningsword, "lightning_sword");
    	
    	lightningMaterial = EnumHelper.addToolMaterial("lightning_material", 3, 1500, 30f, 30f, 30);
    	lightningaxe = new LightningAxe(lightningMaterial);
    	GameRegistry.registerItem(lightningaxe, "lightning_axe");
    	
    	lightningMaterial = EnumHelper.addToolMaterial("lightning_material", 3, 1500, 30f, 5f, 30);
    	lightningshovel = new LightningShovel(lightningMaterial);
    	GameRegistry.registerItem(lightningshovel, "lightning_shovel");
    	
    	lightningMaterial = EnumHelper.addToolMaterial("lightning_material", 3, 1500, 30f, 5f, 30);
    	lightninghoe = new LightningHoe(lightningMaterial);
    	GameRegistry.registerItem(lightninghoe, "lightning_hoe");
    	
    	
    	 myArmorMaterial =  
         //(name, durability, damageReductionAmounts, enchantability)
    	 FlameHelmet = new FlameArmor(myArmorMaterial, helmid, 0).setUnlocalizedName("flame_helmet");
    	 FlamePlate = new FlameArmor(myArmorMaterial, chestid, 1).setUnlocalizedName("flame_chestplate");
    	 FlameLegs = new FlameArmor(myArmorMaterial, legid, 2).setUnlocalizedName("flame_leggings");
    	 FlameBoots = new FlameArmor(myArmorMaterial, bootid, 3).setUnlocalizedName("flame_boots");
    	 GameRegistry.registerItem(FlameHelmet, "flame_helmet");
    	 GameRegistry.registerItem(FlamePlate, "flame_chestplate");
    	 GameRegistry.registerItem(FlameLegs, "flame_leggings");
    	        GameRegistry.registerItem(FlameBoots, "flame_boots");
    	        
    	 myArmorMaterial = EnumHelper.addArmorMaterial("myArmorMaterial", 2000, new int[]{5, 8, 7, 4}, 30);
    	 //(name, durability, damageReductionAmounts, enchantability)
    	 IceHelmet = new IceArmor(myArmorMaterial, helmid2, 0).setUnlocalizedName("Ice_helmet");
    	 IcePlate = new IceArmor(myArmorMaterial, chestid2, 1).setUnlocalizedName("Ice_chestplate");
    	 IceLegs = new IceArmor(myArmorMaterial, legid2, 2).setUnlocalizedName("Ice_leggings");
    	 IceBoots = new IceArmor(myArmorMaterial, bootid2, 3).setUnlocalizedName("Ice_boots");
    	 GameRegistry.registerItem(IceHelmet, "Ice_helmet");
    	 GameRegistry.registerItem(IcePlate, "Ice_chestplate");
    	 GameRegistry.registerItem(IceLegs, "Ice_leggings");
    	 GameRegistry.registerItem(IceBoots, "Ice_boots"); 
         
     	 myArmorMaterial = EnumHelper.addArmorMaterial("myArmorMaterial", 1500, new int[]{8, 15, 14, 1}, 30);
     	 //(name, durability, damageReductionAmounts, enchantability)
     	 LightningHelmet = new LightningArmor(myArmorMaterial, helmid5, 0).setUnlocalizedName("Lightning_helmet");
     	LightningPlate = new LightningArmor(myArmorMaterial, chestid5, 1).setUnlocalizedName("Lightning_chestplate");
     	LightningLegs = new LightningArmor(myArmorMaterial, legid5, 2).setUnlocalizedName("Lightning_leggings");
     	LightningBoots = new LightningArmor(myArmorMaterial, bootid5, 3).setUnlocalizedName("Lightning_boots");
     	 GameRegistry.registerItem(LightningHelmet, "Lightning_helmet");
     	 GameRegistry.registerItem(LightningPlate, "Lightning_chestplate");
     	 GameRegistry.registerItem(LightningLegs, "Lightning_leggings");
     	 GameRegistry.registerItem(LightningBoots, "Lightning_boots");
    }
     	 
     	
}


