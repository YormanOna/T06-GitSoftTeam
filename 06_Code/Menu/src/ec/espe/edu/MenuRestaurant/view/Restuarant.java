package ec.espe.edu.MenuRestaurant.view;

import java.util.Scanner;
/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class Restuarant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        do{
        System.out.println("*******Choose the option******");
        System.out.println("1. Register your information");
        System.out.println("2. Order the food");
        System.out.println("3. Pay the order");
        System.out.println("4. Exit");
        
        
        System.out.print("Please type the option: ");
        option = sc.nextInt();
            
            switch(option){
               
                case 1 -> {
 
                }
                case 2 -> {

                }
                case 3 -> {

                }
                case 4 -> {
                }
        }
            
        }while(option!=4);
    }
    
}
