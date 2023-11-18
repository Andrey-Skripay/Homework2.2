import java.util.*;
import schoolOfMagic.Gryffindor;
import schoolOfMagic.Hufflepuff;
import schoolOfMagic.Ravenclaw;
import  schoolOfMagic.Slytherin;

public class Main {
    public static void main(String[] args) {
        // Создание объектов учеников разных факультетов
        Gryffindor harry = new Gryffindor(90, 50, 80, 90, 85);
        Gryffindor hermione = new Gryffindor(95, 60, 95, 85, 90);

        Hufflepuff zacharias = new Hufflepuff(80, 40, 95, 90, 80);
        Hufflepuff cedric = new Hufflepuff(85, 45, 90, 95, 85);

        Ravenclaw cho = new Ravenclaw(85, 60, 95, 90, 95, 90);
        Ravenclaw padma = new Ravenclaw(80, 55, 90, 95, 90, 85);

        Slytherin draco = new Slytherin(90, 50, 95, 90, 95, 90, 95);
        Slytherin graham = new Slytherin(85, 45, 90, 95, 90, 85, 90);

        // Вывод описания студентов
        harry.printDescription();
        hermione.printDescription();
        zacharias.printDescription();
        cedric.printDescription();
        cho.printDescription();
        padma.printDescription();
        draco.printDescription();
        graham.printDescription();

        // Сравнение учеников Гриффиндора
        Gryffindor gryffindor = new Gryffindor(0, 0, 0, 0, 0);
        gryffindor.compareGryffindorStudents(harry, hermione);

        // Сравнение учеников Пуффендуя
        Hufflepuff hufflepuff = new Hufflepuff(0, 0, 0, 0, 0);
        hufflepuff.compareHufflepuffStudents(zacharias, cedric);

        // Сравнение учеников Когтеврана
        Ravenclaw ravenclaw = new Ravenclaw(0, 0, 0, 0, 0, 0);
        ravenclaw.compareRavenclawStudents(cho, padma);


        // Сравнение учеников Слизерина
        Slytherin slytherin = new Slytherin(0, 0, 0, 0, 0, 0, 0);
        slytherin.compareSlytherinStudents(draco, graham);
    }
}