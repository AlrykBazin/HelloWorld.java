/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworld;
import java.util.Scanner;
/**
 *
 * @author abazin5
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        int X = 0;
        int Y = 0;
        int tmp = 0;
        
  System.out.print("Saisir X :");
  X = sc.nextInt();
  System.out.print("Saisir Y :");
  Y = sc.nextInt();
  
  tmp = X;
  X=Y;
  Y=tmp;
  System.out.println(" X : "+ X +" Y :"+ Y +"");
    }
    
}
