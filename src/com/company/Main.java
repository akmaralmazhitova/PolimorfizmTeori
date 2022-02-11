package com.company;

public class Main {
    /*Person degen klass tuz jana anin walk degen metodu bolsun. uwul klassti Programmer Singer jana Dancer degen klasstar extends kiliw kerek.
    * jana main den massiv tuzup aga 3 child klassti salip alardi walking kildir. foreach jardami menen. */

    public static void main(String[] args) {
        Person[] persons = {new Programmer(), new Dancer(), new Singer()};
        for (Person res: persons) {
            res.walk();
        }
    }
}