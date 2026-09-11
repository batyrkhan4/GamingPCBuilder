package builder;

public class GamingPC {
    private final String cpu;
    private final String gpu;
    private final String ram;
    private final String storage;
    private final String powerSupply;

     GamingPC(String cpu, String gpu, String ram, String storage, String powerSupply) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.storage = storage;
        this.powerSupply = powerSupply;
    }

    @Override
    public String toString() {
        return "Gaming PC:\n" +
                "CPU: " + cpu + "\n" +
                "GPU: " + gpu + "\n" +
                "RAM: " + ram + "\n" +
                "Storage: " + storage + "\n" +
                "Power Supply: " + powerSupply;
    }

}
