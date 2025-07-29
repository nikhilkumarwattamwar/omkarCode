package stringprograms;

public class UserDetailsStringInterning {

	String name;
	String country;

	public UserDetailsStringInterning(String name, String country) {
		this.name = name;
		this.country = country.intern();
	}

	public static void main(String[] args) {
		UserDetailsStringInterning u1 = new UserDetailsStringInterning("Omkar", new String("India"));
		UserDetailsStringInterning u2 = new UserDetailsStringInterning("Aniket", new String("India"));
		System.out.println(u1.country == u2.country);
	}

}
