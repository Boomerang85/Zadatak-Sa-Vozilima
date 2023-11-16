package putarina;

import java.text.DecimalFormat;

public abstract class Vozilo 
{
	public double CenaPutarine = 100;
	
	DecimalFormat CenaPutarineFormat = new DecimalFormat("#.00");
	
	public void CenaPutarine()
	{
		
	}
	
	public double NaplatiPutarinu()
	{
		return CenaPutarine;
	}
	public double getCenaPutarine() {
		return CenaPutarine;
	}
	public void setCenaPutarine(double cenaPutarine) {
		CenaPutarine = cenaPutarine;
	}
	
}
