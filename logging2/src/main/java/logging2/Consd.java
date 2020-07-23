package logging2;
import org.apache.log4j.Logger;
import java.util.Scanner;

public class Consd {
	static final Logger logger = Logger.getLogger(Consd.class);
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Which type of material you want\n 1)standard materials \n2)above standard materials\n 3) high standard material \n 4) high standard material and fully automated home" );
	int material_standards=sc.nextInt();
	System.out.print("Enter the area of the house in square feets");
	double house_area=sc.nextDouble();
	Consui details=new Consui();
	double house_cost;
	house_cost=details.construction(material_standards,house_area);
	System.out.print("cost of the House"+house_cost);
	sc.close();
	logger.debug("sample debug message");
	logger.info("sample info mesasge");
	logger.warn("sample warn message");
	logger.error("sampleerror message");
	logger.fatal("sample fatal message");
	}
}
