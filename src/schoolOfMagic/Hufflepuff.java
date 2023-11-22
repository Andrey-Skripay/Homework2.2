package schoolOfMagic;

public class Hufflepuff extends Hogwarts {
    // Свойства, присущие Пуффендуям
    private int industriousness;
    private int loyalty;
    private int honesty;

    // Конструктор для задания свойств Пуффендуев
    public Hufflepuff(String name, int skillMagic, int transgressionDistance,
                      int industriousness, int loyalty, int honesty) {
        super(name, skillMagic, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public String castSpell() {
        return "Spell";
    }


    @Override
    public String toString() {
        return super.toString() + " обладает трудолюбием" + industriousness +
                "верностью" + loyalty +
                "и честностью" + honesty;
    }

    // Метод сравнения студентов факультета Пуффендуя
     public void comareStudentHufflepuff(Hufflepuff student) {
                if (this.getIdustriousness() + this.getHonesty() + this.getLoyalty() >
                        student.getIdustriousness() + student.getHonesty() + student.getLoyalty()) {
                    System.out.println("Пуффендуец " + this.getName() + " сильнее чем " + student.getName());
                } else if (this.getIdustriousness() < student.getIdustriousness()) {
                    System.out.println("Пуффендуец " + student.getName() + "сильнее чем " + this.getName());
                } else {
                    System.out.println("Пуффендуец " + this.getName() + "и" + student.getName() +" одинакого равны ");
        }

     } public int getIdustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

}