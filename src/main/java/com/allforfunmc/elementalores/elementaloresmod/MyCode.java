

public class MyCode {



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


