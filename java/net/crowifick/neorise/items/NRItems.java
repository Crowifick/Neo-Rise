package net.crowifick.neorise.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.crowifick.neorise.utility.NRItem;
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
public class NRItems {

    public static NRItem fatimaShard = new FatimaShard("FatimaShard", CreativeTabs.tabMaterials);

    public static void registerItems() {

         GameRegistry.registerItem(fatimaShard, "fatimaShard");

    }

}
