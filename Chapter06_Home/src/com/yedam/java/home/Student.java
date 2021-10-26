package com.yedam.java.home;

import java.util.Scanner;

public class Student {
	//필드
	private int studentID;	//학번
	private String studentName;	//이름
	private Subject[] subjectList;//수강과목 목록
	private int subjectIndex = 0; //수강과목 목록에 저장된 수강과목 수 
	
	//생성자
	public Student(int studentID, String studentName) {
		this.studentID = studentID;//매개변수를 통해 학번 초기화
		this.studentName = studentName;//매개변수를 통해 이름 초기화
		this.subjectList = new Subject[3];//수강가능한 과목 수는 3개
	}
	
	public void addSubject(String name, int scorePoint) {	
	
		/*for(int i=0; i<subjectList.length; i++) {
			System.out.println("과목>");
			name = scanner.next();
			System.out.println("점수>");
			scorePoint = scanner.nextInt();
			
			Subject[i] = new Subject(name, scorePoint); 
		}*/
		
		//수강과목 정보를 담을 인스턴스 생성하기
		Subject subject = new Subject();
		//매개변수를 통해 과목이름 추가하기
		subject.setName(name);
		//매개변수를 통해 점수 추가하기
		subject.setScorePoint(scorePoint);
		//배열에 저장하기
		subjectList[subjectIndex++] = subject;
	}
	
	public void showStudentInfo() {
		int total = 0;
		
		for(int i = 0; i<subjectIndex; i++) {
			System.out.printf("학생 %s의 %s 과목은 %d점입니다\n", studentName, subjectList[i].getName(), subjectList[i].getScorePoint());
		}
		//for문을 통해 학생의 수강과목과 과목의 점수를 모두 출력하세요.
		//출력형태 : 학생 홍길동의 수학 과목은 80점입니다.
		
		int sum = 0;
		for(int i=0; i<subjectIndex; i++) {
			sum += subjectList[i].getScorePoint();
		}
		System.out.printf("학생 %s의 총점은 %d점입니다.\n", studentName, sum);
		//학생의 총점을 계산해서 출력하세요.
		//출력형태 : 학생 홍길동의 총점은 300점입니다.
	}
	
	
	
}
