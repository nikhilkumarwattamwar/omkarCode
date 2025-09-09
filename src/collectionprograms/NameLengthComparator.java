package collectionprograms;

import java.util.Comparator;

public class NameLengthComparator implements Comparator<StudentDetails> {

	public int compare(StudentDetails object1, StudentDetails object2) {

		return Integer.compare(object1.name.length(), object1.name.length());
	}

}
