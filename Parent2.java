package interfaceEx;

public interface Parent2 {

	default void call() {
		System.out.println("the method id called in parent 2");
	}
	static void tell() {
		System.out.println("tell in parent 2");
	}
	
}
