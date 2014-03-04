import java.util.ArrayList;
import java.util.HashMap;


public class City {
	private String name;	private ArrayList<HashMap<String,Integer>> distances;
	private HashMap<String,Integer> cities; // index per ArraList
	private String origin;
	private String target;
	private String iFrame;
	private int X;
	private int Y;
	private int X2;
	private int Y2;
	private int centerX;
	private int centerY;
	private int zoom;

	public City(){
		cities = new HashMap<String, Integer>();
		distances = new ArrayList<HashMap<String, Integer>>();
		calculteDistances();
	}
	
	public City(String origin, String target) {
		super();
		this.origin = origin;
		this.target = target;
		cities = new HashMap<String, Integer>();
		distances = new ArrayList<HashMap<String, Integer>>();
		calculteDistances();
		calculateCenter();
		calculateZoom();
	}

	@Override
	public String toString() {
		return "name";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void calculteDistances(){
		
		HashMap<String, Integer> esCastell = new HashMap<String, Integer>();
			esCastell.put("Mao",3);
			esCastell.put("Sant Lluis",4);
			esCastell.put("Alaior",12);
			esCastell.put("Es Mercadal",16);
			esCastell.put("Es Migjorn",14);
			esCastell.put("Ferreries",25);
			esCastell.put("Ciutadella",40);
			esCastell.put("getX",610295);
			esCastell.put("getY",4415192);
		cities.put("Es Castell",0);
		distances.add(esCastell);
		//------------------------------------------------//
		HashMap<String, Integer> mao = new HashMap<String, Integer>();
			mao.put("Es Castell",3);
			mao.put("Sant Lluis",3);
			mao.put("Alaior",8);
			mao.put("Es Mercadal",12);
			mao.put("Es Migjorn",10);
			mao.put("Ferreries",21);
			mao.put("Ciutadella",40);
			mao.put("getX",607876);
			mao.put("getY",4416196);
		cities.put("Mao",1);
		distances.add(mao);
		//------------------------------------------------//
		HashMap<String, Integer> santLluis = new HashMap<String, Integer>();
			santLluis.put("Mao",3);
			santLluis.put("Es Castell",4);
			santLluis.put("Alaior",11);
			santLluis.put("Es Mercadal",13);
			santLluis.put("Es Migjorn",13);
			santLluis.put("Ferreries",24);
			santLluis.put("Ciutadella",43);
			santLluis.put("getX",607634);
			santLluis.put("getY",4411835);
		cities.put("Sant Lluis",2);
		distances.add(santLluis);
		//------------------------------------------------//
		HashMap<String, Integer> alaior = new HashMap<String, Integer>();
			alaior.put("Mao",8);
			alaior.put("Es Castell",11);
			alaior.put("Sant Lluis",11);
			alaior.put("Es Mercadal",4);
			alaior.put("Es Migjorn",4);
			alaior.put("Ferreries",6);
			alaior.put("Ciutadella",32);
			alaior.put("getX",597431);
			alaior.put("getY",4421053);
		cities.put("Alaior",3);
		distances.add(alaior);
		//------------------------------------------------//
		HashMap<String, Integer> esMercadal = new HashMap<String, Integer>();
			esMercadal.put("Mao",16);
			esMercadal.put("Es Castell",23);
			esMercadal.put("Alaior",4);
			esMercadal.put("Sant Lluis",23);
			esMercadal.put("Es Migjorn",11);
			esMercadal.put("Ferreries",7);
			esMercadal.put("Ciutadella",25);
			esMercadal.put("getX",593360);
			esMercadal.put("getY",4427026);
		cities.put("Es Mercadal",4);
		distances.add(esMercadal);
		//------------------------------------------------//
		HashMap<String, Integer> esMigjorn = new HashMap<String, Integer>();
			esMigjorn.put("Mao",8);
			esMigjorn.put("Es Castell",12);
			esMigjorn.put("Alaior",7);
			esMigjorn.put("Sant Lluis",12);
			esMigjorn.put("Es Mercadal",10);
			esMigjorn.put("Ferreries",20);
			esMigjorn.put("Ciutadella",28);
			esMigjorn.put("getX",589679);
			esMigjorn.put("getY",4422345);
		cities.put("Es Migjorn",5);
		distances.add(esMigjorn);
		//------------------------------------------------//
		HashMap<String, Integer> ferreries = new HashMap<String, Integer>();
			ferreries.put("Mao",25);
			ferreries.put("Es Castell",28);
			ferreries.put("Alaior",18);
			ferreries.put("Sant Lluis",28);
			ferreries.put("Es Mercadal",5);
			ferreries.put("Es Migjorn",12);
			ferreries.put("Ciutadella",12);
			ferreries.put("getX",586391);
			ferreries.put("getY",4426445);
		cities.put("Ferreries",6);
		distances.add(ferreries);
		//------------------------------------------------//
		HashMap<String, Integer> ciutadella = new HashMap<String, Integer>();
			ciutadella.put("Mao",40);
			ciutadella.put("Es Castell",43);
			ciutadella.put("Alaior",33);
			ciutadella.put("Sant Lluis",43);
			ciutadella.put("Es Mercadal",20);
			ciutadella.put("Ferreries",12);
			ciutadella.put("Es Migjorn",25);
			ciutadella.put("getX",571314);
			ciutadella.put("getY",4428157);
		cities.put("Ciutadella",7);
		distances.add(ciutadella);
	}
	
	public int getDistance(String from, String to) {
		this.origin = from;
		this.target = to;
		if (from.equals(to)) return 0;
		this.X = distances.get(cities.get(from)).get("getX");
		this.Y = distances.get(cities.get(from)).get("getY");
		this.X2 = distances.get(cities.get(to)).get("getX");
		this.Y2 = distances.get(cities.get(to)).get("getY");
		this.iFrame = "<iframe width='625' height='500' frameborder='0' scrolling='no' marginheight='0' marginwidth='0' src='http://ide.cime.es/visorIDE/Iframe.aspx?wkid=25831&x="+this.X+"&y="+this.Y+"&zoom=6&srv=http%3A%2F%2Fide.cime.es%2FCache%2FIDEMenorca%2Fbaserefcatxe%2F_alllayers%2CWmsVacio.ashx&capas=%2C0&trans=1%2C0&tit=%2C'></iframe>";

		calculateCenter();
		calculateZoom();
		
		return distances.get(cities.get(from)).get(to);

	}
	
	public int getZoom() {
		return zoom;
	}

	public void setZoom(int zoom) {
		this.zoom = zoom;
	}

	private void calculateCenter(){
		this.centerX = (this.X + this.X2) / 2;
		this.centerY = (this.Y + this.Y2)/ 2 ;
	}
	
	private void calculateZoom() {
		int i = Math.abs(this.X - this.X2);
		if (i < 10000) this.zoom = 5;
		else if (i >= 10000 && i < 25000 ) this.zoom = 4;
		else this.zoom = 3;
	}

	public int getCenterX() {
		return centerX;
	}

	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}

