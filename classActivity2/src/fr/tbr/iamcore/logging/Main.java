package fr.tbr.iamcore.logging;

//import fr.tbr.iamcore.logging.IamLog.Level;

public class Main {

	public static void main(String[] args) {

		IamLog logger = new IamLog(Main.class.getSimpleName());
		
		
		logger.log("Beginning of the program", "INFO");
		logger.log("Beginning of the program", "BlahBlah");
		logger.debug("Beginning of the program");		
		logger.log("Beginning of the program", IamLog.INFO); 
		logger.log("Beginning of the program", IamLog.WARN); 
		logger.log("Hi Adnan this is your msg", IamLog.INFO); 

		
//		logger.log("a sample", Level.INFO);
//		logger.log("a good sample", Level.WARN);
		
	}
}