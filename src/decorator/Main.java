package decorator;

public class Main {
	public static void main(String[] args) {
		System.out.println("Học sinh: ");
		StudentComponent studentComponent = new StudentConcreteComponent("Quý");
		studentComponent.showInformation();
		studentComponent.doHomework();
		
		System.out.println("\nNhóm học sinh: ");
		StudentComponent stdTeam= new StudentTeam(studentComponent);
		stdTeam.showInformation();
		stdTeam.doHomework();
		
		System.out.println("\nTổ trưởng: ");
		StudentComponent leader= new Leader(studentComponent);
		leader.showInformation();
		leader.doHomework();
		
		System.out.println("\nLớp trưởng: ");
		StudentComponent manager= new Manager(studentComponent);
		manager.showInformation();
		manager.doHomework();
		
		System.out.println("\nVừa làm lớp trưởng và tổ trưởng: ");
		StudentComponent managerAndLeader= new Manager(leader);
		managerAndLeader.showInformation();
		managerAndLeader.doHomework();
	}
}
