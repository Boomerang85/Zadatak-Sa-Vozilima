package putarina;

import java.text.DecimalFormat;

public class Auto extends Vozilo
{
	public int BrojPutnika;
	
	public void BrojPutnika()
	{
		
	}
	
	DecimalFormat CenaPutarineFormat = new DecimalFormat("#.00");
	
	public double NaplatiPutarinu()
	{
		return CenaPutarine = CenaPutarine + (BrojPutnika / 10) * CenaPutarine;
	}
	public int getBrojPutnika() {
		return BrojPutnika;
	}
	public void setBrojPutnika(int brojPutnika) {
		BrojPutnika = brojPutnika;
	}
	
	
}
