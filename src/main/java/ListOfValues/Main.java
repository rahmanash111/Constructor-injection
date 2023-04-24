package ListOfValues;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("ListOfValues/config.xml");
		
		Ipl ipl=(Ipl) context.getBean("ipl");
		
		System.out.println(ipl.getName());
		System.out.println(ipl.getColor());
		System.out.println(ipl.getPlayers());
	}
}
