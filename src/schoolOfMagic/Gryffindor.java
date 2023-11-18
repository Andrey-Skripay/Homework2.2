package schoolOfMagic;

public class Gryffindor extends Hogwarts {
    // Свойства, присущие Гриффиндорцам
    private int nobility;
    private int honor;
    private int bravery;

    // Конструктор для задания свойств Гриффиндорцев
    public Gryffindor(int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    // Метод сравнения двух учеников Гриффиндора
    public void compareGryffindorStudents(Gryffindor student1, Gryffindor student2) {
        int sum1 = student1.nobility + student1.honor + student1.bravery;
        int sum2 = student2.nobility + student2.honor + student2.bravery;

        if (sum1 > sum2) {
            System.out.println("Первый ученик лучше второго");
        } else if (sum1 < sum2) {
            System.out.println("Второй ученик лучше первого");
        } else {
            System.out.println("Ученики равны");
        }
    }
}