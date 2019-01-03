package mixima.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		GameCoach theCoach = context.getBean("myDynamicCoach",GameCoach.class);
		
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		context.close();

	}

}
