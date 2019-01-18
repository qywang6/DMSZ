package com.baidu.dmsz.utils;

import java.util.Scanner;

import com.baidu.dmsz.entity.Jewellery;
import com.baidu.dmsz.entity.Map;
import com.baidu.dmsz.entity.Monster;
import com.baidu.dmsz.entity.Player;

public class ViewUtils {
	private static boolean GameOver = false;
	private static Scanner in = CommonUtils.getScanner();
	public static void startGame(){
		System.out.println("***��ӭ������Ϸ***");
			System.out.println("***�������ǳ�***");
			String name = in.next();
			Player player = EntityFactory.newPlayer(name);
			System.out.println(player.toString());
			do{
				zhiShaiZi(player);
			}while(!GameOver);{
				System.out.println("������Ϸ");
		}
	}
	private static void zhiShaiZi(Player player) {
		System.out.println("***�Ƿ�ʼ��ɸ��***");
		String input = in.next();
		if(input.equals("y")){
			int num = Player.zhiShaiZi();
			player.setPlace(player.getPlace()+num);
			if(player.getPlace()>Map.Map_Length-1){
				player.setPlace(Map.Map_Length-1);
			}
			System.out.println("����"+num+"���λ��Ϊ"+player.getPlace());
			int type = Map.getInstance().getType(player.getPlace());
			switch (type) {
			case 0:
				break;

			case 1:
				Jewellery jewellery = EntityFactory.newJewellery();
				System.out.println("yudao"+jewellery.getName());
				break;
			case 2:
				Monster monster =EntityFactory.newMonster();
				System.out.println("yudao"+monster.getName());
				do {
					player.atkMonster(monster);
					monster.atkPlayer(player);
				} while (player.getHp()>0&&monster.getHp()>0);
				if (monster.getHp()==0) {
					System.out.println("�ϸ����ֶ�u");
				}else {
					System.out.println("��Ϸ����");
					GameOver = true;
				}
				break;
			}
			System.out.println(player.toString());
			if (player.getPlace()==Map.Map_Length-1) {
				GameOver = true;
			}
			
		}
	}
	public static void sop(Object object){
		System.out.println(object);
	}
}








