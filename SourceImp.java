package array;

import java.util.ArrayList;
import java.util.List;

public class SourceImp {

	public String printIndex(ArrayList<String> list ,int ind) {
		if(list != null && list.size()>0) {
			return list.get(ind);
		}
		return null;
		}
	
	
	public ArrayList<String> addnafterm(ArrayList<String> list ,String n,String m){
		
		ArrayList<String> listnew=new ArrayList<>(); 
		for(int i=0;i<list.size();i++) {
			
			if(n==list.get(i)) {
				list.add(i+1, m);
			}
		}
	return list;
		
		
	}
	
	public ArrayList<String> appendValue(ArrayList<String> list,int ind){
		
		String valStored=list.get(ind);
		list.remove(ind);
		
		list.add(valStored);
		
		return list;
		
	}
	
	public static void main(String[] args) {

		SourceImp a=new SourceImp();
		ArrayList<String> newarray=new ArrayList<String>();
		
		String arr[]= {"Friends","Breaking Bird","sherlock","stanger Things"};
		for(String val:arr) {
			newarray.add(val);
		}
		System.out.println(a.printIndex(newarray,3));
		System.out.println(a.addnafterm(newarray, "Breaking Bird","Young Sheldon"));
		System.out.println(a.appendValue(newarray, 2));
		
	}

}
