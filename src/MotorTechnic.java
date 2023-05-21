public abstract class MotorTechnic implements Service{

    private String modelName ;
    private int wheelsCount;

    public MotorTechnic(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }


}