package brideLaboratory;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new Red());
        Shape blueSquare = new Square(new Blue());
        Shape greenTriangle = new Triangle(new Green());

        redCircle.draw();        // Salida: Dibujando un círculo. Color rojo aplicado.
        blueSquare.draw();       // Salida: Dibujando un cuadrado. Color azul aplicado.
        greenTriangle.draw();    // Salida: Dibujando un triángulo. Color verde aplicado.

    }
}
