package Explorers;

import Planets.*;

public class HumanExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Deploying tools specific to Mercury... exploring life");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Deploying tools specific to Mars... exploring life");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Deploying tools specific to Saturn... exploring life");
    }

    @Override
    public void visit(Earth earth) {
        System.out.println("Deploying tools specific to Earth... exploring life");
    }

    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("Deploying tools specific to Jupiter... exploring life");
    }

    @Override
    public void visit(Neptune neptune) {
        System.out.println("Deploying tools specific to Neptune... exploring life");
    }

    @Override
    public void visit(Pluto pluto) {
        System.out.println("Deploying tools specific to Pluto... exploring life");
    }

    @Override
    public void visit(Uranus uranus) {
        System.out.println("Deploying tools specific to Uranus... exploring life");
    }

    @Override
    public void visit(Venus venus) {
        System.out.println("Deploying tools specific to Venus... exploring life");
    }
}