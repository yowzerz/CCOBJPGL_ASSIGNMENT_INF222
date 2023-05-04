import Explorers.*;
import Planets.*;

public class App {

    public static void main(String[] args) {

        Planet mars = new Mars();
        Planet saturn = new Saturn();
        Planet mercury = new Mercury();
        Planet earth = new Earth();
        Planet jupiter = new Jupiter();
        Planet neptune = new Neptune();
        Planet pluto = new Pluto();
        Planet uranus = new Uranus();
        Planet venus = new Venus();
       

        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();

        mars.accept(astronaut);
        saturn.accept(astronaut);
        mercury.accept(astronaut);
        earth.accept(astronaut);
        jupiter.accept(astronaut);
        neptune.accept(astronaut);
        pluto.accept(astronaut);
        uranus.accept(astronaut);
        venus.accept(astronaut);

        mars.accept(rover);
        saturn.accept(rover);
        mercury.accept(rover);
        earth.accept(rover);
        jupiter.accept(rover);
        neptune.accept(rover);
        pluto.accept(rover);
        uranus.accept(rover);
        venus.accept(rover);
    }
}