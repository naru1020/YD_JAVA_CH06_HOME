package com.yedam.java.home;

public class Subject {
	private String name; // 과목 이름
	public void setName(String name) {
		this.name = name;
	}

	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}

	private int scorePoint; // 과목 점수
	
	public int getScorePoint() {
		return this.scorePoint;
	}

	String getName() {
		return this.name;
	}
	// 각 필드의 getter, setter 메소드 구현
}
