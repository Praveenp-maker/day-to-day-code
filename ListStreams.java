package declarationbasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ListStreams {

	public static void main(String[] args) {
	
	List<String>abs =new ArrayList<String>();	
		abs.add("abstract");
		abs.add("interface");
		abs.add("streams");
		abs.add("like");
		
		abs.forEach(f->{
			System.out.println(f);
			});
		System.out.println("--------------------------------");
		
		abs.stream().filter(f->
			f.contains("ik")).skip(4).forEach(t->{
			System.out.println(t);
		});
		
		System.out.println("--------------------------------");
		
		
		long count =abs.stream().filter(f->f.length()<5).count();
		
		System.out.println("Count "+ count);
		
		
		Stream<String> stream = abs.stream();
        
		stream.forEach(System.out::println);
		         
		//stream.forEach(System.out::println);   
		
		//example – findFirst(), findAny(), limit() etc.
		
		
		//Optional<String> first =abs.stream().limit(count);
		
		
		//System.out.println(first.toString());
		
	}

}
