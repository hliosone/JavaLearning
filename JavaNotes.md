# Code Java - Notes de Formation

```java
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.util.InputMismatchException;

import fr.sstelcher.*;

public class App {
    public static void main(String[] args) {
        // Affiche un message de bienvenue
        System.out.println("Hello world!");

        // Crée plusieurs instances de la classe Player
        Player One = new Player("Stan");
        Player Two = new Player("Stan");
        Player Three = new Player("Stan");
        Player Four = new Player("Stan");
        Four.displayName();  // Appelle une méthode sur l'instance Four

        // Initialise un tableau et le remplit avec la valeur 15
        int tab[] = new int[5];
        Arrays.fill(tab, 15);

        // Travailler avec des chaînes de caractères
        String test1 = "Test";
        String test2 = "reussi";
        String test3 = "Reussi";

        System.out.println(test1.concat(" ").concat(test2).concat(" !"));  // Utilise la méthode concat pour la concaténation

        System.out.println(test1.charAt(0));
        System.out.println(test1.substring(0, 3));  // Utilise substring pour extraire une sous-chaîne

        System.out.println(test3.equals(test2));
        System.out.println(test3.compareTo(test2));  // Compare les codes ASCII et renvoie la différence en entier

        String s = "C/ProgramFiles/user/sst";
        StringTokenizer st = new StringTokenizer(s, "/");

        // Parcourt les jetons (tokens) de la chaîne
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        System.out.println("Taille est : " + test3.length());

        // StringBuilder pour manipuler les chaînes de manière mutable
        StringBuilder newS = new StringBuilder();

        // StringBuffer, similaire à StringBuilder mais thread-safe
        StringBuffer newS2 = new StringBuffer();

        // Parcourt le tableau et affiche chaque élément
        for (int el : tab){
            System.out.print(el + " ");
        }

        // Utilise InputStreamReader et BufferedReader pour lire depuis la console
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        // Utilise Scanner pour la saisie utilisateur
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Comment t'appelles-tu ? ");
            String name = br.readLine();
            System.out.println(name);

            System.out.print("À quel niveau accéder ? ");
            int gameLevel = sc.nextInt();
            System.out.println(gameLevel);

            // Scanner peut également être utilisé pour capturer les exceptions de saisie incorrecte
            sc = new Scanner(System.in);
            try {
                System.out.print("À quel niveau voulez-vous accéder ? : ");
                int gameLevel = sc.nextInt();
                System.out.println(gameLevel);
            } catch(InputMismatchException e) {
                System.out.println("Le niveau n'existe pas !");
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Il y a eu un problème dans le jeu, redémarrez");
            } finally {
                System.out.println("Ok fin");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // HÉRITAGE :

        // Exemple d'utilisation d'héritage avec la classe DonjonGuardian
        public final class DonjonGuardian extends Player {
            // ...
        }

        // Classe abstraite
        abstract public class SomeAbstractClass {
            // ...
        }

        //Collections methods
        add()
        addAll()
        clear()
        contains()
        isEmpty()
        remove()
        size()

        // Enumération pour les couleurs d'équipement
        EquipmentColor favColor = EquipmentColor.RED;

        // Affiche certaines propriétés de l'enumération
        System.out.println(favColor.name());
        System.out.println(favColor.ordinal());
        System.out.println(favColor.toString());

        // Boucle sur l'énumération EquipmentColor
        for(EquipmentColor e : EquipmentColor.values()){
            System.out.println(e);
        }

        // GESTION DES FICHIERS :

        // Utilisation de la classe Paths et Files pour gérer les fichiers
        Path f = Paths.get("pathtest.txt");
        Path newF = Paths.get("brandNewFile.txt");
        Path dir = Paths.get("myNewDir");
        Path fileDestination = dir.resolve(newF);

        // Initialisation des buffers de lecture/écriture
        BufferedReader bfrRead = null;
        BufferedWriter bfrWrite = null;
        StandardOpenOption mode = StandardOpenOption.APPEND;  // Option pour ouvrir en mode ajout

        // Charset pour l'encodage des fichiers (UTF-8 ici)
        Charset c = Charset.forName("UTF-8");

        try {
            // Exemples d'opérations de fichiers
            bfrRead = Files.newBufferedReader(f);
            System.out.println(bfrRead.readLine());
            System.out.println(bfrRead.readLine());
            bfrRead.close();

            bfrWrite = Files.newBufferedWriter(f, c, mode);
            bfrWrite.newLine();
            bfrWrite.write("Nouvel ajout !");
            bfrWrite.newLine();
            bfrWrite.write("Et encore un autre !");
            bfrWrite.close();
        } catch (IOException e) {
            System.out.println("IO Exception : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }

        // UTILISATION DES THREADS (Traitement asynchrone) :

        // Utilisation des threads avec ExecutorService
        ExecutorService ex = Executors.newCachedThreadPool();

        // Exemple de tâches exécutées de manière asynchrone
        Runnable task1 = () -> {
            // ...
        };

        Runnable task2 = () -> {
            // ...
        };

        // Soumission des tâches à l'ExecutorService
        Future<?> fut1 = ex.submit(task1, "Je suis la task1 j'ai fini");
        Future<?> fut2 = ex.submit(task2);

        // Attente de la fin des tâches
        while (!fut1.isDone() && !fut2.isDone()) {
            System.out.println("On attend");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }

        // Fermeture de l'ExecutorService
        ex.shutdown();

        // Affichage des résultats des tâches
        if (fut1.isDone()) {
            try {
                System.out.println(fut1.get());
            } catch (Exception e) {
            }
        }
    }
}
