package decorator;

public class StudentConcreteComponent implements StudentComponent{
	private String name;
	
	
	public StudentConcreteComponent(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void doHomework() {
		// TODO Auto-generated method stub
		System.out.println("Là học sinh " + this.getName() + " phải làm bài tập");
	}

}
