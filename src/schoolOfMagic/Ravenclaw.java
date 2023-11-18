package schoolOfMagic;

public class Ravenclaw extends Hogwarts {
    // Свойства, присущие Когтевранцам
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    // Конструктор для задания свойств Когтевранцев
    public Ravenclaw(int magicPower, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    // Метод сравнения двух учеников Когтеврана
    public void compareRavenclawStudents(Ravenclaw student1, Ravenclaw student2) {
        int sum1 = student1.intelligence + student1.wisdom + student1.wit + student1.creativity;
        int sum2 = student2.intelligence + student2.wisdom + student2.wit + student2.creativity;

        if (sum1 > sum2) {
            System.out.println("Первый ученик лучше второго");
        } else if (sum1 < sum2) {
            System.out.println("Второй ученик лучше первого");
        } else {
            System.out.println("Ученики равны");
        }
    }
}