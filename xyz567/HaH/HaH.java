package xyz567.HaH;

//To do: Add more half's and half's

/*
* Basic importing
*/

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraftforge.common.Configuration;

/*
* Basic needed forge stuff
*/
@Mod(modid="HaH",name="Half and Half mod",version="V0.0.3.1")
@NetworkMod(clientSideRequired=true,serverSideRequired=false)

public class HaH {

	/*
	* ToolMaterial
	*/

	
	public static EnumToolMaterial GoldDiamondMaterial;
	//Telling forge what is being created
	
	//Items
	public static Item GoldDiamondIngot;
	
	//tools
	public static Item GoldDiamondPick;
	public static Item GoldDiamondAxe;
	public static Item GoldDiamondHoe;
	public static Item GoldDiamondSword;
	public static Item GoldDiamondShovel;
	
	//Blocks
	public static Block Golddiamond;
	public static Block Golddiamondopposite;
	public static Block Golddiamond3;
	public static Block Golddiamond4;
	
	//Config ID's
	public static int golddiamondID;
	public static int golddiamondoppositeID;
	public static int golddiamond3ID;
	public static int golddiamond4ID;
	public static int GoldDiamondIngotID;
	public static int GoldDiamondPickID;
	public static int GoldDiamondAxeID;
	public static int GoldDiamondHoeID;
	public static int GoldDiamondSwordID;
	public static int GoldDiamondSpadeID;
	
	//Run PreInit
	@PreInit
	public void preInit(FMLPreInitializationEvent event){
		//Load config files/Make new ones
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
				
		config.load();
		
		//set config ID's
		
        golddiamondID = config.getBlock("Golddiamond", 3611).getInt();
        
        golddiamondoppositeID = config.getBlock("Golddiamondopposite", 3612).getInt();
        
        golddiamond3ID = config.getBlock("Golddiamond3", 3613).getInt();
        
        golddiamond4ID = config.getBlock("Golddiamond4", 3614).getInt();

        GoldDiamondIngotID = config.getItem("GoldDiamondIngot", 3678).getInt();
		
        GoldDiamondPickID = config.getItem("GoldDiamondPick",3679).getInt();
        
        GoldDiamondAxeID = config.getItem("GoldDiamondAxe", 3680).getInt();
        
        GoldDiamondHoeID = config.getItem("GoldDiamondHoe", 3681).getInt();
        
        GoldDiamondSwordID = config.getItem("GoldDiamondSword", 3682).getInt();
        
        GoldDiamondSpadeID = config.getItem("GoldDiamondShovel", 3683).getInt();
        
        //Save the config
        
		config.save();
	}
	//declaring Init
	@Init
	public void load(FMLInitializationEvent event){
		//define items
		
		//Adding materials
		GoldDiamondMaterial = EnumHelper.addToolMaterial(Strings.GoldDiamondMaterial, 3, 797, 12F, 2, 2);
		
		//Adding tools
		GoldDiamondPick = new GDPick(GoldDiamondPickID, GoldDiamondMaterial).setUnlocalizedName("golddiamondpick");
		LanguageRegistry.addName(GoldDiamondPick, "Gold-Diamond Pickaxe");
		
		GoldDiamondAxe = new GDAxe(GoldDiamondAxeID, GoldDiamondMaterial).setUnlocalizedName("golddiamondaxe");
		LanguageRegistry.addName(GoldDiamondAxe, "Gold-Diamond Axe");
		
		GoldDiamondHoe = new GDHoe(GoldDiamondHoeID, GoldDiamondMaterial).setUnlocalizedName("golddiamondhoe");
		LanguageRegistry.addName(GoldDiamondHoe, "Gold-Diamond Hoe");
		
		GoldDiamondSword = new GDSword(GoldDiamondSwordID, EnumToolMaterial.EMERALD).setUnlocalizedName("golddiamondsword");
		LanguageRegistry.addName(GoldDiamondSword, "Gold-Diamond Sword");
		
		GoldDiamondShovel = new GDShovel(GoldDiamondSpadeID, GoldDiamondMaterial).setUnlocalizedName("golddiamondshovel");
		LanguageRegistry.addName(GoldDiamondShovel, "Gold-Diamond Shovel");
		
		
		//Adding Items
		GoldDiamondIngot = new HalfItems(GoldDiamondIngotID).setUnlocalizedName("GoldDiamondIngot");
		LanguageRegistry.addName(GoldDiamondIngot, "Gold-Diamond Ingot");
		
		
		//Adding blocks
		Golddiamond = new golddiamondblock(golddiamondID, "Golddiamond").setUnlocalizedName("golddiamond").setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F);
		GameRegistry.registerBlock(Golddiamond, "Golddiamond");
		LanguageRegistry.addName(Golddiamond, "Gold-Diamond cross");
		
		Golddiamondopposite = new golddiamondopposite(golddiamondoppositeID, "Golddiamondopposite").setUnlocalizedName("golddiamondback").setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F);
		GameRegistry.registerBlock(Golddiamondopposite, "Golddiamondopposite");
		LanguageRegistry.addName(Golddiamondopposite, "Gold-Diamond cross");
		
		Golddiamond3 = new golddiamond3(golddiamond3ID, "Golddiamond3").setUnlocalizedName("golddiamond3").setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F);
		GameRegistry.registerBlock(Golddiamond3, "Golddiamond3");
		LanguageRegistry.addName(Golddiamond3, "Gold-Diamond cross");
		
		Golddiamond4 = new golddiamond4(golddiamond4ID, "Golddiamond4").setUnlocalizedName("golddiamond4").setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F);
		GameRegistry.registerBlock(Golddiamond4, "Golddiamond4");
		LanguageRegistry.addName(Golddiamond4, "Gold-Diamond cross");
		
		// crafting of blocks
		
		GameRegistry.addRecipe(new ItemStack(HaH.Golddiamond, 2), new Object[] {
			"G  ", "   ", "  D",
			'D', BlockOre.blockDiamond,
			'G', BlockOre.blockGold,
		});
		
		GameRegistry.addRecipe(new ItemStack(HaH.Golddiamondopposite, 2), new Object[] {
			"  G", "   ", "D  ",
			'D', BlockOre.blockDiamond,
			'G', BlockOre.blockGold,
		});
		
		GameRegistry.addRecipe(new ItemStack(HaH.Golddiamond3, 2), new Object[] {
			"D  ", "   ", "  G",
			'D', BlockOre.blockDiamond,
			'G', BlockOre.blockGold,
		});
		
		GameRegistry.addRecipe(new ItemStack(HaH.Golddiamond4, 2), new Object[] {
			"  D", "   ", "G  ",
			'D', BlockOre.blockDiamond,
			'G', BlockOre.blockGold,
		});
		
		//crafting of items
		GameRegistry.addShapelessRecipe(new ItemStack(HaH.GoldDiamondIngot, 2), new Object[] {
			Item.ingotGold,
			Item.diamond,
		});
		
		GameRegistry.addRecipe(new ItemStack(HaH.GoldDiamondPick, 1), new Object[] {
			"GGG", " S ", " S ",
			'G', HaH.GoldDiamondIngot ,
			'S', Item.stick ,  
		});
		
		GameRegistry.addRecipe(new ItemStack(HaH.GoldDiamondSword, 1), new Object[] {
			" G ", " G ", " S ",
			'G', HaH.GoldDiamondIngot ,
			'S', Item.stick,
		});
	}
}
