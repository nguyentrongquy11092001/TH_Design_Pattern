package decorator;

public class StudentDecorator implements StudentComponent{
	protected StudentComponent student;
	
	protected StudentDecorator(StudentComponent student) {
		super();
		this.student = student;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return student.getName();
	}

	@Override
	public void doHomework() {
		// TODO Auto-generated method stub
		student.doHomework();
	}
	
	
}
