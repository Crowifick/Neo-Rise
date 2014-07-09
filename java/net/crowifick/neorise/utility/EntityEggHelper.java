package net.crowifick.neorise.utility;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityList.EntityEggInfo;

/**
 * User: Crowifick
 * Date: 7/8/14
 * Time: 6:43 PM
 * This mod is open source but do not come to me with problems
 * on how *insert code here* won't work on your side.
 */

public class EntityEggHelper {

    static int startEntityId = 300;

    public static int getUniqueEntityId() {
        do {    startEntityId++;
        } while (EntityList.getStringFromID(startEntityId) != null);

        return startEntityId;
    }

    public static void registerEntityEgg(Class<? extends Entity> entity, int primaryColor, int secondaryColor) {

        int id = getUniqueEntityId();
        EntityList.IDtoClassMapping.put(id, entity);
        EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));

    }

}
