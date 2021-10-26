package com.yedam.java.home;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student1 = new Student(1001, "lee");
		student1.addSubject("국어", 100);
		student1.addSubject("수학", 50);
		
		Student student2 = new Student(1002, "kim");
		student2.addSubject("국어", 70);
		student2.addSubject("수학", 86);
		student2.addSubject("영어", 100);
		// 1001학번 Lee와 1002학번 kim, 두 학생이 있습니다.
		
		student1.showStudentInfo();
		System.out.println();
		student2.showStudentInfo();

		// Lee학생은 2과목을 수강합니다. 국어 점수가 100점, 수학 점수가 50점입니다.
		// Kim학생은 3과목을 수강합니다. 국어 점수가 70점, 수학 점수가 85점, 영어점수가 100점입니다.
		// Student클래스와 Subject클래스를 생성한 후 두 학생의 과목성적과 총점을 각각 출력해 봅시다.
		
	}

}
