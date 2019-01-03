package mixima.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public TrackCoach() {
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;

	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "track Play Hard";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "track Just Do It:"+fortuneService.getFortune();
	}

}
