package putarina;

import java.text.DecimalFormat;

public class Avion extends Vozilo 
{
	private String KlasaAviona;
	
	public Avion()
	{
		
	}
	
	DecimalFormat CenaPutarineFormat = new DecimalFormat("#.00");
	
	public double NaplatiPutarinu(double CenaPutarine)
	{
		if(KlasaAviona.contains("biznis"))
		{
			CenaPutarine = CenaPutarine * 0.25;
		}
		else if(KlasaAviona.contains("ekonomska"))
		{
			CenaPutarine = CenaPutarine * 0.15;
		}
		else 
		{
			System.out.println("Los unos");
		}
		
		return CenaPutarine;
	}

	public String getKlasaAviona() {
		return KlasaAviona;
	}

	public void setKlasaAviona(String klasaAviona) {
		KlasaAviona = klasaAviona;
	}
	
	
}
