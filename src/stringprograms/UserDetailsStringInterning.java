package stringprograms;

public class UserDetailsStringInterning {

	String name;
	String country;

	public UserDetailsStringInterning(String name, String country) {
		this.name = name;
		this.country = country.intern();
	}

	public static void main(String[] args) {
		UserDetailsStringInterning firstUser = new UserDetailsStringInterning("Omkar", new String("India"));
		UserDetailsStringInterning secondUser = new UserDetailsStringInterning("Aniket", new String("India"));
		System.out.println(firstUser.country == secondUser.country);
	}

}
