package com.MoofIT.Minecraft.Tutorial;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.BlockPlaceEvent;

/* Example Template
 * By Adamki11s
 * HUGE Plugin Tutorial
 */

public class ExampleBlockListener extends BlockListener{
	//You HAVE to have this!
	public static Example plugin;
	
	public ExampleBlockListener(Example instance) {
		plugin = instance;
	}
	//You HAVE to have this!

	public void onBlockPlace(BlockPlaceEvent event){
		Player player = event.getPlayer();
		Block block = event.getBlock();
		Material mat = block.getType(); 
		player.sendMessage("You placed a block with ID : " + mat);//Display a message to the player telling them what type of block they placed.
	}
}