package mixima.springdemo;

public class BaseballCoach implements Coach{

	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService thefortuneService) {
		fortuneService =thefortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		return "Play Games for 30 mins";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
