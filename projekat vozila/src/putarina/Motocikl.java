package putarina;

import java.text.DecimalFormat;

public class Motocikl extends Vozilo
{
	public int BrojVozaca;
	
	public void BrojVozaca()
	{
		
	}
	
	DecimalFormat CenaPutarineFormat = new DecimalFormat("#.00");
	
	public double NaplatiPutarinu()
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
