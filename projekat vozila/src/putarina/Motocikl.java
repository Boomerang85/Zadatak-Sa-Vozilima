package putarina;

import java.text.DecimalFormat;

public class Motocikl extends Vozilo
{
	private int BrojVozaca;
	
	public Motocikl()
	{
		
	}
	
	DecimalFormat CenaPutarineFormat = new DecimalFormat("#.00");
	
	public double NaplatiPutarinu(double CenaPutarine)
	{
		if(BrojVozaca == 1)
		{
			CenaPutarine = CenaPutarine * 0.8;
		}
		else
		{
			CenaPutarine = CenaPutarine * 0.7;
		}
		
		return CenaPutarine;
	}
	public int getBrojVozaca() {
		return BrojVozaca;
	}
	public void setBrojVozaca(int brojVozaca) {
		BrojVozaca = brojVozaca;
	}
	
	
}
