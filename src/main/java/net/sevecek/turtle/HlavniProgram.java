package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
        zofka.setLocation(40, 200);

        zofka.turnRight(90);

        nakresliPrasatko(zofka);
    }

    private void nakresliPrasatko(Turtle zofka) {
        postavDomecek(zofka);
        nakresliNohy(zofka);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnLeft(45);
        zofka.move(80);
        zofka.turnLeft(45);
        nakresliNohy(zofka);
    }

    private void nakresliNohy(Turtle zofka) {
        zofka.penDown();
        zofka.move(40);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(40);
        zofka.turnRight(90);
        zofka.penDown();
        zofka.move(40);
    }


    private void postavDomecek(Turtle zofka) {
        for (int j = 0; j < 2; j++) {
            zofka.move(80);
            zofka.turnRight(90);
            zofka.move(83);
            zofka.turnRight(90);
        }
        zofka.penUp();
        zofka.move(80);
        zofka.penDown();
        zofka.turnRight(45);
        zofka.move(60);
        zofka.turnRight(90);
        zofka.move(60);
        zofka.penUp();
    }

}
