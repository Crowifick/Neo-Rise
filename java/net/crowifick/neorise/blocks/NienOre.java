package net.crowifick.neorise.blocks;

import net.crowifick.neorise.utility.NRBlock;
import net.minecraft.creativetab.CreativeTabs;

/**
 * User: Crowifick
 * Date: 7/8/14
 * Time: 8:32 PM
 * This mod is open source but do not come to me with problems
 * on how *insert code here* won't work on your side.
 */
public class NienOre extends NRBlock {

    public NienOre(String name, CreativeTabs tab) {

        super(name, tab);
        setHardness(2.5F);
        setResistance(10F);
        setHarvestLevel("pickaxe", 2);

    }
}
