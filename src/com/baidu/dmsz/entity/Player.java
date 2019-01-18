package com.baidu.dmsz.entity;

import com.baidu.dmsz.utils.CommonUtils;
import java.util.*;

public class Player {
	private String name;
	private int hp;
	private int atk;
	private int place;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getPlace() {
		return place;
	}
	public void setPlace(int place) {
		this.place = place;
	}
	public static int zhiShaiZi(){
		return CommonUtils.random(1,6);
	}
	public void atkMonster(Monster monster){
		int hp=monster.getHp();
		hp = hp-atk;
		monster.setHp(hp);
		if(monster.getHp()==0){
			monster.setHp(0);
		}
	}
	public String toString(){
		return "昵称"+name+"\n攻击力"+atk+"\n当前位置"+place+"\nhp="+hp;
		
	}
}








