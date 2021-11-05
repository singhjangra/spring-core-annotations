package djh.spring.core.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = {
			"Beware of Frauds",
			"The journey is the reward",
			"Get well Soon!"
	};
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		Random random = new Random();
		int index = random.nextInt(data.length);
		String myFortune = data[index];
		return myFortune;
	}

}
