/*The Westland Game Fair is the premier event of its kind for kids interested in some intellectual and cognitive brain games. Alan, a middle school boy is visiting the fair where he is very much drawn by the Card game.
The game’s rules are:
A player needs to pick 3 cards from a big lot of cards. There are 4 types of Cards namely Spade(S), Heart(H), Club(C) and Diamond (D). If all the 3 cards that the player picks are of the same type and same number, they get a Double Bonanza. If all the 3 cards are of the same type or if they all have the same number, they get a Bonanza. Otherwise they do not get a Bonanza. Alan has now picked 3 cards and is awaiting to know if he has got a bonanza. Please help him to know if he has won the Bonanza or not.
Input Format:
There are 3 lines of input.
Each of the line consists of character and integer input, which corresponds to the type of the card and the number in it that Alan picked. The type of card and the number are separated by a single space.
Output Format:
Output should display "Double Bonanza" or "Bonanza" or "No Bonanza" based on the conditions given.
Refer sample input and output for formatting specifications.
Sample Input 1:
S 5
S 5
S 5
Sample Output 1:
Double Bonanza
Sample Input 2:
S 6
S 5
H 5
Sample Output 2:
No Bonanza*/
import java.util.*;
class Cards{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first card character");
    char a=sc.next().charAt(0);
    System.out.println("enter first card number");
    int l=sc.nextInt();
    System.out.println("enter second card character");
    char b=sc.next().charAt(0);
    System.out.println("enter first card number");
    int m=sc.nextInt();
    System.out.println("enter third card character ");
    char c=sc.next().charAt(0);
    System.out.println("enter first card number");
    int n=sc.nextInt();
    if((a==b&&b==c)&&(l==m&&m==n)){
      System.out.println("double bonanza");
    }
    else if((a==b&&b==c)||(l==m&&m==n)){
      System.out.println(" bonanza");
    }
    else{
      System.out.println("no bonanza");
    }
    
  }
}
