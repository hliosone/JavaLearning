import java.util.Arrays;
import java.util.StringTokenizer;

public class App {
    public static void main(String[] args) {
      System.out.println("Hello world!");
      Player One = new Player("Stan");
      Player Two = new Player("Stan");
      Player Three = new Player("Stan");
      Player Four = new Player("Stan");
      Four.displayName();

      int tab[] = new int[5];
      Arrays.fill(tab, 15);

      //String est immuable, en reaffectant une valeur on va en fait detruire l'ancienne et la
      // liberer de la memoire et en creer une nouvelle
      String test1 = "Test";
      String test2 = "reussi";
      String test3 = "Reussi";

      System.out.println(test1.concat(" ").concat(test2).concat(" !"));
      // concat est plus rapide que +

      //string.trim() va supprimer tous les espaces
      //.replace('carac ou string', 'carac' ou string) va remplacer toutes les appearances par la nouvelle

      System.out.println(test1.charAt(0));
      System.out.println(test1.substring(0, 3)); 
      //.substring(pos, pos exclue);

      System.out.println(test3.equals(test2));
      System.out.println(test3.compareTo(test2)); //compare les codes ascii et renvoie la difference en entier

      String s = "C/ProgramFiles/user/sst";
      StringTokenizer st = new StringTokenizer(s, "/"); // on peut rajouter true en argument pour recup
      // aussi les delimiteurs

      while (st.hasMoreTokens()){
        System.out.println(st.nextToken());
      }

      System.out.println("Taille est : "+ test3.length()); 

      StringBuilder newS = new StringBuilder(); //Cree une string avec des methodes particulieres qui seront possible
      //.capacity() pour la capacité sur une StringBuilder tandis que sur une string capacité = taille car new object
      // string n'est pas muable tandis que StringBuilder l'est



      

      for (int el : tab){
        System.out.print(el + " ");
      }
      //tab.toString()
  }
}
  /*
\n : nouvelle ligne
\t : tabulation
\r : retour chariot
\b : retour arrière
\f : nouvelle page
\' \" (Protection)
   */