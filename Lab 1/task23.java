import java.util.Scanner;
public class task23{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Enter Number of row:");
    int row = sc.nextInt();
    
    for(int i = 1; i<=row; i++){
      
      for (int j = 1; j<=row-i; j++){
        System.out.print(" ");
      }
      
      for (int k = 1; k<=row; k++){
        
        if (i == row || k==1 || k==i){
          System.out.print("*");
        }
        
        else {
          System.out.print(" ");
        }
      
      }
      
      System.out.println();
    
    }
  }
}
        
          