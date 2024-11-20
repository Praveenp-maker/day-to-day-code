package com.workout.dayToDay;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamImp {

	public static void main(String[] args) {
		
		
		List<Streams> people=List.of(new Streams(1,"kicha","tester","bio",true),
				new Streams(2,"cadu","lawyer","cs",false),
				new Streams(3,"praveen","rep","bio",true),
				new Streams(4,"kamal","code","cs",true),
				new Streams(1,"kamal","code","bio",false)
				);
		
		
//		List<Streams>selected =people.stream().filter(n->n.getNo()>2).collect(Collectors.toList());
		
	//	List<String>selected =people.stream().map(Streams::getName).collect(Collectors.toList());
		//List<String>selected =people.stream().map(Streams::getName).sorted().collect(Collectors.toList());
		//List<String>selected =people.stream().map(Streams::getName).distinct().collect(Collectors.toList());
	//	List<Streams>selected =people.stream().skip(3).collect(Collectors.toList());
		
	//	List<Streams>selected =people.stream().limit(1).collect(Collectors.toList());
		
	//	List<Streams>selected =people.stream().filter(n->n.getNo()>2&&n.getName().equals("kicha")).collect(Collectors.toList());
		
//		people.stream().forEach(n->System.out.println(n.getNo()+"   "+n.getName()+"   "+n.getWork()));
//		
//		long count =people.stream().count();
//		System.out.println(count);
		
		
//		List<String>selected =people.stream().filter(n->n.getNo()>1).map(Streams::getName).collect(Collectors.toList());
//              System.out.println(selected);
		

		//Map<Object,List<Map<String, Object>>> grpby=people.stream().collect(groupingBy(Streams::getName));

	}

}
