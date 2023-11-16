package putarina;

public class Test 
{
	public static void main(String[] args) 
	{
		Motocikl motocikl1 = new Motocikl();
		Auto auto1 = new Auto();
		Avion avion1 = new Avion();
		
		motocikl1.setBrojVozaca(2);
		auto1.setBrojPutnika(4);
		avion1.setKlasaAviona("ekonomska");
		
		System.out.println(motocikl1.NaplatiPutarinu(motocikl1.getCenaPutarine()));
		System.out.println(auto1.NaplatiPutarinu(auto1.getCenaPutarine()));
		System.out.println(avion1.NaplatiPutarinu(avion1.getCenaPutarine()));
	}

}
