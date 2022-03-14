class ThreadId extends Thread { 
    public void run()  { 
        try { 
            // Displaying the thread that is running 
            System.out.println ("Thread " + Thread.currentThread().getId() + " is running"); 
        } 
        catch (Exception e)  { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    } 
} 
public class Threadsdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int n = 8; // Number of threads 
       while(true) {
            ThreadId object = new ThreadId(); 
            object.start(); 
            Thread.sleep(n);
        } 
	}

}
