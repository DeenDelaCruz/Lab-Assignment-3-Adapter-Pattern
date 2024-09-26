import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Laptop laptopDevice = new Laptop();
        PowerOutlet laptopOutlet = new LaptopAdapter(laptopDevice);

        Refrigerator fridgeDevice = new Refrigerator();
        PowerOutlet fridgeOutlet = new RefrigeratorAdapter(fridgeDevice);

        SmartphoneCharger phoneCharger = new SmartphoneCharger();
        PowerOutlet phoneOutlet = new SmartphoneAdapter(phoneCharger);

        Scanner input = new Scanner(System.in);

        while (true) {

            menu(); 
            int option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println(laptopOutlet.plugIn());
                    break;

                case 2:
                    System.out.println(fridgeOutlet.plugIn());
                    break;

                case 3:
                    System.out.println(phoneOutlet.plugIn());
                    break;

                case 4:
                    exitApp(input);  
                    break;

                default:
                    System.out.println("Invalid option.");
            }
            System.out.println();
        }
    }

    private static void menu() {

        System.out.println("\nPower Outlet App\n");
        System.out.println("1. Laptop");
        System.out.println("2. Refrigerator");
        System.out.println("3. Smartphone");
        System.out.println("4. Exit");
        System.out.print("Select an option: ");
    }

    private static void exitApp(Scanner input) {
        
        System.out.println("Shutting down...");
        input.close();
        System.exit(0);
    }
}