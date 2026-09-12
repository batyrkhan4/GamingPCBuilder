import builder.*;

public class Main {
    public static void main(String[] args) {
        GamingPCDirector director = new GamingPCDirector();
        GamingPC standardPC = director.constructStandardPC(new StandardGamingPCBuilder());
        GamingPCBuilder budgetBuilder = new BudgetGamingPCBuilder();
        GamingPC budgetPC = budgetBuilder.build();
        System.out.println("STANDARD PC:");
        System.out.println(standardPC);
        System.out.println("\nBUDGET PC:");
        System.out.println(budgetPC);
    }
}