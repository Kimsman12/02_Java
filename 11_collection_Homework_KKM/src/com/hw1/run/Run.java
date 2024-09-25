package com.hw1.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import com.hw1.model.dto.Friend;

public class Run {

	public static void main(String[] args) {
		
		// Friend 객체만 넣을 수 있는 ArrayList 객체 생성 후
		// 짱구, 철수, 유리, 훈이, 맹구 객체 생성하여 ArrayList에 추가
		
		List<Friend> friend = new ArrayList<Friend>();
		
		
		
		friend.add(new Friend("짱구"));
		friend.add(new Friend("철수"));
		friend.add(new Friend("유리"));
		friend.add(new Friend("훈이"));
		friend.add(new Friend("맹구"));
		
		
		// List 에서 다섯객체중 랜덤으로 하나를 뽑아
		// 골목대장이 누군지 출력하기
		
		Random random = new Random();
		
		// Integer를 저장할 TreeSet 객체 생성
		// Integer(객체, Wrapper class) <==> int(기본자료형)
		
		
		int randomIndex = (int) (Math.random() * friend.size());

		Friend leader = friend.get(randomIndex);

		leader.pickLeader();
	}

}
