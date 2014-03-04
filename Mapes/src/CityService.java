


public class CityService {
	
	private String origin;
	private String target;
	
	public CityService() {}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}
	
	public int getDistancesFrom(){
		City c = new City();
		return c.getDistance(origin, target);
		
	}
	
}
