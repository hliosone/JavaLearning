package fr.sstelcher;

//final veut dire que la classe sera non extendable
public final class DonjonGuardian extends Player {

    public DonjonGuardian(String name, String _medal){
        super(name); //creer une instance avec le constructeur mere
        medal = _medal;

        System.out.println("Guardian invoked !");
    }

    public void displayMedal(){
        System.out.println(this.medal);
    }

    public void displayTest(){
        System.out.println("Still in class DonjonGuardian");
    }

    public void displayTestS(){
        //super va permettre ici d'utiliser la methode de la classe parente si la meme existe dans notre classe
        super.displayTest();
    }

    private String medal;
}
