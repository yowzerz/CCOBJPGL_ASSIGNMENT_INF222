package Planets;

import Explorers.Explorer;

public class Venus implements Planet {
    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}
