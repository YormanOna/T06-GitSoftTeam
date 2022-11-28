package ec.espe.edu.MenuRestaurant.view;

import java.util.*;
import ec.espe.edu.MenuRestaurant.model.DataCreation;
/**
 *
 * @author GiftSoft Team, DCCO-ESPE
 */
public class Restuarant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int optionMenu = 0;
        int optionSubmenu;
        boolean leave = false;
        DataCreation.createFile("Order.csv");
        do{
        System.out.println("*******Choose the option******");
        System.out.println("1. Register your information");
        System.out.println("2. Order the food");
        System.out.println("3. Pay the order");
        System.out.println("4. Exit");
        
        
        System.out.print("Please type the option: ");
        optionMenu = sc.nextInt();
            
            switch(optionMenu){
               
                case 1 -> {
                    System.out.println("**********Enter Data********");
                    System.out.println("Customer name:");
                    String customerName = sc.next();
                    System.out.println("Address:");
                    String  address = sc.next();
                    System.out.println("Email:");
                    String email = sc.next();
                    
                    DataCreation.writeFile("Order.csv", "\n");
                    DataCreation.writeFile("Order.csv", "==========New Order============");
                    DataCreation.writeFile("Order.csv", "\n");
                    DataCreation.writeFile("Order.csv","Customer name");
                    DataCreation.writeFile("Order.csv","Email");
                    DataCreation.writeFile("Order.csv","Address");
                    DataCreation.writeFile("Order.csv", "\n");
                    DataCreation.writeFile("Order.csv",customerName);
                    DataCreation.writeFile("Order.csv", address);
                    DataCreation.writeFile("Order.csv", email);
                }
                case 2 -> {
                    while(!leave){
                        System.out.println("-----Menu Food-----");
                        System.out.println("1. Pizza");
                        System.out.println("2. Milanesa");
                        System.out.println("3. Panini");
                        System.out.println("4. Rissoto");
                        System.out.println("5. Drink");
                        System.out.println("6. Exit");
                        
                        try{
                        
                            System.out.println("Enter what you want to order");
                            optionSubmenu = sc.nextInt();
                            
                            switch (optionSubmenu) {
                                case 1 ->{
                                    System.out.println("You order a Pizza");
                                break;
                                }
                                case 2 ->{
                                    System.out.println("You order a Milanesa");
                                break;
                                }
                                case 3 ->{
                                    System.out.println("You order a Panini");
                                break;
                                }
                                case 4 ->{
                                    System.out.println("Your order a Rissoto");
                                break;
                                }
                                case 5 ->{
                                    System.out.println("You order a drink");
                                break;
                                }
                                case 6 ->{
                                return;
                                }
                                }
                        }catch(InputMismatchException e){
                            System.out.println("You have to enter a number");
                            sc.next();
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Your bill has been paid ");
                }
                case 4 -> {
                
                return;
                }
        }
            
        }while(optionMenu != 4);
    }
        
}
