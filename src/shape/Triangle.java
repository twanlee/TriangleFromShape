package shape;

public class Triangle extends Shape {
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;
    public Triangle(){};
    public Triangle(String color, Boolean filled, double side1, double side2, double side3){
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    @Override
    public void setColor(String color){
        super.setColor(color);
    }
    @Override
    public void setFilled(Boolean filled){
        super.setFilled(filled);
    }
    public Boolean checkTriangle(){
        return this.side1 + this.side2 > this.side3 &&
                this.side2 + this.side3 > this.side1 &&
                this.side1 + this.side3 > this.side2;
    }
    public double perimeter(){
        return this.side3 + this.side2 + this.side1;
    }
    @Override
    public String toString(){
        if(this.checkTriangle()){
            return super.toString() + " Have side1 = "+side1 + " side2= " + side2 +" side3 = "+ side3 + " and Perimeter is: " + this.perimeter();
        }else return "Not a triangle";
    }
}
