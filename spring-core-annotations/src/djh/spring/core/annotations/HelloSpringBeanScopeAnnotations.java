package djh.spring.core.annotations;


import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloSpringBeanScopeAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("tenisCoach",Coach.class);
		System.out.println("-----------------"+coach.getDailyWorkOut());
		System.out.println("-----------------"+coach.getDailyFortune());
		System.out.println("-----------------"+coach.hashCode());
		/*
		 * Coach alphacoach = context.getBean("tenisCoach",Coach.class);
		 * 
		 * System.out.println("-----------------"+alphacoach.getDailyWorkOut());
		 * System.out.println("-----------------"+alphacoach.getDailyFortune());
		 * System.out.println("-----------------"+alphacoach.hashCode());
		 */
		context.close();
	}

}
