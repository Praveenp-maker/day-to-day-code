package List;

import java.util.ArrayList;

public class CheckArrayList {

	public static void main(String[] args) {
		
		EModel p1=new EModel(1,"praveen","sd");
//		EModel p2=new EModel(2,"sathya","lh");
//		EModel p3=new EModel(3,"sakthi","loh");
	ArrayList<EModel>values=new ArrayList<>();
	values.add(p1);
//	values.add(p2);
//	values.add(p3);
	
	System.out.println(values.get(0));
	

	}

}
