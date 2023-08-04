package decorator;

public class Leader extends StudentDecorator{

	protected Leader(StudentComponent student) {
		super(student);
		// TODO Auto-generated constructor stub
	}
	private void doAttendace() {
		System.err.println("Là tổ trưởng " + this.student.getName() + " thực hiện điểm danh");
	}
	@Override
	public void doHomework() {
		student.doHomework();
		doAttendace();
	}
}
