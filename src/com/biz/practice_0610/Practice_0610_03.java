package com.biz.practice_0610;

public class Practice_0610_03 extends Practice_0610_01{

	@Override
	public void Market() {
		float m1=(float)(this.m1/1.1);
		float m2=(float)(this.m2/1.1);
		
		int o1vat=this.m1-(int)m1;
		int o2vat=this.m2-(int)m2;
		
		System.out.printf("매입금액 : %f \n",m1);
		System.out.printf("판매금액 : %f \n",m2);
		System.out.printf("이익금 : %f \n",m2-m1);
		System.out.printf("납부할 vnt : %d \n",o2vat-o1vat);
		
	}

	
	
}
