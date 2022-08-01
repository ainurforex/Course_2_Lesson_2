public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри Поттер", 70, 50, 50, 50, 60);
        Gryffindor germiona = new Gryffindor("Гермиона Грейнджер", 80, 40, 80, 20, 70);
        Gryffindor ron = new Gryffindor("Рон Уизли", 55, 45, 79, 67, 55);

        Hufflepuff zakharia = new Hufflepuff("Захария Смит", 30, 55, 44, 87, 52);
        Hufflepuff sedrik = new Hufflepuff("Седрик Диггори", 70, 53, 65, 25, 98);
        Hufflepuff djastin = new Hufflepuff("Джастин Финч-Флетчли", 63, 25, 84, 22, 53);

        Slytherin dracko = new Slytherin("Драко Малфой", 89, 51, 47, 62, 55, 14, 99);
        Slytherin grekhem = new Slytherin("Грэхэм Монтегю", 34, 73, 35, 90, 23, 63, 23);
        Slytherin gregori = new Slytherin("Грегори Гойл", 33, 52, 22, 78, 22, 52, 86);

        Ravenclaw chjou = new Ravenclaw("Чжоу Чанг", 67, 34, 77, 32, 98, 55);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 65, 64, 22, 65, 82, 34);
        Ravenclaw marckus = new Ravenclaw("Маркус Белби", 74, 12, 63, 44, 23, 76);
        System.out.println(harry);
        System.out.println(germiona);
        System.out.println(ron);
        System.out.println();
        System.out.println(zakharia);
        System.out.println(sedrik);
        System.out.println(djastin);
        System.out.println();
        System.out.println(dracko);
        System.out.println(grekhem);
        System.out.println(gregori);
        System.out.println();
        System.out.println(chjou);
        System.out.println(padma);
        System.out.println(marckus);

        Gryffindor.compareStudent(harry, germiona);
        Hufflepuff.compareStudent(zakharia, sedrik);
        Slytherin.compareStudent(dracko, gregori);
        Ravenclaw.compareStudent(chjou, padma);
        Hogwarts.compareStudent(gregori, harry);
    }
}