package schoolOfMagic;

public class Ravenclaw extends Hogwarts {
    // Свойства, присущие Когтевранцам
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    // Конструктор для задания свойств Когтевранцев
    public Ravenclaw(String name, int skillMagic, int transgressionDistance, int nind, int wisdom, int wit, int creation) {
        super(name, skillMagic, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    @Override
    public String toString() {
        return super.toString() + " обладает умом" + mind +
                "мудростью" + wisdom + "остроумием" + wit +
                "и творчеством" + creation;
    }

    // Метод сравнения студентов факультета Когтеврана

    public void compareStudents(Ravenclaw student) {
        if (this.getMind() + this.getCreation() + this.getWit() + this.getWisdom() >
                student.getMind() + student.getCreation() + student.getWit() + student.getWisdom()) {
            System.out.println("Когтевранец" + this.getName() + "сильнее чем" + student.getName());
        } else if (this.getMind() < student.getMind()) {
            System.out.println("Когтевранец" + student.getName() + "сильнее чем" + this.getName());
        } else {
            System.out.println("Когтевранец" + this.getName() + "и" + student.getName() + "одинакого равны");
        }
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }
}