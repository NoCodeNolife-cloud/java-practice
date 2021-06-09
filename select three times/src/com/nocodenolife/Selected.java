package com.nocodenolife;

public class Selected {

    private boolean aselected;
    private boolean bselected;
    private boolean cselected;

    public Selected() {

        aselected = false;
        bselected = false;
        cselected = false;
    }

    public void choose(int i) {

        if (i == 1) {
            aselected = true;
        } else if (i == 2) {
            bselected = true;
        } else if (i == 3) {
            cselected = true;
        }
        if (aselected && bselected && cselected) {

            System.out.println("all selected");
        }
    }
}
