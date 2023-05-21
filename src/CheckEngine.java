public interface CheckEngine {
    default void checkEngine() {
        System.out.println("Проверка двигателя");
    }
}