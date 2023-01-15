import java.util.*;
class Main {
  public static void main(String[] args) {
    
    List<Album> artists = new ArrayList<>();

      Album oneSizeFitsAll = new Album("Frank Zappa", "One Size Fits All");
      oneSizeFitsAll.setMatchingItem("aged cigars.");
      Album passages = new Album("Philip Glass and Ravi Shankar", "Passages");
      passages.setMatchingItem("hand crafted incenses from India and deep breathing.");
      Album roots = new Album("Sepultura", "Roots");
      roots.setMatchingItem("$2 beers and $3 wells.");

      artists.add(oneSizeFitsAll);
      artists.add(passages);
      artists.add(roots);

      Scanner mood = new Scanner(System.in);

      System.out.println();
      System.out.println("Welcome to Mood Throug Music!" + '\n' +  "Press enter to continue.");
      String enter = mood.nextLine();
  
      System.out.println("This program will help you to reach a desired mood, sugesting you a full album to listen to while you apreciate something that matches with that music style." + '\n' + "Do you want to try it?" + '\n' + "Type 1 for yes or 2 for no and press enter.");
      int start = mood.nextInt();
      if(start == 1) {
          System.out.println();
          System.out.println("Lets Go!");
      }else{
          System.out.println();
          System.out.println("See you in another moment..."); 
          System.exit(0);
      }
  
  try {    
      System.out.println();    
      System.out.println("What kind of mood do you want to get into?" + '\n' + "For creative,  type 1." + '\n' + "For introspective, type 2." + '\n' + "For expansive, type 3." + '\n' + "Press enter after you select the number.");
      int choiceNumber = mood.nextInt();
      switch(choiceNumber) {
        case 1: System.out.println();
        oneSizeFitsAll.sugestion();
        break;  
        case 2: System.out.println();
        passages.sugestion();  
        break; 
        case 3: System.out.println();
        roots.sugestion();  
        break;  
      } 
  } catch(InputMismatchException e) {
      System.out.println();
      System.out.println("You only have three options to type: 1, 2 or 3. Try again!");
      System.exit(0);
  }  
  
      mood.close();
      
       
        Album.finalMessage();
  }
}

/* -At first I was following some requirements to make the code (at least 3 classes, abastract class, enhanced for loop to itarate througt the collection...). Thist time I changed de finalMessage method to static, making it belong to the class. 

   -I keeped the setter method just to make sure it will work the same way.  

   -I use to belive that when we use access modifiers to make a varible private, the only way to accsess the variable will be using getters and setters. But, while cheking my previous code, I realized that I used private variables setting then on a parameterized constructor. Is it possible this way too or am I confusing something (I'll try to find it out)*/