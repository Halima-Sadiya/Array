package array;

import java.util.Scanner;

public class Array {
    static Scanner user_input=new Scanner(System.in);
    public static void main(String[] args) {
        
        //Print 10 string
        
        String [] fruit=new String[10];
        fruit[0]="Apple";
        fruit[1]="Coconut";
        fruit[2]="Lemon";
        fruit[3]="Pomegranate";
        fruit[4]="Lichi";
        fruit[5]="Mango";
        fruit[6]="Starfruit";
        fruit[7]="Ar kono";
        fruit[8]="Fruit er nam";
        fruit[9]="Mathay ashtese na";
        
        System.out.println(fruit[0]);
        System.out.println(fruit[1]);
        System.out.println(fruit[2]);
        System.out.println(fruit[3]);
        System.out.println(fruit[4]);
        System.out.println(fruit[5]);
        System.out.println(fruit[6]);
        System.out.println(fruit[7]);
        System.out.println(fruit[8]);
        System.out.println(fruit[9]);
        
        System.out.println();
        System.out.println();
        
        
        //Sumation and avg using ForLoop in Array
        
        int [] number=new int[10];
        double sum=0;
        System.out.println("ENTER THE 10 NUMBERS :");
        
        for(int i=0;i<number.length;i++){
            number[i]=user_input.nextInt();
        }
        
        for(int j=0;j<number.length;j++){
            sum=sum+number[j];
        }
        System.out.println(sum);
        
        double avg=sum/number.length;
        System.out.println("The Avarage Number is - "+avg);
   }
    
}
