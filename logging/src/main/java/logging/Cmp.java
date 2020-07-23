package logging;
import java.lang.Math;
public class Cmp {  
	Double intrestcalculation(Double principle,Double rate,Double time,Double incr)
	{
		Double ic=principle*Math.pow(1+rate/incr,incr*time);
		return ic-principle;
	}

}
