package com.biz.practice_0611;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.mode.ScoreVO;

public class Practice_01 {

	public static void main(String[] args) {

		List<ScoreVO> scList= new ArrayList<ScoreVO>();
		
		Random rnd = new Random();
		
		for(int i=0;i<50;i++) {
			ScoreVO sVO=new ScoreVO();
			sVO.setNumber(""+(i+1));
			sVO.setKor(rnd.nextInt(50)+51);
			sVO.setEng(rnd.nextInt(50)+51);
			sVO.setMath(rnd.nextInt(50)+51);
			
			scList.add(sVO);
		}
		
		
		
		int scLen=scList.size();
		
		for(int i=0;i<scLen;i++) {
			ScoreVO vo=scList.get(i);
			int intTotal=vo.getKor()+vo.getEng()+vo.getMath();
			
			vo.setTotal(intTotal);
			vo.setAverage(intTotal/3);
			
			scList.get(i).setTotal(intTotal);
		}
		
		
		for(int i=0;i<scLen;i++) {
			for(int j=i+1;j<scLen;j++) {
				ScoreVO V1=scList.get(i);
				ScoreVO V2=scList.get(j);
				if(V1.getAverage()>V2.getAverage()) {
					ScoreVO _sc=scList.get(i);
					scList.set(i,V2);
					scList.set(j, _sc);
				}
			}
		}
		for(ScoreVO s: scList) {
			System.out.println(s.toString());
		}
	}

}
