import java.util.List;

public class AreaCalculator {
    public static double calculateArea(List<FormaGeometrica> forme) {
        int sum = 0;

        for (FormaGeometrica forma : forme) {
            sum += forma.getArea();

        }
        return sum;

    }
}
