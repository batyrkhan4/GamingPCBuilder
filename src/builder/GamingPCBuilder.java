package builder;

public interface GamingPCBuilder {
    GamingPCBuilder setCpu(String cpu);
    GamingPCBuilder setGpu(String gpu);
    GamingPCBuilder setRam(String ram);
    GamingPCBuilder setStorage(String storage);
    GamingPCBuilder setPowerSupply(String powerSupply);

    GamingPC build();
}
