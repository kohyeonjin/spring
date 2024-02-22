package ex01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		
//		Person p = new Person();
//		System.out.println(  p.getName() );

		
		//스프링의 방식으로 Person객체를 사용해봄 
		//new 키워드 쓰지 않을거임
		GenericXmlApplicationContext 
			ctx = new GenericXmlApplicationContext("application-context.xml");
		
		System.out.println(ctx);
		
		
		Person p = (Person)ctx.getBean("p");
		System.out.println( p.getName() );
			
		
		
	}
}
