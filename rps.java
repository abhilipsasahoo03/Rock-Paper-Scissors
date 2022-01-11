import java.util.*;
import java.lang.Math;

 class rps
 {
   public static void HumComp()
   {
     
   }
   
   public static void main(String args[])
   { 
    Scanner sc=new Scanner(System.in);
    char ch;
    boolean flag=true;
    
    System.out.println("•••••WELCOME TO ROCK-PAPER-SCISSORS GAME•••••");
    while(flag==true)
    {
      System.out.println("\n\n1-Human vs Computer \n2-Human vs Human \n3-Exit \nEnter an option: ");
      int opt=sc.nextInt();
      switch(opt)
      {
        case 1:
            int hscore=0, cscore=0;
            char computer[]={'R', 'P', 'S'};
            System.out.println("Human: Choose rock, scissors, or paper:");
            char human = sc.next().charAt(0);
            int rand= (int)(Math.random() * 4) + 0;
            char comp=computer[rand];
            if(comp==human)
              System.out.print("\nIt is a tie!");
     
            else if((comp=='P'&&human=='R')||(comp=='R'&&human=='S')||(comp=='S'&&human=='P'))
               {
                  System.out.print("\nComputer won!");
                  cscore++;
                  System.out.print("\nScoreboard: \nC: "+cscore+" H: "+hscore);
               }
            else if((human=='P'&&comp=='R')||(human=='R'&&comp=='S')||(human=='S'&&comp=='P'))
               {
                  System.out.print("\nHuman won!");
                  hscore++;
                  System.out.print("\nScoreboard: \nC: "+cscore+" H "+hscore);
               }
            break;
         case 2:
            
          
          int score1=0, score2=0;
          System.out.println("Player 1: Choose rock, scissors, or paper:");
          char player1 = sc.next().charAt(0);
          System.out.println("Player 2: Choose rock, scissors, or paper:");
          char player2 = sc.next().charAt(0);

          if (player1==player2)
            System.out.print("\nIt is a tie");
          else if((player1=='P'&&player2=='R')||(player1=='R'&&player2=='S')||(player1=='S'&&player2=='P'))
          {
            System.out.print("\nPlayer 1 won");
            score1++;
            System.out.print("\nScoreboard: \nP1: "+score1+" P2: "+score2);
          }
          else if((player2=='P'&&player1=='R')||(player2=='R'&&player1=='S')||(player2=='S'&&player1=='P'))
          {
            System.out.print("\nPlayer 2 won");
            score2++;
            System.out.print("\nScoreboard: \nP1: "+score1+" P2: "+score2);
          }
            
            break;
          case 3:
            flag=false;
          default:
            System.out.println("Please enter a valid choice!");
        }
      }
   }
 }
