package ValueasProperty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ValueasProperty/Config.xml");
		Laptop l = (Laptop) context.getBean("laptop");
		System.out.println(l.getCompany());
		System.out.println(l.getModel());
		System.out.println(l.getStorage());
	}

}
