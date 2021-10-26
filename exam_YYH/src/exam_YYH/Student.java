package exam_YYH;

public class Student {

	int classnum;
	String name;
	int score;
	
	public Student(int classnum, String name, int score) {
		this.classnum = classnum;
		this.name = name;
		this.score = score;
	}
	
	public int getClassnum() {
		return this.classnum;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getScore() {
		return this.score;
	}
}
