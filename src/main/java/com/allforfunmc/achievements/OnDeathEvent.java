package com.allforfunmc.achievements;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class OnDeathEvent {
	
	@SubscribeEvent
	public void WhenIDie(PlayerEvent.PlayerRespawnEvent e){
		if(e.equals(e)){
			e.player.addStat(MainRegistry.achievementdeath, 1);
		}
	}

}
