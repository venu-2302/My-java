package com.venu;

public class Test {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		float num = 5.7893951895f;
		
		num =(int)(num*1000);
		System.out.println(num);
		//5678 
		
		int r =(int)(num%10);//8
		num = (int)(num /10);
		
		if(r > 5) {
			//5678
			//567+1---568---5.68
			num++;
			
		}
		//568---5.68
		num = num /100;
		//5.68
		System.out.println("num---->"+num);
		
	}

}
