import java.io.BufferedReader;
import java.util.Arrays;
import java.util.StringTokenizer; //pour utiliser Str Builder/Buffer
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader; //package for input reader

import fr.sstelcher.*;


public class App {
    public static void main(String[] args) throws Exception {
      Player One = new Player("Stan");
      One.displayName();

      InputStreamReader isr = new InputStreamReader(System.in); //atends un flux à lire
      BufferedReader br = new BufferedReader(isr); /*Va permettre de faire de la lecture de données
      est thread safe (synchrone)
      considere que toute saisie faite est une chaine de caractere (String)
      Buffer de 8192 caracteres
      Méthodes : 
      - read() : lire un caractere
      - readLine() : lire une chaine, peut lever une exception
      - skip(N) : ignore N caractères
      */

      Scanner sc = new Scanner(System.in); 
      //Prend direct un inputStream en parametre
      //plus lent et pas thread safe, est asynchrone
      //lecture de donnees + parsing (verifications, controles, etc)
      //Buffer de 1024 caracteres
      System.out.print("Comment t'appelle tu ? ");
      String name = br.readLine();
      
  


      System.out.println(name);

  }
}
