package backoffice;

public class Quiz {

	void calcBill(){
		class Invoice{
			void print() {
				System.out.println("invoice printed");
			}
		}
		new Invoice().print();
	}
	public static void main(String[] args) {
		new Quiz().calcBill();

	}

}
