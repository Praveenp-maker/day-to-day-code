package backoffice;


		public class CallByValue {
		    public static void main(String[] args) {
		        MyObject obj = new MyObject(10);
		        modifyObject(obj);
		        System.out.println("Value after method call: " + obj.value); // Output: 20

		        resetObjectReference(obj);
		        System.out.println("Value after resetting reference: " + obj.value); // Output: 20
		    }

		    public static void modifyObject(MyObject obj) {
		        obj.value = 20;
		    }

		    public static void resetObjectReference(MyObject obj) {
		        obj = new MyObject(30); // This reassignment does not affect the original reference
		    }
		}

		class MyObject {
		    public int value;

		    public MyObject(int value) {
		        this.value = value;
		    }
		}

		



