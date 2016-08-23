public class Task_5 { 

	public static void main(String[] args){

		double roomLength = 5;    // Room dimensions
		double roomHeight = 10;
		double roomWidth = 5;

		System.out.println("CheapoMax"); // Paint Supplier name

		double surfaceArea = (2*roomLength*roomHeight)+(2*roomHeight*roomWidth); // Determines the surface Area of the room, assumes rectangular. 
		System.out.println("Surface area of room: " +surfaceArea); 

		double CheapoMax = 200;             // Sets the Price, Capacity 
		double CheapoMaxPrice = 19.99;
		double CheapoMaxCapacity = 20;

		double temp = (surfaceArea/CheapoMax) + 0.99;        // Determines the Number of tins of paint needed
		int CheapoNumber=(int)temp;
		System.out.println("Number of tins needed: "+CheapoNumber);

		double CheapoPrice = CheapoNumber*CheapoMaxPrice; // Determines the Total Cost of the paint required
		System.out.print("Total Cost of paint: £");
		System.out.printf("%.2f",  +CheapoPrice); 

		System.out.println();

		double CheapoWasted = (CheapoMax*CheapoNumber)%surfaceArea; // Determines the Paint Wasted
		System.out.print("Paint wasted (in litres):");
		System.out.printf("%.2f", +CheapoWasted);

		System.out.println();
		System.out.println();

		System.out.println("AverageJoes");

		System.out.println("Surface area of room: " +surfaceArea);

		double JoesMax = 165;
		double JoesMaxPrice = 17.99;
		double JoesCapacity = 15;

		double temp2 = (surfaceArea/JoesMax)  + 0.99;   // Determines the Number of tins of paint needed
		int JoesNumber = (int)temp2;
		System.out.println("Number of tins needed: "+JoesNumber);

		double JoesPrice = JoesNumber*JoesMaxPrice;    // Determines the Total Cost of the paint required
		System.out.print("Total Cost of paint: £");
		System.out.printf("%.2f", +JoesPrice);

		System.out.println();

		double JoesWasted = (JoesMax*JoesNumber)%surfaceArea;   // Determines the Paint Wasted
		System.out.print("Paint wasted: ");
		System.out.printf("%.2f", +JoesWasted);


		System.out.println();
		System.out.println();

		System.out.println("DuluxourousPaints");

		System.out.println("Surface area of room: " +surfaceArea);

		double DPaintsMax = 200;
		double DPaintsMaxPrice = 25;
		double DPaintsCapacity = 10;

		double temp3 = (surfaceArea/DPaintsMax) + 0.99 ;  // Determines the Number of tins of paint needed
		int DPaintsNumber = (int)temp3;
		System.out.println("Number of tins needed: "+DPaintsNumber);

		double DPaintsPrice = DPaintsNumber*DPaintsMaxPrice;    // Determines the Total Cost of the paint required
		System.out.print("Total Cost of paint: £");
		System.out.printf("%.2f", +DPaintsPrice);

		System.out.println();

		double DPaintsWasted = (DPaintsMax*DPaintsNumber)%surfaceArea;    // Determines the Paint Wasted
		System.out.print("Paint wasted: ");
		System.out.printf("%.2f", +DPaintsWasted);


		System.out.println();
		System.out.println();

		if ((CheapoPrice < JoesPrice) && (CheapoPrice < DPaintsPrice)) // Determine the Cheapest Paint by comparing prices
		{
			System.out.println("Cheapest Paint is CheapoMax");
		}
		else if ((JoesPrice < CheapoPrice) && (JoesPrice < DPaintsPrice))
		{
			System.out.println("Cheapest Paint is AverageJoes");
		}
		else if ((DPaintsPrice < CheapoPrice) && (DPaintsPrice < JoesPrice))
		{
			System.out.println("Cheapest Paint is DuluxorousPaints");
		}	
		else if ((CheapoPrice == JoesPrice) && (CheapoPrice < DPaintsPrice))
		{
			System.out.println("Cheapest Paint is CheapoMax & AverageJoes");

		}

		System.out.println();
		System.out.println();

		if ((CheapoWasted < JoesWasted) && (CheapoWasted < DPaintsWasted)) // Determine the Least Paint Wasted by comparing
		{
			System.out.println("Least Waste is CheapoMax");
		}
		else if ((JoesWasted < CheapoWasted) && JoesWasted < DPaintsWasted)
		{
			System.out.println("Least Waste is AverageJoes");
		}
		else if ((DPaintsWasted < CheapoWasted) && (DPaintsWasted < JoesWasted))
		{
			System.out.println("Least Waste is DuluxorousPaints");
		}
		else if ((CheapoWasted == JoesWasted) && (CheapoWasted < DPaintsWasted))
		{
			System.out.println("Least Waste is CheapoMax & AverageJoes");
		}
		else if ((CheapoWasted == DPaintsWasted) && (CheapoWasted < JoesWasted))
		{
			System.out.println("Least Waste is CheapoMax & DuluxorousPaints");
		}
		else if ((JoesWasted == DPaintsWasted) && (JoesWasted < CheapoWasted))
		{
			System.out.println("Least Waste is AverageJoes & DuluxorousPaints");

		}
	}
}


