package fr.sstelcher;

/*creation of an interface (API like)
 classe abstraite dont toutes les methodes sont abstraites
tout est public et tout est abstrait par defaut
une classe utilisant implements nomInterface doit extends une classe abstraite et
automatiquement implementer toutes les méthodes de l'interface*/

interface SuperSaiyan{ //peut extendre une autre interface
    public void voler(int hauteur);

    public final int flySpeed = 20;
    //on peut faire une static pour permettre l'appel depuis partout
    public static void getFlySpeed(){
        System.out.println("Voila la flyspeed : " + flySpeed);
    }

    //permet de creer une methode par defaut dans l'interface
    //on doit donc la definir
    // si la classe qui implemente na pas cette methode elle utilisera celle la par defaut
    default public void testIntDefault(){
        System.out.println("Methode par defaut");
    }
}
