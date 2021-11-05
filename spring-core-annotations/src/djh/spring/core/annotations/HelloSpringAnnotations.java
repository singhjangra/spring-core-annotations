package djh.spring.core.annotations;


import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloSpringAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*
		 * Coach coach = context.getBean("thatSillyCoach",Coach.class);
		 * System.out.println("-----------------"+coach.getDailyWorkOut());
		 */
		
		Coach coach =  context.getBean("tenisCoach",Coach.class);
		
		System.out.println("-----------------"+coach.getDailyWorkOut());
		System.out.println("-----------------"+coach.getDailyFortune());
		
		context.close();
	}

}
