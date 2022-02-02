public class Robot {
    String nomRobot;
    int nbreVie;

    // Constructeur avec parametre nom
    public  Robot(String  nom){
        this.nomRobot = nom;
        this.nbreVie = 10;
//        System.out.println("Robot " + nom);
    }

    // Methode fire qui permet de tirer sur un robot attaque
    public  void fire(Robot robotAttaque){
        if (robotAttaque.getNbreVie() <= 0){
            System.out.println(robotAttaque.getNomRobot() + " est deja  mort");
        }else {
            robotAttaque.setNbreVie(robotAttaque.getNbreVie() - 2);
            System.out.println(robotAttaque.getNomRobot() + " a ete touche par le robot " + this.nomRobot);
//            System.out.println("Au  " + robotAttaque.getNomRobot()  + " il reste " + robotAttaque.getNbreVie());
        }

    }

    // Methode isDead qui permet de voir si un robot est en vie ou pas
    public  void isDead (){
        if (this.getNbreVie() <= 0){
            System.out.println(this.getNomRobot() + " est mort");
        }else {
            System.out.println(this.getNomRobot() + " est encore en vie avec " + getNbreVie() + " nombre de vie");
        }
    }

    public boolean estMort(){
        if (this.getNbreVie() <= 0){
            return true;
        }else {
            return false;
        }
    }

    public String getNomRobot() {
        return "Robot " +  nomRobot ;
    }

    public void setNomRobot(String nomRobot) {
        this.nomRobot = nomRobot;
    }

    public int getNbreVie() {
        return nbreVie;
    }

    public void setNbreVie(int nbreVie) {
        this.nbreVie = nbreVie;
    }

    public  static void main (String [] args){
        Robot bob = new Robot("bob ");
        Robot bob2 = new Robot("bob2");
//        bob2.setNbreVie(20);
//        bob.setNbreVie(0);
        System.out.println(bob.getNomRobot());
    }
}
