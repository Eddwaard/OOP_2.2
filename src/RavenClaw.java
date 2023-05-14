public class RavenClaw extends Hogwarts {
    private int smart;
    private int wise;
    private  int witty;
    private int creativity;
    private static String RavenCLAW = "Когтевран";

    public RavenClaw(String name, int levelMagic, int transgressive, int smart, int wise, int witty, int creativity) {
        super(name, RavenCLAW, levelMagic, transgressive);
        if (smart < 0 || smart > 100 || wise < 0 || wise > 100 || witty < 0 || witty > 100 || creativity < 0 || creativity > 100 ){
            throw new IllegalArgumentException("Значение указано за пределами допустимого");
        }
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Smart - "+ smart);
        System.out.println("Wise - "+ wise);
        System.out.println("Witty - "+ witty);
        System.out.println("Creativity - "+ creativity);
        System.out.println();
    }

    @Override
    public void compareFaculty(Hogwarts student) {
        super.compareFaculty(student);
    }


    @Override
    public int getSumFaculty() {
        return smart + wise + witty + creativity;
    }
}
