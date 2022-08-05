package Line_Comaprison.BridgeLabz;
/*******Added UC1*******
 * Calculating the Length of Line
 */
import java.util.Scanner;
public class Line_Comparison 
{
	public Double Length;
	public void values()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of X1:-");
		Double x1 = sc.nextDouble();
		
		System.out.println("Enter the value of X2:-");
		Double x2 = sc.nextDouble();
		
		System.out.println("Enter the value of Y1:-");
		Double y1 = sc.nextDouble();
		
		System.out.println("Enter the value of Y2:-");
		Double y2 = sc.nextDouble();	
		
		Integer Length = (int) Math.sqrt ( Math.pow ( ( x2 - x1 ), 2 ) * Math.pow ( ( y2 - y1 ), 2 ));
		 System.out.println("Length of the Line->" +Length);
		 	
			
	}
	
	public static void main(String a[])
	{
		Line_Comparison line = new Line_Comparison();
		line.values();
	}

}