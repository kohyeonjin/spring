package ex05.javaconfig;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ex02.Hotel;
import quiz01.Computer;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(JavaConfig.class);
						
		Hotel h = ctx.getBean(Hotel.class);
		h.getChef().cooking();
		
		
		ctx.getBean(Computer.class).computerInfo();
		
		
		
		
		
		
	}
}
