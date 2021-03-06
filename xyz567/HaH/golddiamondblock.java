package xyz567.HaH;

import java.util.Random;

import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

public class golddiamondblock extends Block {
	
	public golddiamondblock(int par1, String texture) {
		super(par1, Material.rock);
		setCreativeTab(CreativeTabs.tabBlock);
	}
	//Drops when broken with pickaxe
		
	public int idDropped(int par1, Random par2Random, int par3){
		return HaH.Golddiamond.blockID;
	}
	public int quantityDropped(Random random){
		return 1;
	}
	
	//Texture the block (Not sure if it's required)
	public String getTextureFile(){
		return "/textures/blocks/golddiamond.png";
	}
}
