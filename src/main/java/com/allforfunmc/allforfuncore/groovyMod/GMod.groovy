package com.allforfunmc.allforfuncore.groovyMod

import cpw.mods.fml.common.registry.GameRegistry
import net.minecraft.block.Block
import net.minecraft.item.Item

abstract class GMod {


    def blockRegistry = [String:Block]
    def itemRegistry = [String:Item]

    def register() {
        blockRegistry.each {
            GameRegistry.registerBlock(it.value, it.key)
        }
        itemRegistry.each {
            GameRegistry.registerItem(it.value, it.key)
        }
    }
}
