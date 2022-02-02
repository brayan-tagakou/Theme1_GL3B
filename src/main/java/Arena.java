public class Arena {
    //Methode qui simule un combat entre deux robot
    public String fight(Robot robot1 , Robot robot2){
        // On teste si les deux robot sont encore en vie
        if (robot1.estMort() == false && robot2.estMort() == false){
            // Le prmier robot attaque dabord
            robot1.fire(robot2);
            //tant que le secon ne meurt pas
            while (robot2.estMort() == false ){
                robot2.fire(robot1);
                if (robot1.estMort() == false){
                    robot1.fire(robot2);
                }else {
                    return "Le robot vainqueur est" + robot2.getNomRobot();
                }
            }
            return "Le robot vainqueur est " + robot1.getNomRobot();

        }
        else {
            // Verifie si le premier robot est deja mort
            if (robot1.estMort() == true){
                return "Le " + robot1.getNomRobot() + " est deja mort";
            }
            // Verifie si le second robot est deja mort
            else if(robot2.estMort() == true){
                return "Le " + robot2.getNomRobot() + " est deja mort";
            }
            // Si non tout les robots sont mort
            else{
                return "Les deux robots sont deja mort";
            }
        }

    }
}
