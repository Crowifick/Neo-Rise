package net.crowifick.neorise.utility;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * User: Crowifick
 * Date: 7/7/14
 * Time: 12:32 AM
 * This mod is open source but do not come to me with problems
 * on how *insert code here* won't work on your side.
 */
public class NRItem extends Item {

    public NRItem(String name, CreativeTabs tab) {

        super();
        setUnlocalizedName(name);
        setTextureName(Reference.MODID + ":" + name);
        setCreativeTab(tab);

    }



}
