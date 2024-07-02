package Demo;


	
import java.util.List;
import java.util.function.Consumer;

public class li {
    
    public static void processData(List<String> data, Consumer<String> consumer) {
        for (String str : data) {
            consumer.accept(str);
        }
    }

    public static void main(String[] args) {
        List<String> data = List.of("java", "python", "springboot");

        // Example usage with a lambda expression that prints each string
        processData(data, str -> System.out.println(str));
        
        System.out.println("---------------------------------");
        processData(data,str -> System.out.println(str.toUpperCase()));
    }
}




