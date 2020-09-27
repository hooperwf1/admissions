import java.util.Scanner;

public class Admissions {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("First Name: ");
		scanner.nextLine();
		System.out.print("Last Name: ");
		String name = scanner.nextLine();

		System.out.print("SAT score: ");
		int sat = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Class rank (0-100): ");
		int rank = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Number of awards: ");
		int awards = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Residence: ");
		String res = scanner.nextLine();
	
		if(sat < 1200 || rank < 85 || awards < 3 || "Florida".equals(res)){
			System.out.println("No metrics less than acceptable");	
			return;
		} 

		if("Padjen".equals(name)){
			System.out.println("Accepted - Last Name is Padjen");
			return;
		} 

		if((sat >= 1500 || rank >= 95 || awards >= 10 || "Colorado".equals(res))){
			System.out.println("Accepted - Elite metric");
			return;
		}

		int solid = 0;
		if(sat >= 1400)
			solid++;	
		if(rank >= 90)
			solid++;	
		if(awards >= 8)
			solid++;

		if(solid >= 2){
			System.out.println("Accepted - 2 solid metrics");
			return;
		}

		System.out.println("Declined - Get improved metrics");	

	}	
}
