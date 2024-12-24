package com.venu;

public class AccumlateNum {

	public static void main(String[] args) {
		
				int num=1,rem,sum=0;
				while(num!=0) {
					rem = num%10;
					num = num/10;
					sum = sum+rem;
					if(num==0) {
						if(sum>=10) {
							num = sum;
							sum = 0;
						}
					}
				}
				System.out.println(sum);
			}
		}


