package schoolOfMagic;

public class Slytherin extends Hogwarts {
    // Свойства, присущие Слизеринам
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    // Конструктор для задания свойств Слизеринов
    public Slytherin(int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    // Метод сравнения двух учеников Слизерина
    public void compareSlytherinStudents(Slytherin student1, Slytherin student2) {
        int sum1 = student1.cunning + student1.determination + student1.ambition + student1.resourcefulness + student1.thirstForPower;
        int sum2 = student2.cunning + student2.determination + student2.ambition + student2.resourcefulness + student2.thirstForPower;

        if (sum1 > sum2) {
            System.out.println("Первый ученик лучше второго");
        } else if (sum1 < sum2) {
            System.out.println("Второй ученик лучше первого");
        } else {
            System.out.println("Ученики равны");
        }
    }
}
