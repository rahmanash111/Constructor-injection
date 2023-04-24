package ValueasAttribute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ValueasAttribute/config.xml");
		Country c = (Country) context.getBean("country");
		System.out.println(c.getName());
		System.out.println(c.getLanguage());
		System.out.println(c.getCurrency());
		System.out.println(c.getCapital());
	}
}
