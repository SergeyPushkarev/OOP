package view;

import data.Positions;

public class PositionsView {
    public void readPositions() {
        for (int i=0; i < Positions.values().length; i++) {
            System.out.println(i+1 + ". " + Positions.values()[i]);
        }
    }
}
