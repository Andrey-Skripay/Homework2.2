package schoolOfMagic;

public class Gryffindor extends Hogwarts {
    // Свойства, присущие Гриффиндорцам
    private final int nobility;
    private final int honor;
    private final int bravery;

    // Конструктор для задания свойств Гриффиндорцев
    public Gryffindor(String name, int skillMagic, int transgressionDistance, int nobility,
                      int honor, int bravery) {
        super(name, skillMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }


    @Override
    public String toString() {
        return  super.toString() + ", Благодарен на" + nobility +
                " обладает честью " + honor +
                "и храбростью" + bravery;
    }

    // Метод сравнения студентов факультета Гриффиндора
    public void compareGryffindorStudents(Gryffindor student) {

        if ( (this.getNobility() + this.getBravery() + this.getHonor() > student.getNobility() +
                student.getBravery() + student.getHonor())) {
            System.out.println("Гриффендорец" + this.getName() + "сильнее чем" + student.getName());
        } else if (this.getNobility() < student.getNobility()) {
            System.out.println("Гриффендорец" + student.getName() + "сильнее чем" + this.getName());
        } else {
            System.out.println("Гриффендорец" + this.getName() + "и" + student.getName() + "одинакого равны");
        }
    }public int getNobility() {return nobility; }

    public int getHonor() {return  honor; }

    public int getBravery() {return bravery; }
}
