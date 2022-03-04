package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected int width;
    protected int length;

    public void setting(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    abstract void setLength(int length);
    abstract void setWidth(int width);
}
