package schoolOfMagic;

public class Hufflepuff extends Hogwarts {
    // Свойства, присущие Пуффендуям
    private int diligence;
    private int loyalty;
    private int honesty;

    // Конструктор для задания свойств Пуффендуев
    public Hufflepuff(int magicPower, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    // Метод сравнения двух учеников Пуффендуя
    public void compareHufflepuffStudents(Hufflepuff student1, Hufflepuff student2) {
        int sum1 = student1.diligence + student1.loyalty + student1.honesty;
        int sum2 = student2.diligence + student2.loyalty + student2.honesty;

        if (sum1 > sum2) {
            System.out.println("Первый ученик лучше второго");
        } else if (sum1 < sum2) {
            System.out.println("Второй ученик лучше первого");
        } else {
            System.out.println("Ученики равны");
        }
    }
}