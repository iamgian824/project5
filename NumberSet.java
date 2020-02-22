import java.util.*;
public class NumberSet {
 public static void main(String[] args) {
   
   Scanner sc = new Scanner(System.in);
   int set1[] = {1, 2, 3, 4, 5,} ;
   int set2[] = {6, 7 ,8, 2 ,9} ;
   boolean isFoundA = false;
   boolean isFoundB = false;
   
   System.out.print("Enter a number: ");
   int num = sc.nextInt();
   
   for(int i=0; i<set1.length; i++){
      if(set1[i]==num){
         isFoundA = true;
         break;
      }
   }
   for(int i=0; i<set2.length; i++){
      if(set2[i]==num){
         isFoundB = true;
         break;
      }
   }
   
   if(isFoundA&&isFoundB)
   System.out.print(num + " is an element of A and B");
   else if(isFoundA)
   System.out.print(num + " is an element of A");
   else if(isFoundB)
   System.out.print(num + " is an element of B");
   else
   System.out.print(num + " is not found in the two elements");
 }
}