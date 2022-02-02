import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {

    Robot robot = new Robot("homme");
    Robot robot2 = new Robot("femme");
    private  final ByteArrayOutputStream affiche = new ByteArrayOutputStream() ;

    @BeforeEach
    public  void init(){
        System.setOut(new PrintStream((affiche)));
    }

    // test de la fonctions toString a une classe
    @Test
    void  toStringTest(){
        Assertions.assertEquals("Robot@3754a4bf" , robot.toString());
    }

    @Test
    void fire() {
        robot.fire(robot2);
        Assertions.assertEquals("Robot femme a ete touche par le robot homme\n", affiche.toString().replace("\r\n" , "\n"));
    }

    @Test
    void isDead() {
    }

    @Test
    void estMort() {
    }

    @Test
    void getNomRobot() {
    }
}