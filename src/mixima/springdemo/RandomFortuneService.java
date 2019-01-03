package mixima.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
		
	private Random rand = new Random();
	
	@Override
	public String getFortune() {
	
		String[] list= {"Fucked Up","Not Bad","Lucky Day"};
		int i=rand.nextInt(list.length);
		return list[i];
	}

}
