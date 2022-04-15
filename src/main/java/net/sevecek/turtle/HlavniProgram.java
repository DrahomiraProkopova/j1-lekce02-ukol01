package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
        zofka.setLocation(50, 350);

        zofka.turnRight(90);

        //Část 1
        nakresliPrasatko(zofka);

        //Část 2
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(40);
        zofka.turnRight(45);
        zofka.move(180);

        zofkaKresliOsmiuhelnik(zofka);

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(40);
        zofka.move(180);
        zofka.penDown();
        zofka.turnRight(135);

        zofkaKresliKolecko(zofka);

        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(100);
        zofka.penDown();

        zofkaKresliSlunicko(zofka);
    }

    private void zofkaKresliSlunicko(Turtle zofka) {
        for (int j = 0; j < 12; j++) {
            for (int i = 0; i < 6; i++) {
                zofka.move(4);
                zofka.turnRight(5);
            }
            zofka.turnLeft(90);
            zofka.move(25);
            zofka.turnLeft(180);
            zofka.move(25);
            zofka.turnLeft(90);
        }
    }

    private void zofkaKresliKolecko(Turtle zofka) {
        for (int i = 0; i < 74; i++) {
            zofka.move(4);
            zofka.turnRight(5);
        }
    }

    private void zofkaKresliOsmiuhelnik(Turtle zofka) {
        for (int i = 0; i < 8; i++) {
            zofka.penDown();
            zofka.move(40);
            zofka.turnRight(45);
        }
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
