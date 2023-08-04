package decorator;

public class StudentTeam extends StudentDecorator{

	protected StudentTeam(StudentComponent student) {
		super(student);
		// TODO Auto-generated constructor stub
	}
	public void reportHomework() {
		System.err.println("Nhóm của " + this.student.getName() + " báo cáo bài tập");
	}
	@Override
	public void doHomework() {
		student.doHomework();
		reportHomework();
	}
}
