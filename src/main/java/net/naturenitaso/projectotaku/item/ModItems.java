package net.naturenitaso.projectotaku.item;

import net.minecraft.references.Items;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.naturenitaso.projectotaku.ProjectOtaku;

public class ModItems {
    // Registry for the Modded Items Added into the Game via this mod
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ProjectOtaku.MOD_ID);
}
