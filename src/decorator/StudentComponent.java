package decorator;

public interface StudentComponent {
	String getName();
	void doHomework();
	
	default void showInformation() {
        System.out.println("Tên học sinh: " + getName());
    }
}
