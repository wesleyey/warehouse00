package real.java.lesson;

public class p110_class_inheritetc {
	public static void main(String[] args) {
		Employee emp = new Employee();
		PartTime part = new PartTime();
		
		emp.setPosition("�Ϲݻ��");
		part.setPosition("�Ƹ�����Ʈ");
		
		emp.work();
		part.work();
	}
}