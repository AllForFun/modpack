package com.allforfunmc.achievements;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class OnDeathFifthTimeEvent {
	
	@SubscribeEvent
	public void WhenIDie5Times(PlayerEvent.PlayerRespawnEvent e){
		if(e.equals(e)){
			e.player.addStat(MainRegistry.achievementdeath5, 1);
		}
	}
}
