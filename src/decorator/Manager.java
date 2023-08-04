package decorator;

public class Manager extends StudentDecorator{

	protected Manager(StudentComponent student) {
		super(student);
		// TODO Auto-generated constructor stub
	}
	public void doTask() {
		System.out.println("Là lớp trưởng " + this.student.getName() + " thực hiện giao nhiệm vụ");
	}
	@Override
	public void doHomework() {
		student.doHomework();
		doTask();
	}
}
