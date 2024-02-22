package ex04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("autowired-context.xml");
		
		
		Printer pt = ctx.getBean(Printer.class);
		System.out.println( pt.getDocument().data );
		
		
		
	}
}
