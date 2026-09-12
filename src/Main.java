import builder.GamingPC;
import builder.GamingPCDirector;
import builder.StandardGamingPCBuilder;

public class Main {
    public static void main(String[] args) {
        GamingPCDirector director = new GamingPCDirector();
        GamingPC standardPC = director.constructStandardPC(new StandardGamingPCBuilder());
        System.out.println(standardPC);
    }
}