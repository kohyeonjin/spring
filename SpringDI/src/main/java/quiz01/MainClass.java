package quiz01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("autowired-context.xml");
		
		Computer com = (Computer)ctx.getBean("computer");
		com.computerInfo();	
		
	}
}
