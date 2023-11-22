package schoolOfMagic;

public class Slytherin extends Hogwarts {
    // Свойства, присущие Слизеринам
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int skillMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, skillMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() + " обладает [bnhjcnm." + cunning +
                "решительностью" + determination +
                "амбициозностьб" + ambition +
                "находчивостью" + resourcefulness +
                "и жаждой власти" + lustForPower;
    }

    // Метод сравнения студентов факультета Слизерина
    public void compareSlytherinStudents(Slytherin student) {
        if (this.getCunning() + this.getAmbition() + this.getDetermination() + this.getLustForPower() +
                getResourcefulness() >
                student.getCunning() + student.getAmbition() + student.getDetermination() + student.getLustForPower() +
                        student.getResourcefulness()) {
            System.out.println("Слизеренец " + this.getName() + " сильнее чем " + student.getName());
        } else if (this.getCunning() < student.getCunning()) {
            System.out.println("Слизеренец " + student.getName() + " сильнее чем " + this.getName());
        } else {
            System.out.println("Слизеренец " + this.getName() + "и " + student.getName() + " одинакого равны");
        }
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }
}


