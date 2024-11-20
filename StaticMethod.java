package backoffice;


//class Car {
//
//	static String name;
//
//	public Car(String name) {
//		Car.name = name;
//	}
//
//}


public class StaticMethod {

	static class Car {

		 static String name;

		public Car(String name) {
			this.name = name;
		}

	}
	
	

	public static void main(String[] args) {

		Car a = new Car("suzuki");
		Car b = new Car("mahindra");

		System.out.println(a.name);
		System.out.println(b.name);

	}

}
