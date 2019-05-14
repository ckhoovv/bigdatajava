package java18;

public class Member2 {
	String title;
	String content;
	String name;
	String pw;
	public Member2(String title, String content, String name, String pw) {
		this.title = title;
		this.content = content;
		this.name = name;
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "Member2 [title=" + title + ", content=" + content + ", name=" + name + ", pw=" + pw + "]";
	}
	
	

}
