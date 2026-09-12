package builder;

public class GamingPCDirector {
    public GamingPC constructStandardPC(GamingPCBuilder builder) {
        return builder.setCpu("AMD Ryzen 7 7800X3D")
                .setGpu("NVIDIA RTX 5070")
                .setRam("32GB")
                .setStorage("2TB SSD")
                .setPowerSupply("850W")
                .build();
    }

}
