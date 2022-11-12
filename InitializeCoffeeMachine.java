import java.util.Scanner;

public class InitializeCoffeeMachine {

	public static void main(String[] args) {
		 char response;
		// Stating or Shuting of Coffee Machine
		Scanner sc =new Scanner(System.in);
		System.out.println("\nDo you want to start the Coffee Machine ? \n Press 'Y' for Yes and 'N' for No");
		response=sc.next().charAt(0);
		
		if(response=='Y' || response=='y') {
			System.out.println("Starting... \n");
			CoffeeMachine cf = new CoffeeMachine();
			cf.start();
		}
		else {
            System.out.println("Shutting Down...\n");
   		}
		


	}

}
