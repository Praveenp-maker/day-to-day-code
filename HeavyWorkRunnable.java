package Thread;

public class HeavyWorkRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Doing heavy processing - START "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            //Get database connection, delete unused data from DB
            doDBProcessing();
            doFetchData();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Doing heavy processing - END "+Thread.currentThread().getName());
    }

    private void doDBProcessing() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("do db calc");
    }
    private void doFetchData() {
    	System.out.println("doFetchData");
    }
    
    public static void main(String args[]) {
    	
    	  Thread t1 = new Thread(new HeavyWorkRunnable(), "t1");
    	  Thread t2 = new Thread(new HeavyWorkRunnable(), "t2");
    	  
    	  System.out.println("Starting Runnable threads");
          t1.start();
          t2.start();
    }

}