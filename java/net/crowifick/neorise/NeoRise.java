package net.crowifick.neorise;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.crowifick.neorise.blocks.NRBlocks;
import net.crowifick.neorise.items.NRItems;
import net.crowifick.neorise.proxys.CommonProxy;
import net.crowifick.neorise.utility.Reference;

/**
 * User: Crowifick
 * Date: 7/7/14
 * Time: 12:21 AM
 * This mod is open source but do not come to me with problems
 * on how *insert code here* won't work on your side.
 */
@Mod(name = Reference.NAME, modid = Reference.MODID, version = Reference.VERSION)
public class NeoRise {

    @Mod.Instance(Reference.MODID)
    public static NeoRise instance;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        NRBlocks.registerBlocks();
        NRItems.registerItems();

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {



    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {



    }

}