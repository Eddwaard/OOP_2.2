
public class Main {
    public static void main(String[] args) {
        System.out.println("Все что касается классов: Person, Customer, Gamer, PrintService относится к тренеровочной задачи из урока 2.2");
     /*   Person sara = new Person("Sarah", 35, 101);
        System.out.println("sara.age = " + sara.getAge());
        sara.setAge(34);
        System.out.println("sara.age = " + sara.getAge());
        System.out.println("-----------------------------------------------------------------------------------");

        Person[] people = {
                new Person("Сара", 30, 112),
                new Person("Джон", 12, 113),
                new Person("Иван", 25, 114),
                new Person("Том", 28, 115),
                new Person("Джо", 24, 116),
        };
        Customer[] customers = {
                new Customer("Сара", 30, 112,111321),
                new Customer("Иван", 25, 114,114588),
                new Customer("Том", 28, 115,114566),
        };
        Gamer[] gamers = {
                new Gamer("Джо", 24, 116,"PS"),
                new Gamer("Джон", 12, 113,"PC"),
        };

        PrintService printService = new PrintService();
        printService.print(people);
        printService.print(customers);
        printService.print(gamers);
    }

      */
        Hogwarts Students[] = {
                new Gryffindor("Гарри Поттер", 75, 70, 55, 80, 90),
                new Gryffindor("Гермиона Грейнджер", 80, 75, 60, 65, 75),
                new Gryffindor("Рональд Уизли", 65, 30, 60, 75, 80),
                new Slytherin("Драко Малфой", 80, 65, 75, 65, 90, 55, 85),
                new Slytherin("Грэхэм Монтегю", 65, 60, 60, 55, 55, 50, 60),
                new Slytherin("Грегори Гойл", 65, 55, 65, 70, 65, 60, 75),
                new Hufflepuff("Захария Смитт", 70, 60, 75, 60, 65),
                new Hufflepuff("Сэдрик Диггори", 90, 70, 80, 85, 85),
                new Hufflepuff("Джастин Финч-Флетчи", 65, 55, 65, 70, 70),
                new RavenClaw("Чжоу Чанг", 75, 65, 85, 80, 75, 80),
                new RavenClaw("Падма Патил", 70, 70, 75, 65, 70, 75),
                new RavenClaw("Маркус Белби", 65, 65, 75, 60, 65, 70),
        };
        for (Hogwarts Student : Students) {
            Student.print();
        }
        Students[0].compareFaculty(Students[1]);//Лучший ученик на факультете
        Students[3].compare(Students[9]);       //Лучший ученик по сумме всех параметров
        Students[1].compare(Students[11]);      //Лучший ученик по двум параметрам levelMagic и transgression

    }
}