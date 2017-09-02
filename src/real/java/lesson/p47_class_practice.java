package real.java.lesson;

public class p47_class_practice {
    static class cat {
    	String name;
    	String color;
    	
    	cat(String name, String color) {
    	    this.name = name;
    	    this.color = color;
    	
    }
	public static void main(String[] args) {
		cat a = new cat("goni", "brown");
		System.out.println(a.name + "," + a.color);

	}

}

}