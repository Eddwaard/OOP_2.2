public abstract class Hogwarts {
    private String name;
    private final String nameFaculty;
    private int levelMagic;
    private int transgressive;

    public Hogwarts(String name, String nameFaculty, int levelMagic, int transgressive) {
        if (levelMagic < 0 || levelMagic > 100 || transgressive < 0 || transgressive > 100) {
            throw new IllegalArgumentException("Значение указано за пределами допустимого");
        }
        this.name = name;
        this.nameFaculty = nameFaculty;
        this.levelMagic = levelMagic;
        this.transgressive = transgressive;
    }

    public String getName() {
        return name;
    }
    public String getNameFaculty() {
        return nameFaculty;
    }

    public int getLevelMagic() {
        return levelMagic;
    }

    public int getTransgressive() {
        return transgressive;
    }
    private int getSumPower() {
        return levelMagic + transgressive;
    }

    public void print() {
        System.out.println(name);
        System.out.println("Magic - " + levelMagic);
        System.out.println("Transgressive - " + transgressive);
    }

    public void compare(Hogwarts student) {
        int sum1 = getSumPower();
        int sum2 = student.getSumPower();
        if (sum1 > sum2) {
            System.out.println(getName() + " лучший ученик школы магии Хогвартс, чем " + student.getName() + "!");
        } else {
            System.out.println(student.getName() + " лучший ученик школы магии Хогвартс, чем " + getName() + "!");
        }
    }
    public void compareFaculty(Hogwarts student) {
        if (this.getClass().equals(student.getClass())){
            int sum1 = getSumFaculty();
            int sum2 = student.getSumFaculty();
            if (sum1 > sum2){
                System.out.println(getName() + " лучший ученик факультета " + nameFaculty + ", чем " + student.getName() + "!");
            } else {
                System.out.println(student.getName() + " лучший ученик факультета " + nameFaculty + ", чем " + getName() + "!");
            }
        } else {
            throw new IllegalArgumentException("Ученики из разных факультетов!");
        }
    }
    public abstract int getSumFaculty();
}
