package fr.sstelcher;

public class Player {

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

    private static int nbPlayer = 0;
    private String name;
    private int pv;
    private Item it;
}