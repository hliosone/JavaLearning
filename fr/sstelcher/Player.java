package fr.sstelcher;

public class Player extends Gamer implements SuperSaiyan {

    public Player(String _name) {
    if (nbPlayer < 3){
         name = _name;
         pv = 100;
         Item it = new Item();
         ++nbPlayer;
    } else {
        System.out.println("Not possible");
    }
   
    }

    public void displayName(){
        System.out.println("Player name : " + this.name);
    }

    public void displayTest(){
        System.out.println("Now you're in class Player");
    }

    public void puissance(){
        System.out.println(this.puissance + " est la puissance");
    }

    public void voler(int hauteur){
        System.out.println("Le joueur vole à cette hauteur : " + hauteur);
    }

    public void voler(){
        System.out.println("Le joueur vole bien haut");
    }



    //protected permet l'accès aux variables pour les classes qui heritent de la classe
    //reste private sinon
    protected static int nbPlayer = 0;
    protected int puissance = 100;
    protected String name;
    protected int pv;
    protected Item it;
}