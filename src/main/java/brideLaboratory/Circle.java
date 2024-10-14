package brideLaboratory;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Dibujando un círculo. ");
        color.applyColor();
    }
}
