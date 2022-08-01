public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int magicPower, int transgression, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgression);
        if (intelligence < 0 || intelligence > 100 || wisdom < 0 || wisdom > 100 || wit < 0 || wit > 100 ||
                creativity < 0 || creativity > 100) {
            illegalAgrument();
        }
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public static void compareStudent(Ravenclaw student1, Ravenclaw student2) {
        String masssge = "";
        int summStudent1 = student1.getIntelligence() + student1.getWisdom() + student1.getWit() +
                student1.getCreativity();
        int summStudent2 = student2.getIntelligence() + student2.getWisdom() + student2.getWit() +
                student2.getCreativity();
        if (summStudent1 > summStudent2) {
            masssge = student1.getName() + " лучший студент Когтевран, чем " + student2.getName();
        } else if (summStudent2 > summStudent1) {
            masssge = student2.getName() + " лучший студент Когтевран, чем " + student1.getName();
        } else if (summStudent2 == summStudent1) {
            masssge = student1.getName() + " и " + student2.getName() + " равны на факультете Когтевран.";
        }
        System.out.println(masssge);
    }

    @Override
    public String toString() {
        return "Имя:" + getName() + ", сила магии:" + getMagicPower() + ", трансгресия:" + getTransgression() +
                ", ум:" + getIntelligence() + ", мудрость:" + getWisdom() + ", остроумие:" + getWit()
                + ", творчество:" + getCreativity();
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setIntelligence(int intelligence) {
        if (intelligence < 0 || intelligence > 100) {
            illegalAgrument();
        }
        this.intelligence = intelligence;
    }

    public void setWisdom(int wisdom) {
        if (wisdom < 0 || wisdom > 100) {
            illegalAgrument();
        }
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        if (wit < 0 || wit > 100) {
            illegalAgrument();
        }
        this.wit = wit;
    }

    public void setCreativity(int creativity) {
        if (creativity < 0 || creativity > 100) {
            illegalAgrument();
        }
        this.creativity = creativity;
    }
}
