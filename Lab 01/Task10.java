import java.util.Scanner;
public class Task10{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Enter Number of row:");
    int row = sc.nextInt();
    
    for(int i = 1; i<=row; i++){
      
      for (int j = 1; j<=row-i; j++){
        System.out.print(" ");
      }
      
      for (int k = row-i+1; k<=row; k++){
        
       if (i==1|| i==row ||  k==row){ 
          System.out.print(k);
        }
        
        else {
          System.out.print(" ");
        }
        
      }
        
        System.out.println();
        
      }
    }
  }