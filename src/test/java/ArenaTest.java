import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ArenaTest {

    Robot robot = new Robot("homme");
    Robot robot2 = new Robot("femme");
    Arena arena = new Arena();
    private  final ByteArrayOutputStream affiche = new ByteArrayOutputStream() ;


    @BeforeEach
    public  void init(){
        System.setOut(new PrintStream((affiche)));
    }

    // Test de combat entre deux robot et ressortir le vainqueur
    @Test
    void fight() {
        Assertions.assertEquals("Le robot vainqueur est Robot homme" , arena.fight(robot , robot2));
    }

    // Test que un robot mort ne peut pas combattre
    @Test
    void impossible_tirer_sur_un_robot_mort() {
        robot.setNbreVie(0);
        Assertions.assertEquals("Le Robot homme est deja mort" , arena.fight(robot , robot2));
    }
}