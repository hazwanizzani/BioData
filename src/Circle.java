public class Circle {
    public static void main(String[] args) {

        double radius = 24.25f;
        double pieValue = 3.14f;

        double area;

        area = radius * radius * pieValue;

        System.out.println("Area of Circle \n" +
                " ----------------------------\n" +
                "Radius: " + radius +"cm \n" +
                "Area: " + area + "cm^2");
    }
}
