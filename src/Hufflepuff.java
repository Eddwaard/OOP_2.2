public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int honesty;
    private int loyalty;
    private static String HUFFLEPUFF = "Пуфендуй";

    public Hufflepuff(String name, int levelMagic, int transgressive, int industriousness, int honesty, int loyalty) {
        super(name, HUFFLEPUFF, levelMagic, transgressive);
        if (industriousness < 0 || industriousness > 100 || honesty < 0 || honesty > 100 || loyalty < 0 || loyalty > 100){
            throw new IllegalArgumentException("Значение указано за пределами допустимого");
        }
        this.industriousness = industriousness;
        this.honesty = honesty;
        this.loyalty = loyalty;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Industriousness - "+ industriousness);
        System.out.println("Honesty - "+ honesty);
        System.out.println("Loyalty - "+ loyalty);
        System.out.println();
    }

    @Override
    public void compareFaculty(Hogwarts student) {
        super.compareFaculty(student);
    }

    @Override
    public int getSumFaculty() {
        return industriousness + honesty + loyalty;
    }
}
