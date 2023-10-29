import java.io.BufferedReader;
import java.util.*;
import java.io.BufferedWriter;
import java.io.InputStreamReader; //package for input reader
import java.io.IOException;

// Utilisation de l'API NIO
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.nio.charset.Charset;

//Utilisation des threads
import java.lang.Thread;
import java.util.concurrent.Executors;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;



//importation des classes (package)
import fr.sstelcher.*;


/*
 * class MyTask implements Runnable{
 * public void run(){
 * 
 * }}
 * 
 * dans notre code ensuite exemple :
 * 
 * Thread task = new Thread(new MyTask());
 * task.start();
 */

 /*newSingleThreadExecutor //un seul thread qui s'occupe d'une tache
  *newCachedThreadPool // on peut avoir aussi un nombre dynamique de thread si on a besoin d'aller plus vite
  *newFixedThreadPool //traitement plus long qui prennent du temps
  */
public class App extends Thread {
  /*//il faut extends la class a Thread
  public void run(){ // la methode de run thread doit s'appeler run() et avoir cette synthaxe : public void

    for(int i = 0; i < 5; ++i){
      System.out.println(i);

      try{
        Thread.sleep(1000); //va delay le thread de 1seconde
      } catch(InterruptedException e){
        System.out.println("Probleme pour le delay");
            }
    }

  } */

  public static void main(String[] args) throws Exception {
    /* App task1 = new App(); //creation d'un thread
     App task2 = new App();

     System.out.println("Les threads démarrent !");
     task1.start(); //demarre le thread
     task2.start();

     /*task1.join(); //Va specifier au thread d'attendre un autre thread pour le rejoindre et se synchroniser
     //exemple si task 2 a plus d'iterations bah task1 aurait attendu task2
     task2.join();

     System.out.println("Les threads sont finis !");
     */

     //ExecutorService ex = Executors.newSingleThreadExecutor(); //Traitement sequentielle un par un car on travaille avec un seul thread
      ExecutorService ex = Executors.newCachedThreadPool(); //Traitement sequentielle un par un car on travaille avec un seul thread

     Runnable task1 = () ->{
      for(int i = 0; i < 5; ++i){
      System.out.println(i);

      try{
        Thread.sleep(1000); //va delay le thread de 1seconde
      } catch(InterruptedException e){
        System.out.println("Probleme pour le delay");
            }
    }
    };

    Runnable task2 = () ->{
      for(int i = 5; i < 9; ++i){
      System.out.println(i);

      try{
        Thread.sleep(1000); //va delay le thread de 1seconde
      } catch(InterruptedException e){
        System.out.println("Probleme pour le delay");
            }
    }
    };

   /*  ex.execute(task1); //Pourquoi il commence par la 2 une fois sur deux? Moyen de choisir? avec newCachedThreadPool ?
    ex.execute(task2); */

    Future <?> fut1 = ex.submit(task1, "Je suis la task1 j'ai fini"); //Interface qui permet d'avoir le resultat des diffentes taches asynchrones
    Future <?> fut2 = ex.submit(task2);
    /*
     * Methodes :
     * - isDone()
     * - isCancelled()
     * - get()
     * - cancel()
     */

     while(!fut1.isDone() && !fut2.isDone()){
      System.out.println("On attends");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {}
     }

    ex.shutdown(); // MARCHE seulement en creant un ExecutorService

    if (fut1.isDone()){
      try{
        System.out.println(fut1.get()); //renvoie du result passe en parametre
      } catch (Exception e){}
     }
}
}
