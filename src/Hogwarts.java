public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgression;

    public Hogwarts(String name, int magicPower, int transgression) {
        if (magicPower < 0 || magicPower > 100 || transgression < 0 || transgression > 100) {
            illegalAgrument();
        }

        this.name = name;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

    public static void compareStudent(Hogwarts student1, Hogwarts student2) {
        if (student1.magicPower > student2.magicPower) {
            System.out.println(student1.getName() + " обладает большей силой магии чем " + student2.getName());
        } else if (student1.magicPower < student2.magicPower) {
            System.out.println(student2.getName() + " обладает большей силой магии чем " + student1.getName());
        } else if (student1.magicPower == student2.magicPower) {
            System.out.println(student2.getName() + " и " + student1.getName() + " имеют равную силу магии.");
        }
        if (student1.transgression > student2.transgression) {
            System.out.println(student1.getName() + " обладает большей силой трансгрессии чем " + student2.getName());
        } else if (student1.transgression < student2.transgression) {
            System.out.println(student2.getName() + " обладает большей силой трансгрессии чем " + student1.getName());
        } else if (student1.transgression == student2.transgression) {
            System.out.println(student2.getName() + " и " + student1.getName() + " имеют равную силу трансгрессии.");
        }
    }

    @Override
    public String toString() {
        return "Имя:" + getName() + ", сила магии:" + getMagicPower() + ", трансгресия:" + getTransgression();
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMagicPower(int magicPower) {
        if (magicPower < 0 || magicPower > 100) {
            illegalAgrument();
        }
        this.magicPower = magicPower;
    }

    public void setTransgression(int transgression) {
        if (transgression < 0 || transgression > 100) {
            illegalAgrument();
        }

        this.transgression = transgression;
    }

    protected void illegalAgrument() {
        throw new IllegalArgumentException("Значение должно быть в пределах от 0 до 100.");
    }
}
