package com.baidu.dmsz.entity;

import com.baidu.dmsz.utils.CommonUtils;

public class Map {

	public static final int Map_Length = 100;
	private int[] map = new int[Map_Length];
	private static Map instance = new Map();
	public static Map getInstance() {
		return instance;
	}
	private Map(){
		int count = Map_Length/5;
		for (int i = 0; i < count; i++) {
			int n = CommonUtils.random(0, Map_Length-1);
			if(map[n]!=0){
				i--;
			}else{
				map[n]=1;
		}
	}
		for (int i = 0; i < count; i++) {
			int n = CommonUtils.random(0, Map_Length-1);
			if(map[n]!=0){
				i--;
		}else{
			map[n]=2;
					}
		}
	}
	public int getType(int index){
		return map[index];
		
	}
}
