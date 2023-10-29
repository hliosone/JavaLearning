import java.io.BufferedReader;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader; //package for input reader

import fr.sstelcher.*;


public class App {
    public static void main(String[] args) {

      DonjonGuardian BouftouRoyal = new DonjonGuardian("Bouftou Royal", "Amulette");
      BouftouRoyal.displayName();
      BouftouRoyal.displayMedal();
      BouftouRoyal.displayTest();
      BouftouRoyal.displayTestS();

      //permet de verifier si un objet est une instance d'une classe precisee
      if(BouftouRoyal instanceof DonjonGuardian){   System.out.println("C'est bien un gardien de donjon !");
      }
      Player One = new Player("Stan");
      One.displayName();

      Gamer[] gamersList = {new Player("Stan"), new Player("King"), new DonjonGuardian("Boufton", "Amulette Boufton")};

      for(Gamer e : gamersList){
        e.voler();
      }
    }
}
