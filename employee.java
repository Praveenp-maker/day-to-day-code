package backoffice;

public class employee implements Cars{


	public static void main(String[] args) {
		employee employee = new employee();
		employee.calculateNum();

	}

	@Override
	public long calculateNum() {
		System.out.println("0");
		output n=new output();
		n.calculateNum();
		return 0;
		
	}
}
	
	class output implements Cars{

		@Override
		public long calculateNum() {
			System.out.println("01");
			Thread dmovThread = new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						int i=9;
						while(i<10) {
							System.out.println("i value is "+i);
							i--;
						}
						
					} catch (Exception e) {
						System.out.println("terminated");
					}
				}

			});
			dmovThread.start();

			return 0;
			
		}
		
	}


