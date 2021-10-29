import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    int hamCheck = 0; 
    int score = 0; 

    System.out.println("Hello and welcome to your house ceremony!(I have not read Harry Potter since 7th grade forgive me) \n*hat noises* \n \n*deep hat voice* You will now answer questions to determine your house young ones \n What is your first name child/adult");
      String name = scan.nextLine().toLowerCase();
      

      if(name.equals("andy")){
          System.out.println("\nGryffindor! You are just so amazing that I need no further questions! *hat noises*");
          hamCheck = 1;
  }
      if(hamCheck == 0){

        System.out.println("I will now be asking you a series of questions *ominous hat gurgling* \n \nO' Child, are you spooked, sad, or valiant?");
          String ans = scan.nextLine().toLowerCase();

            if(ans.equals("sad"))
                score --;

            else if(ans.equals("spooked"))
                score -= 4;

            else if(ans.equals("valiant"))
                score +=2;
            
            else{
                System.out.println("Why are you defying the allmighty hat \n*angry hat noises*");
                    score -= 8;
            }

        System.out.println("Now I understand your personality, *gurgles* you must tell me your goals. Are you ambitious, complying, interested, or evil");
            String ansTwo = scan.nextLine().toLowerCase();

            if(ansTwo.equals("ambitious"))
                score += 2;
            
            else if(ansTwo.equals("complying"))
                score ++;

            else if(ansTwo.equals("interested"))
                score --;

            else if(ansTwo.equals("evil"))
                score -= 4;

            else{
                System.out.println("Why are you defying the allmighty hat \n*angry hat noises*");
                    score -= 8;
            }

        System.out.println("\n*INTENSIVE GURGLES*\nNow, for your final question, are potatoes good or not? Yes or No.");
            String ansThr = scan.nextLine().toLowerCase();

            if(ansThr.equals("yes"))
                score += 2;

            else if(ansThr.equals("no"))
                score -=2 ;
            
            else{
                System.out.println("\nWrong");
                score -= 4;
            }

        System.out.println("Now, your house:");

            if(score >=6)
                System.out.println(name + ", you are a Gryffindor!");

            else if(score >= 0 && score < 6)
                System.out.println(name + ", you are a Hufflepuff!");

            else if(score < 0 && score >= -4)
                System.out.println(name + ", you are a Ravenclaw!");

            else if(score < -4)
                System.out.println(name + ", you are a Slytherin!");
      } 
    }
  }
