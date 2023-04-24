package ValueasConstructorSchema;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("ValueasConstructorSchema/Config.xml");
		Student s=(Student) context.getBean("student");
		System.out.println(s.getName());
		System.out.println(s.getMarks());
		System.out.println(s.getAge());
	}
}
