import java.util.Scanner;

public class CoffeeMachine {
	static Scanner scan = new Scanner(System.in);
	public double coffee_powder, milk, water;
    public int Coffee_Count = 0;
	CoffeeMachine() {
		super();
		this.coffee_powder = 0.0;
		this.milk = 0.0;
		this.water = 0.0;
	}
	
	private void SetIngredient(){   //Calling for Filling Ingredient...
        System.out.println("\nFilling...");
        this.coffee_powder = 500.0;
        this.milk = 2;
        this.water= 2;
        System.out.println("Filling Completed.");
    }
    private void GetIngredient(){   //To Get Status
            System.out.println("Available Coffee Powder: "+String.format("%.1f",this.coffee_powder)+ " Grams");
            System.out.println("Available Milk: "+String.format("%.1f", this.milk) + " Litres");
            System.out.println("Available Water: "+String.format("%.1f", this.water) + " Litres");
    }
    
    private void CleanMachine(){    //Initialization with Null In order to Clean Machine
        System.out.println("\nCleaning Machine...");
        this.coffee_powder = 0;
        this.milk = 0;
        this.water= 0;
        System.out.println("Cleaning Completed.");
    }
    
    private void makecoffee(){  //Coffee Selection Menu
        System.out.println("\n ------------------ ");
        System.out.println("|   Select Type:   |\n "
        		         + "------------------ \n| "
        		         + "1:  Black Coffee |\n| "
        		         + "2:   Espresso    |\n| "
        		         + "3:     Latte     |\n| "
        		         + "4:   Cappuccino  |\n| "
        		         + "0     MainMenu   |");
        System.out.println(" ------------------ \n");
        int t = scan.nextInt();
        switch(t){
            case 1:
                this.BlackCoffee();     //Call to BlackCoffee Method
                break;
            case 2:
                this.Espresso();      //Call to MilkCoffee Method
                break;
            case 3:
            	this.Latte();
            	break;
            case 4:
            	this.Capuccino();
            	break;
            case 0:
                break;
        }
    }
    
    private void BlackCoffee(){
        if(this.coffee_powder >= 10 && this.water >= 0.2){
            System.out.println("\nMaking Black Coffee...");
            System.out.println("\nTaking 10gm of Coffee.");
            this.coffee_powder = this.coffee_powder - 10;
            System.out.println("Taking 0.2 liter of Water.");
            this.water = this.water - 0.2;
            System.out.println("\nYour Black Coffee is Ready.");
            this.Coffee_Count++;
        }
        else{
            System.out.println("\nAvailable Coffee Powder:"+String.format("%.1f",this.coffee_powder +"Grams"));
            System.out.println("Available Water: "+String.format("%.1f", this.water+"Litres"));
            System.out.println("\nInsufficient Ingredients, Please Fill before Making Coffee.");
        }
    }
    
    private void Espresso(){
        if(this.coffee_powder >= 18 && this.milk >= 0.4 && this.water >= 0.2){
            System.out.println("\nMaking Espresso Coffee...");
            System.out.println("\nTaking 18gm of Coffee Powder.");
            this.coffee_powder = this.coffee_powder - 18;
            System.out.println("Taking 0.4 Liter of Milk.");
            this.milk = this.milk - 0.4;
            System.out.println("Taking 0.2 liter of Water.");
            this.water = this.water - 0.2;
            System.out.println("\nYour Milk Coffee is Ready.");
            this.Coffee_Count++;
        }
        else{
            System.out.println("\nAvailable Coffee Powder: "+String.format("%.1f",this.coffee_powder) +"Grams");
            System.out.println("Available Milk: "+String.format("%.1f", this.milk)+"Litres");
            System.out.println("Available Water: "+String.format("%.1f", this.water+"Litres"));
            System.out.println("\nInsufficient Ingredients, Please Fill before Making Coffee.");
        }
    }
    
