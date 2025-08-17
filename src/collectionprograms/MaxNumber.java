package collectionprograms;
import java.util.*;
public class MaxNumber {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>( Arrays.asList(58,14,45,52));
		
		
		Comparator<Integer> comp=new Comparator<Integer>() {
			
			public int compare(Integer obj1,Integer obj2) {
				return obj2.compareTo(obj1);
			}
		};
		
		Collections.sort(list,comp);
		
		try {
		
		int maxNumber=list.get(0);
		System.out.println("MaxNumber is : "+maxNumber);
		}catch(IndexOutOfBoundsException ioe) {
			System.out.println(ioe.getMessage());
			System.out.println("You are trying to access invalid index");
		}
	}

}
