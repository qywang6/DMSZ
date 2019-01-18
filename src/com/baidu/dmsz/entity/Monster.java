package com.baidu.dmsz.entity;

public class Monster {
	private String name;
	private int hp;
	private int atk;
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
	public void atkPlayer(Player player){
		int hp = player.getHp();
		hp = hp-atk;
		player.setHp(hp);
		if(player.getHp()<=0){
			player.setHp(0);
			System.out.println("ÓÎÏ·½áÊø");
//			GameOver();
		}
	}
	
	
}
