package javaeigthfeatures;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.*;

public class FunctionalInterfaces {
	
	public static void main(String[] args) {
		
		List<Integer> marks=Arrays.asList(20,64,75,55,46,32);
		
		Predicate<Integer> isPassed=(n)->n>50;
		
		Function<Integer,String> toGrade=(m)->{
			if(m>=90) return "A";
			else if(m>=75) return "B";
			else if(m>=50) return "C";
			else return "Fail";
			
		};
		
		Consumer<String> studentsGrades=g->System.out.println("Grade: "+g); 
		
		Supplier<Integer> bonousMaks=()->5;
		
		BiFunction<Integer,Integer,Integer> add=(s,b)->s+b;
		
		marks.stream().filter(isPassed).map(m->add.apply(m,bonousMaks.get())).map(toGrade).forEach(studentsGrades);
	}

}
