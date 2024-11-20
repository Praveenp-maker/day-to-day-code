package List;

import java.util.ArrayList;
import java.util.List;


interface Test1 {
    void print();
}
 
public class ListInsideAnotherList {

	 static void fun(Test1 t) { t.print(); }
	
//	interface funcInterface{
//		  void abstractFun(int x);
//	}
//	
	public static void main(String[] args) {
		
		 fun(() -> System.out.println("Hello"));

//		List<List<String>>schools= new ArrayList<>();
//		
//		
//		schools.add(List.of("attur","srv","vivekananda"));
//		schools.add(List.of("salem","srdd","djcndcnk"));
//		schools.add(List.of("pnpalayam","dnc","snbhs"));
//		schools.add(List.of("saravanampatti","dcn","jdcbjd"));
		
//		schools.stream().forEach(innerList->innerList.forEach(value->System.out.print(value+" "));
//				System.out.println();
//	});

 
	 
//		schools.stream()
//          .map(innerList -> innerList.stream()
//                  .map(Object::toString)
//                  .reduce((a, b) -> a + " " + b)
//                  .orElse(""))
//          .forEach(System.out::println);
//	
//		funcInterface obj=(int x)->System.out.println("value of x  "+ x);
//		
//		obj.abstractFun(5);
}


}


