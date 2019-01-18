package com.baidu.dmsz.utils;

import java.util.Random;
import java.util.Scanner;

public class CommonUtils {
	private static Scanner in = new Scanner(System.in);
	private static Random random = new Random();
	public static int random(int n){
		return random.nextInt(n);
		
	}
	public static int random(int i, int j) {
		return i+random.nextInt(j+1-i);		
	}
	public static Scanner getScanner(){
		return in;
		
	}

}
