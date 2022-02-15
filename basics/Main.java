import java.util.Random;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class ExampleSyntax {
  public static void main(String[] args) {

    pluralize("dog", 2);
    flipNHeads(5);
    clock();

  }

  //Plural words method
  public static void pluralize (String word, int num) {
    if (num > 0) {
      System.out.println("I have " + num + " " + word + "s.");
    } else {
      System.out.println("I have " + num + " " + word + ".");
    }
  }

  //Cointoss heads in a row method
  public static void flipNHeads (int n)
  {
    boolean lastFlipHeads = false;
    int headCounter = 0;
    int flipCounter = 0;
    while(n != headCounter) {
      flipCounter ++;
      //Random Number generator bound by 2 numbers
      Random rando = new Random();
      int randoNum = rando.nextInt(2);

      // Print heads or tail keep track of last head flip boolean or else reset and try again
      if ( randoNum > .5) {
        System.out.println("heads");
        lastFlipHeads = true;
      }else {
        System.out.println("tails");
        headCounter = 0;
        lastFlipHeads = false;
      }
      // Counter Keeping track last heads is true
      if ( lastFlipHeads == true) {
        headCounter ++;
      }

      }
    System.out.println("It took " + flipCounter + " flips to flip " + n + " heads in a row." );
   }

  public static void clock () {

    while ( true) {

      try {
        LocalTime timer = LocalTime.now();
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = timer.format(timeFormat);
        System.out.println(formattedTime);
        Thread.sleep(1000);
      }
      catch (InterruptedException ex) {
        Thread.currentThread().interrupt();
      }

      }
    }
  }