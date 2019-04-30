package »ý¼ºÀÚ;

public class Member2 {
	String ID;
	String PW;
	String grade;
	int point;
	public Member2(String iD, String pW, String grade, int point) {
		ID = iD;
		PW = pW;
		this.grade = grade;
		this.point = point;
	}
	@Override
	public String toString() {
		return "Member2 [ID=" + ID + ", PW=" + PW + ", grade=" + grade + ", point=" + point + "]";
	}
	

}
