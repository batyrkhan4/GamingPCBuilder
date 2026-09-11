package builder;

public class StandardGamingPCBuilder implements GamingPCBuilder {
    private String cpu;
    private String gpu;
    private String ram;
    private String storage;
    private String powerSupply;

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
