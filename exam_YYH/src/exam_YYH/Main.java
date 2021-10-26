package exam_YYH;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Student[] students = null;
		int studentNum = 0;
		
		boolean run = true;
		
		while(run) {
			System.out.println("==== 1. 학생수 입력 2. 학생정보 등록 3. 학생정보 전체 조회  4. 학생정보 분석 5. 종료 ");
			System.out.println("선택>");
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
			case 1:
				System.out.println("학생 수>");
				studentNum = scanner.nextInt();
				students = new Student[studentNum];
				break;
				
			case 2:
				for(int i = 0; i<students.length; i++) {
					System.out.println("학번>");
					int classnum = scanner.nextInt();
					System.out.println("이름>");
					String name = scanner.next();
					System.out.println("점수>");
					int score = scanner.nextInt();
				
					Student student = new Student(classnum, name, score);
					students[i] = student;
				}
				break;
				
			case 3:
				for(int i =0; i<students.length; i++){
					Student student = students[i];
					System.out.println(student.getClassnum() + " 학번의 점수는 " + student.getScore() + "입니다.");
				}
				break;
				
			case 4:
				int max = 0;
				int index = 0;
			
				
				for(int i = 0; i<students.length; i++) {
					Student student = students[i];
					if(student.getScore()>max) {
						max = student.getScore();
						index = i;
					}
				}
				
				int min = max;
				int index1 = 0;
				
				for(int i = 0; i<students.length; i++) {
					Student student = students[i];
					if(student.getScore()<min) {
						min = student.getScore();
						index1 = i;
					}
				}
				
				int sum = 0;
				
				for(Student student1 : students) {
					sum = sum + student1.getScore();
				}
				
				int result = sum - max - min;
				double avg = (double) result / (double)(studentNum - 2);
				
				System.out.println("최고 점수 : " + max + ", 학번 :" + students[index].getClassnum());
				System.out.println("최저 점수 : " + min + ", 학번 :" + students[index1].getClassnum());
				System.out.printf("최고점, 최저점을 제외한 평균 점수는 : %.2f점입니다.\n", avg);
				
				break;
				
			case 5:
				run = false;
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
