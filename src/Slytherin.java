public class Slytherin extends Hogwarts {
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;
    private static String SLYTHERIN = "Слизерин";

    public Slytherin(String name, int levelMagic, int transgressive, int trick, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, SLYTHERIN, levelMagic, transgressive);
        if (trick < 0 || trick > 100 || determination < 0 || determination > 100 || ambition < 0 || ambition > 100 || resourcefulness < 0 || resourcefulness > 100 || lustForPower < 0 || lustForPower>100){
            throw new IllegalArgumentException("Значение указано за пределами допустимого");
        }
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Trick - "+ trick);
        System.out.println("Determination - "+ determination);
        System.out.println("Ambition - "+ ambition);
        System.out.println("Resourcefulness - "+ resourcefulness);
        System.out.println("Power - "+ lustForPower);
        System.out.println();
    }

    @Override
    public void compareFaculty(Hogwarts student) {
        super.compareFaculty(student);
    }

    @Override
    public int getSumFaculty() {
        return trick + determination + ambition + resourcefulness + lustForPower;
    }
}
