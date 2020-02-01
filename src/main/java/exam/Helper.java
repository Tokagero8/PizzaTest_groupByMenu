package exam;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {

    public String groupByMenu(List<Pizza> pizzas) {
        return pizzas.stream()
                .collect(Collectors.groupingBy(
                        p -> p.getIngredients().stream().noneMatch(i -> i.isMeat()) ? "Vegetarian"
                        : p.getIngredients().stream().anyMatch(i -> i.isSpicy()) ? "Spicy"
                        : "Normal",
                        Collectors.toSet()
                ))
                .entrySet().stream()
                .map(n -> n.getKey() + ": " + n.getValue().stream().map(p -> p.getName() + " " + p.getIngredients().stream().mapToInt(i -> i.getPrice()).sum()).collect(Collectors.joining(", ")))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining("\n"));
    }
}
