package ex02;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import ex03.Customer;

public class MainClass {

	public static void main(String[] args) {
	
		//IOC컨테이너
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("application-context.xml");
		
		//빈의 이름들 확인
		String[] arr = ctx.getBeanDefinitionNames();
		System.out.println(  Arrays.toString(arr) );
		 
		//빈을 꺼낼때는 , 빈의 이름 or, 빈의 타입을 사용하는 reflect기법을 사용합니다.
		//Hotel h = (Hotel)ctx.getBean("hotel");
		
		//Hotel h = ctx.getBean(Hotel.class); //클래스 정보를 전달해서 사용하는 방법
		Hotel h = ctx.getBean("hotel", Hotel.class);
		h.getChef().cooking();
		
		
		MemberDAO dao = ctx.getBean(MemberDAO.class);
		System.out.println( dao.getDataSource().getUrl() );
				
		//IOC컨테이너 안에 빈들은 자동으로 싱글톤 형식을 띄게 됩니다.
		//만약 다르게 생성하고 싶다면  scope="prototype" 라고 적으면 됩니다
		MemberDAO dao2 = ctx.getBean(MemberDAO.class);
		System.out.println(dao == dao2);

		
	}
}
