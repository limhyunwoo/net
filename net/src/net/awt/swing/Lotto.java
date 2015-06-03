package net.awt.swing;

import java.util.Arrays;

public class Lotto {
	int[] lotto = new int[6];
	
	public int [] getLotto(){
		return this.lotto;
	}
	
	
	public void setLotto() {
		int [] num = new int [45];
		for(int i = 1; i<46; i++){
			num[i] = i;
		}
		for(int j =0; j < 45; j++){
			int r = (int)(Math.random()*45);
			int k = num[j];
			num[j] = num[r];
			num[r] = k;
		}
		for(int y = 0; y < 6; y++){
			this.lotto[y] = num[y];
		}
		
		
		
	}
	
	public void sort(int[] array){
		Arrays.sort(lotto);
		
	}


}
