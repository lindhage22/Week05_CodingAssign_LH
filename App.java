package week05Logger;

public class App {


	public static void main(String[] args) {
		
		
		Logger logger = new AsteriskLogger();
		Logger logger1 = new SpacedLogger ();
		 
		
		logger1.log("Hello");
		logger1.error("Error");
		
	
		
		
	    logger1.close();

	}

}
