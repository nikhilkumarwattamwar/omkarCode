package stringprograms;

public class StudentStringInterning {
	
	 private String name;

	    public StudentStringInterning(String name) {
	        this.name = name.intern();
	    }

	    public String getName() {
	        return name;
	    }

	    public static void main(String[] args) {
	    	StudentStringInterning s1 = new StudentStringInterning("Omkar");
	    	StudentStringInterning s2 = new StudentStringInterning(new String("Omkar"));
	    	StudentStringInterning s3 = new StudentStringInterning("Java");

	        System.out.println(s1.getName() == s2.getName());
	        System.out.println(s1.getName() == s3.getName());
	    }

}
