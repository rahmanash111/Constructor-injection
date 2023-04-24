package SetOfValues;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("SetOfValues/config.xml");
	Player p=(Player)context.getBean("player");
	System.out.println(p.getTeams());
}
}
