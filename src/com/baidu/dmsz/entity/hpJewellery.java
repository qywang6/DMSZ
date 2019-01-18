package com.baidu.dmsz.entity;

public  class hpJewellery extends Jewellery{

	@Override
	public void buff(Player player) {
		int hp = player.getHp();
		hp = hp+130;
		player.setHp(hp);
	}

}
