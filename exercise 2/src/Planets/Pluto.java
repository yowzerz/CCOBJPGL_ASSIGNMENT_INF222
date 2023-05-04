package Planets;

import Explorers.Explorer;

public class Pluto implements Planet {
    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}
