
import org.apache.log4j.Logger;

public class HelloWorld {
	static Logger log = Logger.getLogger(HelloWorld.class.getName());
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /* Get actual class name to be printed on */
		   log.debug("Hello this is a debug message");
		   log.info("Hello this is an info message");
		   log.error("Hello this is an error message");
		   log.error("Hello this is an Selenium Error");
	}

}
