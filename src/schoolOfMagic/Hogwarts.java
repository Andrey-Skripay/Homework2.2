package schoolOfMagic;


class Hogwarts {
    private int magicPower;
    private int transgressionDistance;

    // Конструктор для задания свойств учеников
    public Hogwarts(int magicPower, int transgressionDistance) {
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    // Метод вывода описания студента
    public void printDescription() {
        System.out.println("Ученик Хогвартса");
        System.out.println("Сила магии: " + magicPower);
        System.out.println("Расстояние трансгрессии: " + transgressionDistance);
    }
}

