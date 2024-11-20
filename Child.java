package interfaceEx;

public class Child implements Parent1, Parent2{

	

	@Override
	public void call() {
		Parent1.super.call();
		Parent2.super.call();
	}
	
	public static void main(String[] args) {
		
		Child obj =new Child();
		
		obj.call();
		
		Parent1.tell();
		Parent2.tell();

	}

}
