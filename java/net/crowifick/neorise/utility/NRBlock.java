package net.crowifick.neorise.utility;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * User: Crowifick
 * Date: 7/8/14
 * Time: 8:27 PM
 * This mod is open source but do not come to me with problems
 * on how *insert code here* won't work on your side.
 */
public class NRBlock extends Block {

    public NRBlock(String name, CreativeTabs tab) {

        super(Material.rock);
        setBlockName(name);
        setBlockTextureName(Reference.MODID + ":" + name);
        setCreativeTab(tab);

    }

    public NRBlock(Material material, String name, CreativeTabs tab) {

        super(material);
        setBlockName(name);
        setBlockTextureName(Reference.MODID + ":" + name);
        setCreativeTab(tab);

    }

}
