package brideLaboratory;

public class Triangle extends Shape{
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Dibujando un triángulo. ");
        color.applyColor();
    }
}
