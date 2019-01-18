package com.baidu.dmsz.utils;

import com.baidu.dmsz.entity.Jewellery;
import com.baidu.dmsz.entity.Monster;
import com.baidu.dmsz.entity.Player;
import com.baidu.dmsz.entity.atkJewellery;
import com.baidu.dmsz.entity.hpJewellery;
import com.baidu.dmsz.entity.speedJewellery;

public class EntityFactory {
	public static Player newPlayer(String name){
		Player player= new Player();
		int atk = CommonUtils.random(30,50);
		int hp = CommonUtils.random(100,400);
		player.setName(name);
		player.setAtk(atk);
		player.setHp(hp);
		return player;
	}
	public static Monster newMonster(){
		Monster monster = new Monster();
		int num = CommonUtils.random(3);
		switch (num) {
		case 0:
			monster.setName("dujiaoshou");
			monster.setAtk(CommonUtils.random(30, 50));
			monster.setHp(CommonUtils.random(100, 180));
			break;
		case 1:
			monster.setName("xiaoqiang");
			monster.setAtk(CommonUtils.random(20, 35));
			monster.setHp(CommonUtils.random(100, 180));
			break;

		case 2:
			monster.setName("peien");
			monster.setAtk(CommonUtils.random(5, 100));
			monster.setHp(CommonUtils.random(20, 180));
			break;
		}
		return monster;
	}
	public static Jewellery newJewellery(){
		Jewellery jewellery = null;
		int num = CommonUtils.random(3);
		switch (num) {
		case 0:
			jewellery = new atkJewellery();
			jewellery.setName("power buff");
			break;

		case 1:
			jewellery = new hpJewellery();
			jewellery.setName("HP buff");
			break;
		case 2:
			jewellery = new speedJewellery();
			jewellery.setName("speed buff");
			break;
		}
		return jewellery;
		
	}
}











