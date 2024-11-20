package interfaceEx;

public interface Parent1 {
	default void call() {
		System.out.println("the method id called in parent 1");
	}
	static void tell() {
		System.out.println("tell in parent 1");
	}
}
