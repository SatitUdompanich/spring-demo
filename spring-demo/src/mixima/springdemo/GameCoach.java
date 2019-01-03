package mixima.springdemo;

public class GameCoach implements Coach {

	private FortuneService fortuneService;
	private String email;
	private String team;

	public GameCoach() {

	}

	public GameCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Game!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
