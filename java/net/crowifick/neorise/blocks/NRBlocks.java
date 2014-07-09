package net.crowifick.neorise.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.crowifick.neorise.utility.NRBlock;
import net.crowifick.neorise.utility.Reference;
import net.minecraft.creativetab.CreativeTabs;

/**
 * User: Crowifick
 * Date: 7/7/14
 * Time: 12:30 AM
 * This mod is open source but do not come to me with problems
 * on how *insert code here* won't work on your side.
 */
@GameRegistry.ObjectHolder(Reference.MODID)
public class NRBlocks {

    public static NRBlock nienOre = new NienOre("NienOre", CreativeTabs.tabBlock);

    public static void registerBlocks()  {

          GameRegistry.registerBlock(nienOre, "nienOre");

    }

}
