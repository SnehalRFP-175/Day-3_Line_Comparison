package Line_Comaprison.BridgeLabz;
/*******Added UC2*******
 * Checking Two Lines are Equal or Not
 */
import java.util.Scanner;
public class Line_Comparison 
{
	public Double Length;
	public Double values()
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
		
		Length = (Double) Math.sqrt ( Math.pow ( ( x2 - x1 ), 2 ) * Math.pow ( ( y2 - y1 ), 2 ));
		 System.out.println("Length of the Line->" +Length);
		 	
		 return Length;
			
	}
	
	public static void main(String a[])
	{
		Line_Comparison line1 = new Line_Comparison();
		Double l1 = line1.values();
		String s1 = Double.toString(l1);
		
		Line_Comparison line2 = new Line_Comparison();
		Double l2 = line2.values();
		String s2 = Double.toString(l2);
		
		
		if(s1.equals(s2)) 
		{
			System.out.println("Length of Line-1 and Length of Line-2 are equal....");
		}
		else 
			System.out.println("Length of Line-1 and Length of Line-2 are not equal.......");
			
	}
}