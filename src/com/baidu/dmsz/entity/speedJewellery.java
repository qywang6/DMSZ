package com.baidu.dmsz.entity;

import com.baidu.dmsz.utils.CommonUtils;

public class speedJewellery extends Jewellery{

	@Override
	public void buff(Player player) {
		int num = player.getPlace();
		num = num+CommonUtils.random(2, 6);
		player.setPlace(num);
		if(player.getPlace()>Map.Map_Length-1){
			player.setPlace(Map.Map_Length-1);
		}
	}
	
}
