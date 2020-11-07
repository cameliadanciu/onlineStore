/* Maria Camelia Danciu * Student ID: 21416657
 * Instructor: Dr Ikram Uk Rehman
 * This program simulates an online store.
 */
package bookstore;
import java.util.Scanner;
public class BookStore{
    //this method is displaying the books
    static void DisplayItems(){                                                                 
        System.out.println("************************************");
        System.out.println("*  1.Math book................$40  *");
        System.out.println("*  2.Programming with Java....$60  *");
        System.out.println("*  3.Programming with C++.....$65  *");
        System.out.println("*  4.Computer architecture....$50  *");
        System.out.println("* ________________________________ *");
        System.out.println("*    Choose book then quantity.    *");
        System.out.println("*       Press Q to finish.         *");
        System.out.println("************************************");
        System.out.print("Which book would you like to buy? ");
    }
    //this method is creating the Cart
    static void DisplayCart(int b1, int b2, int b3, int b4){                           

        System.out.println();
        System.out.println("*********  YOUR SHOPPING CART  **********");
        double total = 0;
        
        //if statements will calculate the book price total for the given quantity then add the totals for each book
        if(b1 > 0){
            double b1Total = b1*40;
            total+=b1Total;
            System.out.println("    " + b1 +"x Math book:               $" + b1Total);
        }
        if(b2 > 0){
            double b2Total = b2*60;
            total+=b2Total;
            System.out.println("    " + b2 +"x Programming with Java:   $" + b2Total);
        }
        if(b3 > 0){
            double b3Total = b3*65;
            total+=b3Total;
            System.out.println("    " + b3 +"x Programming with C++:    $" + b3Total);
        }
        if(b4 > 0){
            double b4Total = b4*50;
            total+=b4Total;
            System.out.println("    " + b4 +"x Computer Architecture:   $" + b4Total);
        }
            System.out.println("    Total: .....................$" + total);
            System.out.println("*****************************************");
    }
        public static void main(String[] args) {
            System.out.println("    WELCOME TO OUR BOOK STORE!");
            int b1 = 0, b2 = 0, b3 = 0, b4 = 0;
        
            while(true){
                DisplayItems();
                Scanner scanner = new Scanner(System.in);
                String input = scanner.next();
            
                //while loop stops if the user will enter an input Q or q
                if(input.equals("Q") || input.equals("q")){
                break;
                }
                else{
                    //switch will look for the book entered
                    switch(Integer.parseInt(input)){ //string is converted into int
                        case 1:                        
                            System.out.print("How many Math books would you like to buy? ");
                            b1 += scanner.nextInt();
                            break;
                        case 2:                        
                            System.out.print("How many Programming with Java books would you like to buy? ");
                            b2 += scanner.nextInt();
                            break;
                        case 3:                       
                            System.out.print("How many Programing with C++ books would you like to buy? ");
                            b3 += scanner.nextInt();
                            break;
                        case 4:                       
                            System.out.print("How many Computer Architecture books would you like to buy? ");
                            b4 += scanner.nextInt();
                            break; 
                    }        
                }
            }
        DisplayCart(b1, b2, b3, b4);
    }
}