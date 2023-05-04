package Explorers;

import Planets.Mars;
import Planets.Mercury;
import Planets.Planet;
import Planets.Saturn;
import Planets.Earth;
import Planets.Jupiter;
import Planets.Neptune;
import Planets.Pluto;
import Planets.Uranus;
import Planets.Venus;

public interface Explorer {

    void visit(Mercury mercury);

    void visit(Mars mars);

    void visit(Saturn saturn);

    void visit(Earth earth);

    void visit(Jupiter jupiter);

    void visit(Neptune neptune);

    void visit(Pluto pluto);

    void visit(Uranus uranus);

    void visit(Venus venus);

    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }
} 
