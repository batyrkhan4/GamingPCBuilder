package builder;

public class GamingPC {
    private String cpu;
    private String gpu;
    private String ram;
    private String storage;
    private String powerSupply;

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
