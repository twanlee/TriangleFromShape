package shape;

public class Shape {
    private String color = "Black";
    private Boolean filled = true;
    public Shape(){};
    public Shape(String color, Boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString(){
        return "A Shape with color "+ getColor()+ " and "+ (filled ? "Filled": "no filled");
    }
}
