package putarina;

import java.text.DecimalFormat;

public class Avion extends Vozilo 
{
	public String KlasaAviona;
	
	public void KlasaAviona()
	{
		
	}
	
	DecimalFormat CenaPutarineFormat = new DecimalFormat("#.00");
	
	public double NaplatiPutarinu()
	{
		if(KlasaAviona.contains("biznis"))
		{
			CenaPutarine = CenaPutarine * 0.25;
		}
		if(KlasaAviona.contains("ekonomska"))
		{
			CenaPutarine = CenaPutarine * 0.15;
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
