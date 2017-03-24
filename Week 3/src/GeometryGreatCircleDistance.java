import java.util.Scanner;

public class GeometryGreatCircleDistance {

	public static void main(String[] args) {
		
		final double AVERAGE_EARTH_RADIUS = 6371.01;
		Scanner input = new Scanner(System.in);
		double x1, y1, x2, y2, d;
		System.out.println("Enter the coordinates for the first point: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();

		System.out.println("Enter the coordinates for the second point: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		
		d = AVERAGE_EARTH_RADIUS * 
				Math.acos(
						Math.sin(Math.toRadians(x1)) * 
						Math.sin(Math.toRadians(x2)) *
						Math.sin(Math.toRadians(x1)) * 
						Math.sin(Math.toRadians(x2)) *
						Math.sin(Math.toRadians(y1) -
						Math.sin(Math.toRadians(y2))
						));
		
		System.out.print("The distance is " + d);
		
		input.close();
	
	}

}
