import java.util.*;
public class number_guess
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String play="yes";
        System.out.println("Welcome to the number guessing game :))");
        while(play.equals("yes"))
        {
            Random r=new Random();
            int num=r.nextInt(100);
            int gues=-1;
            int tries=0;
            while(gues!=num)
            {
                System.out.println("Guess a number between 1 to 100 -------");
                gues=sc.nextInt();
                tries++;
                if(gues==num)
                {
                    System.out.println("Woww!! You guessed the correct number in "+tries+" guesses!!");
                    System.out.println("Want to play again?? Yes or No :- ");
                    play=sc.next().toLowerCase();
                }
                else if(gues>num)
                    System.out.println("Your guess is too High!! Try Again :||");
                else
                    System.out.println("Your guess is too Low!! Try Again :|| ");
            }
        }
    }
}