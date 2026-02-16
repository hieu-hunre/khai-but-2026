import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var myGoals = List.of(
                new Resolution("Master Spring Boot", true),
                new Resolution("IELTS 7.5+", true),
                new Resolution("Boost my income", true)
        );

        System.out.println("2026 SYSTEM INITIALIZATION");
        myGoals.stream()
                .filter(Resolution::isAchieved)
                .forEach(r -> System.out.printf("Checking: %s... DONE! \n", r.goal()));

        System.out.println("Result: A prosperous year is being deployed...");
    }
}