	public int getCenterY() {
		return centerY;
	}

	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}

	public int getX2() {
		return X2;
	}

	public void setX2(int x2) {
		X2 = x2;
	}

	public int getY2() {
		return Y2;
	}

	public void setY2(int y2) {
		Y2 = y2;
	}

	public ArrayList<HashMap<String, Integer>> getDistances() {
		return distances;
	}

	public void setDistances(ArrayList<HashMap<String, Integer>> distances) {
		this.distances = distances;
	}

	public HashMap<String, Integer> getCities() {
		return cities;
	}

	public void setCities(HashMap<String, Integer> cities) {
		this.cities = cities;
	}

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

	public String getiFrame() {
		return iFrame;
	}

	public void setiFrame(String iFrame) {
		this.iFrame = iFrame;
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}
	
	public String googleMap(String from, String to, String method){
		String map = "";
		if ((from.equals("Mao") && to.equals("Alaior")) || (from.equals("Alaior") && to.equals("Mao"))) {
			if (method.equals("car"))
				map = "<iframe width='900' height='700' frameborder='0' scrolling='no' marginheight='0' marginwidth='0' src='https://maps.google.es/maps?f=d&amp;source=s_d&amp;saddr=Alaior&amp;daddr=Ma%C3%B3,+Illes+Balears&amp;hl=ca&amp;geocode=FRJaYQIdVSs_ACl1f9j6xSC-EjGeqJsF728i2w%3BFeKhYAIdI_9AACmPZBRLl4eVEjE_9XZX4IrP6Q&amp;aq=&amp;sll=39.888731,4.257889&amp;sspn=0.059798,0.132093&amp;mra=ls&amp;ie=UTF8&amp;t=m&amp;ll=39.915135,4.213085&amp;spn=0.092164,0.154324&amp;z=13&amp;output=embed'></iframe><br /><small><a href='https://maps.google.es/maps?f=d&amp;source=embed&amp;saddr=Alaior&amp;daddr=Ma%C3%B3,+Illes+Balears&amp;hl=ca&amp;geocode=FRJaYQIdVSs_ACl1f9j6xSC-EjGeqJsF728i2w%3BFeKhYAIdI_9AACmPZBRLl4eVEjE_9XZX4IrP6Q&amp;aq=&amp;sll=39.888731,4.257889&amp;sspn=0.059798,0.132093&amp;mra=ls&amp;ie=UTF8&amp;t=m&amp;ll=39.915135,4.213085&amp;spn=0.092164,0.154324&amp;z=13' style='color:#0000FF;text-align:left'>Mostra un mapa més gran</a></small>";
			else if (method.equals("foot"))
				map = "<iframe width='900' height='700' frameborder='0' scrolling='no' marginheight='0' marginwidth='0' src='https://maps.google.es/maps?f=d&amp;source=s_d&amp;saddr=Alaior&amp;daddr=Ma%C3%B3,+Illes+Balears&amp;hl=ca&amp;geocode=FRJaYQIdVSs_ACl1f9j6xSC-EjGeqJsF728i2w%3BFeKhYAIdI_9AACmPZBRLl4eVEjE_9XZX4IrP6Q&amp;aq=&amp;sll=39.912831,4.199095&amp;sspn=0.059777,0.132093&amp;dirflg=w&amp;mra=ltm&amp;ie=UTF8&amp;ll=39.912831,4.199095&amp;spn=0.047105,0.119838&amp;t=m&amp;output=embed'></iframe><br /><small><a href='https://maps.google.es/maps?f=d&amp;source=embed&amp;saddr=Alaior&amp;daddr=Ma%C3%B3,+Illes+Balears&amp;hl=ca&amp;geocode=FRJaYQIdVSs_ACl1f9j6xSC-EjGeqJsF728i2w%3BFeKhYAIdI_9AACmPZBRLl4eVEjE_9XZX4IrP6Q&amp;aq=&amp;sll=39.912831,4.199095&amp;sspn=0.059777,0.132093&amp;dirflg=w&amp;mra=ltm&amp;ie=UTF8&amp;ll=39.912831,4.199095&amp;spn=0.047105,0.119838&amp;t=m' style='color:#0000FF;text-align:left'>Mostra un mapa més gran</a></small>";
		}
		else if ((from.equals("Mao") && to.equals("Es Castell")) || (from.equals("Es Castell") && to.equals("Mao"))){ 
			if (method.equals("car"))
				map = "<iframe width='900' height='700' frameborder='0' scrolling='no' marginheight='0' marginwidth='0' src='https://maps.google.es/maps?f=d&amp;source=s_d&amp;saddr=Es+Castell&amp;daddr=Ma%C3%B3,+Illes+Balears&amp;hl=ca&amp;geocode=FQiEYAIdW3JBACljgUKeFIeVEjE3vzEAmUYmng%3BFeKhYAIdI_9AACmPZBRLl4eVEjE_9XZX4IrP6Q&amp;aq=0&amp;oq=Es+Castel&amp;sll=39.884082,4.274397&amp;sspn=0.014951,0.033023&amp;mra=ltm&amp;ie=UTF8&amp;t=m&amp;ll=39.883503,4.272921&amp;spn=0.008714,0.035118&amp;output=embed'></iframe><br /><small><a href='https://maps.google.es/maps?f=d&amp;source=embed&amp;saddr=Es+Castell&amp;daddr=Ma%C3%B3,+Illes+Balears&amp;hl=ca&amp;geocode=FQiEYAIdW3JBACljgUKeFIeVEjE3vzEAmUYmng%3BFeKhYAIdI_9AACmPZBRLl4eVEjE_9XZX4IrP6Q&amp;aq=0&amp;oq=Es+Castel&amp;sll=39.884082,4.274397&amp;sspn=0.014951,0.033023&amp;mra=ltm&amp;ie=UTF8&amp;t=m&amp;ll=39.883503,4.272921&amp;spn=0.008714,0.035118' style='color:#0000FF;text-align:left'>Mostra un mapa més gran</a></small>";
			else if (method.equals("foot"))
				map = "<iframe width='900' height='700' frameborder='0' scrolling='no' marginheight='0' marginwidth='0' src='https://maps.google.es/maps?f=d&amp;source=s_d&amp;saddr=Es+Castell&amp;daddr=Ma%C3%B3,+Illes+Balears&amp;hl=ca&amp;geocode=FQiEYAIdW3JBACljgUKeFIeVEjE3vzEAmUYmng%3BFeKhYAIdI_9AACmPZBRLl4eVEjE_9XZX4IrP6Q&amp;aq=0&amp;oq=Es+Castel&amp;sll=39.910921,4.199781&amp;sspn=0.059779,0.132093&amp;dirflg=w&amp;mra=ls&amp;ie=UTF8&amp;t=m&amp;ll=39.884082,4.274397&amp;spn=0.008762,0.02946&amp;output=embed'></iframe><br /><small><a href='https://maps.google.es/maps?f=d&amp;source=embed&amp;saddr=Es+Castell&amp;daddr=Ma%C3%B3,+Illes+Balears&amp;hl=ca&amp;geocode=FQiEYAIdW3JBACljgUKeFIeVEjE3vzEAmUYmng%3BFeKhYAIdI_9AACmPZBRLl4eVEjE_9XZX4IrP6Q&amp;aq=0&amp;oq=Es+Castel&amp;sll=39.910921,4.199781&amp;sspn=0.059779,0.132093&amp;dirflg=w&amp;mra=ls&amp;ie=UTF8&amp;t=m&amp;ll=39.884082,4.274397&amp;spn=0.008762,0.02946' style='color:#0000FF;text-align:left'>Mostra un mapa més gran</a></small>";
		}
		else if ((from.equals("Mao") && to.equals("Ciutadella")) || (from.equals("Ciutadella") && to.equals("Mao"))){ 
			if (method.equals("car"))
				map = "<iframe width='900' height='700' frameborder='0' scrolling='no' marginheight='0' marginwidth='0' src='https://maps.google.es/maps?f=d&amp;source=s_d&amp;saddr=Ciutadella+de+Menorca,+Illes+Balears&amp;daddr=Ma%C3%B3,+Illes+Balears&amp;hl=ca&amp;geocode=FYxWYgIduZM6ACkPiQirCgS-EjEefHA2L6RFgQ%3BFeKhYAIdI_9AACmPZBRLl4eVEjE_9XZX4IrP6Q&amp;aq=1&amp;oq=ciutadella&amp;sll=39.883503,4.272921&amp;sspn=0.029901,0.066047&amp;mra=ls&amp;ie=UTF8&amp;t=m&amp;ll=39.950866,4.047555&amp;spn=0.127026,0.424223&amp;output=embed'></iframe><br /><small><a href='https://maps.google.es/maps?f=d&amp;source=embed&amp;saddr=Ciutadella+de+Menorca,+Illes+Balears&amp;daddr=Ma%C3%B3,+Illes+Balears&amp;hl=ca&amp;geocode=FYxWYgIduZM6ACkPiQirCgS-EjEefHA2L6RFgQ%3BFeKhYAIdI_9AACmPZBRLl4eVEjE_9XZX4IrP6Q&amp;aq=1&amp;oq=ciutadella&amp;sll=39.883503,4.272921&amp;sspn=0.029901,0.066047&amp;mra=ls&amp;ie=UTF8&amp;t=m&amp;ll=39.950866,4.047555&amp;spn=0.127026,0.424223' style='color:#0000FF;text-align:left'>Mostra un mapa més gran</a></small>";
			else if (method.equals("foot"))
				map = "<iframe width='900' height='700' frameborder='0' scrolling='no' marginheight='0' marginwidth='0' src='https://maps.google.es/maps?f=d&amp;source=s_d&amp;saddr=Ciutadella+de+Menorca,+Illes+Balears&amp;daddr=Ma%C3%B3,+Illes+Balears&amp;hl=ca&amp;geocode=FYxWYgIduZM6ACkPiQirCgS-EjEefHA2L6RFgQ%3BFeKhYAIdI_9AACmPZBRLl4eVEjE_9XZX4IrP6Q&amp;aq=1&amp;oq=ciutadella&amp;sll=39.950866,4.047555&amp;sspn=0.238976,0.528374&amp;dirflg=w&amp;mra=ltm&amp;ie=UTF8&amp;ll=39.950806,4.047432&amp;spn=0.122601,0.420765&amp;t=m&amp;output=embed'></iframe><br /><small><a href='https://maps.google.es/maps?f=d&amp;source=embed&amp;saddr=Ciutadella+de+Menorca,+Illes+Balears&amp;daddr=Ma%C3%B3,+Illes+Balears&amp;hl=ca&amp;geocode=FYxWYgIduZM6ACkPiQirCgS-EjEefHA2L6RFgQ%3BFeKhYAIdI_9AACmPZBRLl4eVEjE_9XZX4IrP6Q&amp;aq=1&amp;oq=ciutadella&amp;sll=39.950866,4.047555&amp;sspn=0.238976,0.528374&amp;dirflg=w&amp;mra=ltm&amp;ie=UTF8&amp;ll=39.950806,4.047432&amp;spn=0.122601,0.420765&amp;t=m' style='color:#0000FF;text-align:left'>Mostra un mapa més gran</a></small>";
		} else map = "<iframe width='900' height='700' frameborder='0' scrolling='no' marginheight='0' marginwidth='0' src='https://maps.google.es/maps?f=q&amp;source=s_q&amp;hl=ca&amp;geocode=&amp;q=menorca&amp;aq=&amp;sll=40.396764,-3.713379&amp;sspn=15.181739,33.815918&amp;ie=UTF8&amp;hq=&amp;hnear=Menorca&amp;ll=39.949629,4.110445&amp;spn=0.478081,1.056747&amp;t=m&amp;z=11&amp;output=embed'></iframe><br /><small><a href='https://maps.google.es/maps?f=q&amp;source=embed&amp;hl=ca&amp;geocode=&amp;q=menorca&amp;aq=&amp;sll=40.396764,-3.713379&amp;sspn=15.181739,33.815918&amp;ie=UTF8&amp;hq=&amp;hnear=Menorca&amp;ll=39.949629,4.110445&amp;spn=0.478081,1.056747&amp;t=m&amp;z=11' style='color:#0000FF;text-align:left'>Mostra un mapa més gran</a></small>";
		return map;
	}
}
