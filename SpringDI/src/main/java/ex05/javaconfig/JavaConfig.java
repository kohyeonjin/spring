package ex05.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ex01.Person;
import ex02.Chef;
import ex02.DataSource;
import quiz01.Computer;
import quiz01.Keyboard;
import quiz01.Monitor;
import quiz01.Mouse;
import ex02.Hotel;
import ex02.MemberDAO;

@Configuration //***자바파일을 설정파일로 사용함***
public class JavaConfig {
	
//	<bean id="p" class="ex01.Person" />
	@Bean
	public Person p() {
		return new Person();
	}
//	<bean id="chef" class="ex02.Chef"/>
//	<bean id="hotel" class="ex02.Hotel" >
//		<constructor-arg ref="chef"/>
//	</bean>
	@Bean
	public Chef chef() {
		return new Chef();
	}
	@Bean
	public Hotel hotel() {
		return new Hotel(chef());
	}
	
//	<bean id="ds" class="ex02.DataSource">
//	<property name="url" value="oracle:thin:@localhost~~~" />
//	<property name="uid" value="hr" />
//	<property name="upw" value="hr" />
//	</bean>
	@Bean
	public DataSource ds() {
		DataSource ds = new DataSource();
		ds.setUrl("~~~~~~");
		ds.setUid("hr");
		ds.setUpw("hr");
		return ds;
	}
//	<bean id="memberDAO" class="ex02.MemberDAO"> 
//	<property name="dataSource" ref="ds" />
//	</bean>
	@Bean
	public MemberDAO memberDAO() {
		MemberDAO dao = new MemberDAO();
		dao.setDataSource(ds());
		return dao;
	}
	
	//com, monitor, mouse, keyboard
	//자바로 등록하면????
	
	@Bean
	public Computer computer() {
		return new Computer();
	}
	
	@Bean
	public Monitor monitor() {
		return new Monitor();
	}
	
	@Bean
	public Mouse xx() {
		return new Mouse();
	}
	
	@Bean
	public Keyboard key() {
		return new Keyboard();
	}
	
	
	
	
	
	
}
