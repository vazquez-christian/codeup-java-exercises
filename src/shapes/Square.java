package shapes;

class Square extends Quadrilateral {
    @Override
    public double getPerimeter() {
        return length*2 + width*2;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    void setLength(int length) {

    }

    @Override
    void setWidth(int width) {

    }


}
