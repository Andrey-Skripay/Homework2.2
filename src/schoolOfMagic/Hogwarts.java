package schoolOfMagic;


import javax.lang.model.element.Name;

public class Hogwarts {
    private final int magicPower;
    private final int transgressionDistance;
    private final String name;

    // Конструктор для задания свойств учеников
    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }
    @Override
    public String toString(){
        return "Студент " + name + " обладает силой магии " + magicPower +
                " и может трансгресировать на расстояние " + transgressionDistance;
    }

    public String getName() { return name;}
    public int getMagicPower() { return magicPower;}
    public int getTransgressionDistance() { return transgressionDistance;}
    public void compareStudents(Hogwarts student) {
        if (this.getMagicPower() > student.getMagicPower()) {
            System.out.println(this.getName() + " обладает большей силой  , чем " +
                            student.getName());
        } else if (this.getMagicPower() == student.getMagicPower()){
            System.out.println(" Сила студента Хогвартса " + this.getName() +
                    " равна силе студента " + student.getName());
        } else {
            System.out.println(student.getName() + " обладает большей силой , чем " +
                     this.getName());
    }
    if (this.getTransgressionDistance() > student.getTransgressionDistance()) {
        System.out.println(this.getName() + " трансгрессирует на большее растояние, чем "
                + student.getName());
    } else if ( (this.getTransgressionDistance() == student.getTransgressionDistance())) {
            System.out.println(this.getName() + "и" + student.getName() +
                    " могу трансгрессировать на одинаковое расстояние ");
        } else {
            System.out.println(student.getName() +
                    " трансгрессирует на большее расстояние, чем " + this.getName());
        }
    }
    public  String castSpell() {
        return " something useless I have no magic power";
    }
}