    private void Latte(){
        if(this.coffee_powder >= 20 && this.milk >= 0.5 && this.water >= 0.3){
            System.out.println("\nMaking Latte Coffee...");
            System.out.println("\nTaking 15gm of Coffee Powder.");
            this.coffee_powder = this.coffee_powder - 15;
            System.out.println("Taking 0.4 Liter of Milk.");
            this.milk = this.milk - 0.4;
            System.out.println("Taking 0.2 liter of Water.");
            this.water = this.water - 0.2;
            System.out.println("Adding Milk Froth");
            this.coffee_powder = this.coffee_powder - 5;
            this.milk = this.milk - 0.1;
            this.water = this.water - 0.1;
            System.out.println("\nYour Espresso Coffee is Ready.");
            this.Coffee_Count++;
        }
        else{
            System.out.println("\nAvailable Coffee Powder: "+String.format("%.1f",this.coffee_powder) +"Grams");
            System.out.println("Available Milk: "+String.format("%.1f", this.milk)+"Litres");
            System.out.println("Available Water: "+String.format("%.1f", this.water+"Litres"));
            System.out.println("\nInsufficient Ingredients, Please Fill before Making Coffee.");
        }
    }
    
    private void Capuccino(){
        if(this.coffee_powder >= 24 && this.milk >= 0.6 && this.water >= 0.4){
            System.out.println("\nMaking Capuccino Coffee...");
            System.out.println("\nTaking 20gm of Coffee Powder.");
            this.coffee_powder = this.coffee_powder - 20;
            System.out.println("Taking 0.3 Liter of Milk.");
            this.milk = this.milk - 0.3;
            System.out.println("Taking 02 liter of Water.");
            this.water = this.water - 0.2;
            System.out.println("Adding Milk Froth");
            this.coffee_powder = this.coffee_powder - 4;
            this.milk = this.milk - 0.3;
            this.water = this.water - 0.3;
            System.out.println("\nYour Capuccino Coffee is Ready.");
            this.Coffee_Count++;
        }
        else{
            System.out.println("\nAvailable Coffee Powder: "+String.format("%.1f",this.coffee_powder) +"Grams");
            System.out.println("Available Milk: "+String.format("%.1f", this.milk)+"Litres");
            System.out.println("Available Water: "+String.format("%.1f", this.water+"Litres"));
            System.out.println("\nInsufficient Ingredients, Please Fill before Making Coffee.");
        }
    }


public void start(){    
    System.out.println(" ----------------------------------------------------------------");
    System.out.println("|                          !!Welcome!!                           |");
    System.out.println(" ----------------------------------------------------------------");
    System.out.println("\n################ Main Menu ###################");
    this.SetIngredient();
    this.GetIngredient();
    boolean t = true;
    while(t){
        //System.out.println("\n ********************************* ");
        System.out.println("\n *********************************\n"
        		         +"|1:    Quantity of Ingredients    |\n "
        		         + "*********************************\n|"
        		         + "2:      Re-Fill Ingredients      |\n"
        		         + " *********************************\n|"
        		         + "3:        Clean Machine          |\n"
        		         + " *********************************\n|"
        		         + "4:          Make Coffee          |\n"
        		         + " *********************************\n|"
        		         + "5: How many Coffee We have made? |\n"
        		         + " *********************************\n|"
        		         + "6:             Exit              |\n"
        		         + " *********************************\n");
        char c = CoffeeMachine.scan.next().charAt(0);
        switch(c){
            case '1': 
                System.out.println("------------- Status ------------");
                                this.GetIngredient();
                System.out.println("---------------------------------");
                break;
            case '2':
                this.SetIngredient();
                System.out.println("************* Status *************");
                this.GetIngredient();
                System.out.println("**********************************");
                break;
            case '3':
                this.CleanMachine();
                System.out.println("************* Status *************");
                this.GetIngredient();
                System.out.println("**********************************");
                break;
            case '4':
                this.makecoffee();
                break;
            case '5':
                System.out.println("\nWe Have Made "+this.Coffee_Count+" Coffees.");
                break;
            case '6':
                System.out.println("\nExiting...\n");
                t = false;
                break;
        }   
    }
}
}