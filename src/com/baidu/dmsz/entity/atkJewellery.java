package com.baidu.dmsz.entity;

public class atkJewellery extends Jewellery{

	public void buff(Player player) {
		int atk = player.getAtk();
		atk = atk+5;
		player.setAtk(atk);
	}
	
}
