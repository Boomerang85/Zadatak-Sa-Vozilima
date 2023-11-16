package putarina;

import java.text.DecimalFormat;

public class Auto extends Vozilo
{
	private int BrojPutnika;
	
	public Auto()
	{
		
	}
	
	DecimalFormat CenaPutarineFormat = new DecimalFormat("#.00");
	
	public double NaplatiPutarinu(double CenaPutarine)
	{
		CenaPutarine = CenaPutarine + (CenaPutarine / 10) * BrojPutnika;
		
		return CenaPutarine;
	}

	public int getBrojPutnika() {
		return BrojPutnika;
	}

	public void setBrojPutnika(int brojPutnika) {
		BrojPutnika = brojPutnika;
	}

	
}
