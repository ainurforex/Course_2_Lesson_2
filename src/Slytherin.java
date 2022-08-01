public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int magicPower, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magicPower, transgression);
        if (cunning < 0 || cunning > 100 || determination < 0 || determination > 100 || ambition < 0 || ambition > 100 ||
                resourcefulness < 0 || resourcefulness > 100 || lustForPower < 0 || lustForPower > 100) {
            illegalAgrument();
        }
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public static void compareStudent(Slytherin student1, Slytherin student2) {
        String masssge = "";
        int summStudent1 = student1.getCunning() + student1.getDetermination() + student1.getAmbition() +
                student1.getResourcefulness() + student1.getLustForPower();
        int summStudent2 = student2.getCunning() + student2.getDetermination() + student2.getAmbition() +
                student2.getResourcefulness() + student2.getLustForPower();
        if (summStudent1 > summStudent2) {
            masssge = student1.getName() + " лучший студент Слизерин, чем " + student2.getName();
        } else if (summStudent2 > summStudent1) {
            masssge = student2.getName() + " лучший студент Слизерин, чем " + student1.getName();
        } else if (summStudent2 == summStudent1) {
            masssge = student1.getName() + " и " + student2.getName() + " равны на факультете Слизерин.";
        }
        System.out.println(masssge);
    }

    @Override
    public String toString() {
        return "Имя:" + getName() + ", сила магии:" + getMagicPower() + ", трансгресия:" + getTransgression() +
                ", хитрость:" + getCunning() + ", решительность:" + getDetermination() + ", амбициозность:" + getAmbition()
                + ", находчивость:" + getResourcefulness() + ", жажда власти:" + getLustForPower();
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

    public void setCunning(int cunning) {
        if (cunning < 0 || cunning > 100) {
            illegalAgrument();
        }
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        if (determination < 0 || determination > 100) {
            illegalAgrument();
        }
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        if (ambition < 0 || ambition > 100) {
            illegalAgrument();
        }
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        if (resourcefulness < 0 || resourcefulness > 100) {
            illegalAgrument();
        }
        this.resourcefulness = resourcefulness;
    }

    public void setLustForPower(int lustForPower) {
        if (lustForPower < 0 || lustForPower > 100) {
            illegalAgrument();
        }
        this.lustForPower = lustForPower;
    }
}
