public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    private static String GRYFFINDOR = "Гриффиндор";

    public Gryffindor(String name, int levelMagic, int transgressive, int nobility, int honor, int bravery) {
        super(name, GRYFFINDOR, levelMagic, transgressive);
        if (nobility < 0 || nobility > 100 || honor < 0 || honor > 100 || bravery < 0 || bravery > 100) {
            throw new IllegalArgumentException("Значение указано за пределами допустимого");
        }
            this.nobility = nobility;
            this.honor = honor;
            this.bravery = bravery;
        }
    @Override
    public void print() {
        super.print();
        System.out.println("Nobility - "+ nobility);
        System.out.println("Honor - "+ honor);
        System.out.println("Bravery - "+ bravery);
        System.out.println();
    }

    @Override
    public int getSumFaculty() {
        return nobility + honor + bravery;
    }

    @Override
    public void compareFaculty(Hogwarts student) {
        super.compareFaculty(student);
    }
    }

