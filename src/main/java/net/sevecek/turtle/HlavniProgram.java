package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
        zofka.setLocation(50, 450);

        zofka.turnRight(90);

        /*
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

        zofkaKresliSlunicko(zofka);  */

        //Část 3
        zofka.turnLeft(90);
        postavDomecek(zofka);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(110);
        zofka.turnRight(45);
        zofka.penDown();

        for (int i = 0; i < 5; i++) {
            postavDomecek(zofka);
            zofka.penUp();
            zofka.turnRight(45);
            zofka.move(80);
            zofka.turnLeft(90);
            zofka.move(50);
            zofka.turnLeft(90);
            zofka.penDown();
        }
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(133);
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnLeft(180);
        zofka.penDown();
        postavDomecek(zofka);
        zofka.penUp();
        zofka.turnRight(135);
        zofka.move(360);
        zofka.turnRight(180);
        zofka.penDown();
        nakresliPrasatko(zofka);

        zofka.setLocation(200, 55);
        zofkaKresliSlunicko(zofka);

        //Část 4
        zofka.setLocation(50, 600);
        zofka.turnLeft(135);

        nakresliD(zofka);
        nakresliR(zofka);
        nakresliA(zofka);
        nakresliZ(zofka);
        nakresliA(zofka);
    }

    private void nakresliZ(Turtle zofka) {
        zofka.move(40);
        zofka.penDown();
        zofka.turnRight(90);
        zofka.move(20);
        zofka.turnRight(115);
        zofka.move(45);
        zofka.turnLeft(115);
        zofka.move(20);
        zofka.penUp();
        zofka.move(15);
        zofka.turnLeft(95);
    }

    private void nakresliA(Turtle zofka) {
        zofka.penDown();
        zofka.turnRight(25);
        zofka.move(50);
        zofka.turnRight(140);
        zofka.move(50);
        zofka.turnRight(180);
        zofka.move(20);
        zofka.turnLeft(75);
        zofka.move(20);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnRight(75);
        zofka.move(20);
        zofka.turnLeft(70);
        zofka.move(20);
        zofka.turnLeft(90);
    }

    private void nakresliR(Turtle zofka) {
        zofka.penDown();
        zofka.move(40);
        zofka.turnRight(125);
        for (int i = 0; i < 20; i++) {
            zofka.move(1);
            zofka.turnRight(1);
        }
        zofka.move(3);
        zofka.turnRight(45);
        zofka.move(3);
        zofka.turnRight(45);
        for (int j = 0; j < 18; j++) {
            zofka.turnRight(1);
            zofka.move(1);
        }
        zofka.turnLeft(125);
        zofka.move(25);
        zofka.turnLeft(45);
        zofka.penUp();
        zofka.move(20);
        zofka.turnLeft(85);
    }

    private void nakresliD(Turtle zofka) {
        zofka.penDown();
        zofka.move(40);
        zofka.turnRight(125);
        for (int i = 0; i < 10; i++) {
            zofka.move(2);
            zofka.turnRight(2);
        }
        zofka.move(10);
        zofka.turnRight(45);
        zofka.move(10);
        zofka.turnRight(45);
        for (int j = 0; j < 20; j++) {
            zofka.turnRight(1);
            zofka.move(1);
        }
        zofka.penUp();
        zofka.turnLeft(165);
        zofka.move(40);
        zofka.turnLeft(90);
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
