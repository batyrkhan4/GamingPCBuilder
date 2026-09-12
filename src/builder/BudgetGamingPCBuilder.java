package builder;

public class BudgetGamingPCBuilder implements GamingPCBuilder {
    private String cpu = "AMD Ryzen 5 5600";
    private String gpu = "NVIDIA RTX 4060";
    private String ram = "16GB";
    private String storage = "1TB SSD";
    private String powerSupply = "650W";

    @Override
    public GamingPCBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    @Override
    public GamingPCBuilder setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    @Override
    public GamingPCBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    @Override
    public GamingPCBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    @Override
    public GamingPCBuilder setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
        return this;
    }

    @Override
    public GamingPC build() {
        return new GamingPC(
                cpu,
                gpu,
                ram,
                storage,
                powerSupply
        );
    }
}
