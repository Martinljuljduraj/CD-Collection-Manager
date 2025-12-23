// Driver for CDCollection class

import java.util.Scanner;

public class DriverCD
{
   public static void main(String[] args)
   {
      // instantiate Scanner object
      Scanner scan = new Scanner(System.in);

      // data
      int choice, ans;
      String answer = "yes";
      
      // instantiate CD collection = create brand new empty CD rack
      CDCollection music = new CDCollection();
      
      // add CD
      music.addCD("From Elvis in Memphis", "Elvis Presley", 11, 32.99);
      
      // print details of CD collection
      System.out.println(music);
      
      // add 2nd CD
      music.addCD("Short n' Sweet", "Sabrina Carpenter", 12, 21.99);
      System.out.println(music);
      
      // add 3rd CD
      music.addCD("Boy Meets World", "Sleepy Hallow", 18, 25.99);
      System.out.println(music);
      
      // try to remove a cd
      while(answer.equals("yes"))
      {
         System.out.println("1 for first CD, 2 for second CD, 3 for thrid CD, 4 to show collection");
         choice = scan.nextInt();
         // switch structure
         switch(choice)
         {
            case 1:
                  {
                  System.out.println("From Elvis in Memphis - Elvis Presley - 11 - 32.99");
                  music.removeCD();
                  }
                  break;
            case 2:
                  {
                  System.out.println("Short n' Sweet - Sabrina Carpenter - 12 - 21.99");
                  music.removeCD();
                  }
                  break;
            case 3:
                  {
                  System.out.println("Boy Meets World - Sleepy Hallow - 18 - 25.99");
                  music.removeCD();
                  }
                  break;
            case 4:
                  {
                  System.out.println("Remaining music: " + music.getCost());
                  }
                  break;
            default:
                  System.out.println("Invalid Entry!");
         }// end switch
         
         scan.nextLine();// this will catch the extra newline char after the int
         
         System.out.println("Ok. Do you want to change anything else? yes or no: ");
         answer = scan.nextLine();
      }// end while
      System.out.println("Here's your collection");
   }
}