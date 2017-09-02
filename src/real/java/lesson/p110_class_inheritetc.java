package real.java.lesson;

public class p110_class_inheritetc {
	public static void main(String[] args) {
		Employee emp = new Employee();
		PartTime part = new PartTime();
		
		emp.setPosition("일반사원");
		part.setPosition("아르바이트");
		
		emp.work();
		part.work();
	}
}