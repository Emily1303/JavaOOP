package polymorphism.shape;

public abstract class Shape {

    private final Double perimeter = null;
    private final Double area = null;

    protected Shape() {
    }

    protected Double getPerimeter() {
        return null;
    }

    protected Double getArea() {
        return null;
    }

    protected abstract Double calculatePerimeter();

    protected abstract Double calculateArea();
}
