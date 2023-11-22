import java.util.*;
import schoolOfMagic.Hufflepuff;
import  schoolOfMagic.Slytherin;
import schoolOfMagic.Gryffindor;
import schoolOfMagic.Hogwarts;
public class Main {
    public static void main(String[] args) {

        Slytherin TomRedl = new Slytherin("Tom Redl", 100, 100, 100, 100, 100, 100,100);
        Slytherin draco = new Slytherin ("Draco",30,80,50,50,50,40,40);
        TomRedl.compareSlytherinStudents(draco);
        TomRedl.compareStudents(draco);
        Hufflepuff Cedric = new Hufflepuff("Cedric",20,40,50,60, 60);
        Hogwarts[] hogwartsStudents = new Hogwarts[] {Cedric, TomRedl, draco};
for (Hogwarts students:
    hogwartsStudents) {
    //todo:
               }

    }
}