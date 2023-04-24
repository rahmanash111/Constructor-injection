package MapOfValues;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("MapOfValues/config.xml");
	Movie m=(Movie)	context.getBean("movie");
	System.out.println(m.getName());
	System.out.println(m.getActors());
	}
}
