package real.java.lesson;

public class Employee {
	private String name;
    private String position;
    
    public String getname() {
    	return name;
    }
    
    public String getPosition() {
    	return position;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setPosition(String position) {
    	this.position = position;
    }
    
    public void clockIn() {
    	System.out.println(this.name+"출근했습니다.");
    }
    
    public void clockOut() {
       	System.out.println(this.name+"퇴근했습니다.");
    }    	
    
    public void work() {
    	System.out.println(this.position+"입니다. 일을 합니다.");
    }
}
