public class Hufflepuff extends Hogwarts {

    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magicPower, int transgression, int diligence, int loyalty, int honesty) {
        super(name, magicPower, transgression);
        if (diligence < 0 || diligence > 100 || loyalty < 0 || loyalty > 100 || honesty < 0 || honesty > 100) {
            illegalAgrument();
        }
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Имя:" + getName() + ", сила магии:" + getMagicPower() + ", трансгресия:" + getTransgression() +
                ", трудолюбие:" + getDiligence() + ", верность:" + getLoyalty() + ", честность:" + getHonesty();
    }

    public static void compareStudent(Hufflepuff student1, Hufflepuff student2) {
        String masssge = "";
        int summStudent1 = student1.getDiligence() + student1.getLoyalty() + student1.getHonesty();
        int summStudent2 = student2.getDiligence() + student2.getLoyalty() + student2.getHonesty();
        if (summStudent1 > summStudent2) {
            masssge = student1.getName() + " лучший студент Пуффендуй, чем " + student2.getName();
        } else if (summStudent2 > summStudent1) {
            masssge = student2.getName() + " лучший студент Пуффендуй, чем " + student1.getName();
        } else if (summStudent2 == summStudent1) {
            masssge = student1.getName() + " и " + student2.getName() + " равны на факультете Пуффендуй.";
        }
        System.out.println(masssge);
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setDiligence(int diligence) {
        if (diligence < 0 || diligence > 100) {
            illegalAgrument();
        }
        this.diligence = diligence;
    }

    public void setLoyalty(int loyalty) {
        if (loyalty < 0 || loyalty > 100) {
            illegalAgrument();
        }
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        if (honesty < 0 || honesty > 100) {
            illegalAgrument();
        }
        this.honesty = honesty;
    }
}
