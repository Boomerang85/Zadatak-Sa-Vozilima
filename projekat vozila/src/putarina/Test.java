package putarina;

public class Test 
{
	public static void main(String[] args) 
	{
		Motocikl motocikl1 = new Motocikl();
		Auto auto1 = new Auto();
		Avion avion1 = new Avion();
		
		motocikl1.setBrojVozaca(1);
		auto1.setBrojPutnika(4);
		avion1.setKlasaAviona("biznis");
		
		System.out.println(motocikl1.NaplatiPutarinu());
		System.out.println(auto1.NaplatiPutarinu());
		System.out.println(avion1.NaplatiPutarinu());
	}

}
