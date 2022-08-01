public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magicPower, int transgression, int nobility, int honor, int bravery) {
        super(name, magicPower, transgression);
        if (nobility < 0 || nobility > 100 || honor < 0 || honor > 100 || bravery < 0 || bravery > 100) {
            illegalAgrument();
        }
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Имя:" + getName() + ", сила магии:" + getMagicPower() + ", трансгресия:" + getTransgression() +
                ", благородство:" + getNobility() + ", честь:" + getHonor() + ", храбрость:" + getBravery();
    }

    public static void compareStudent(Gryffindor student1, Gryffindor student2) {
        String masssge = "";
        int summStudent1 = student1.getNobility() + student1.getHonor() + student1.getBravery();
        int summStudent2 = student2.getNobility() + student2.getHonor() + student2.getBravery();
        if (summStudent1 > summStudent2) {
            masssge = student1.getName() + " лучший Гриффиндорец, чем " + student2.getName();
        } else if (summStudent2 > summStudent1) {
            masssge = student2.getName() + " лучший Гриффиндорец, чем " + student1.getName();
        } else if (summStudent2 == summStudent1) {
            masssge = student1.getName() + " и " + student2.getName() + " равны на факультете Гриффиндор.";
        }
        System.out.println(masssge);
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        if (nobility < 0 || nobility > 100) {
            illegalAgrument();
        }
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        if (honor < 0 || honor > 100) {
            illegalAgrument();
        }
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}
