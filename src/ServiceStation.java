public class ServiceStation {
    public void check(MotorTechnic technic) {
        System.out.println("Обслуживаем" + technic.getClass().getName());
        technic.doService();
    }

}