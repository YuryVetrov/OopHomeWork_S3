public class AppArea {

    public static void main(String[] args) {
  
      // Form f = new Form();
      // Button btn = new Button();
      // Button btn2 = new Button();
      // TextBox tb = new TextBox();
  
      // btn.click = null;
      // btn2.click = null;
      // tb.click = null;
  
      // f.addComponent(btn);public class AppArea {
        
      }
      
      // f.addComponent(btn2);
      // f.addComponent(tb);
      // btn.click();
  
      // Square3 sq = new Square3();
      // sq.setSide(10);
      // System.out.println(sq.getArea());
  
      // Rectangle3 re = new Rectangle3(3, 4);
  
      // System.out.println(re.getArea());
  
      // ArrayList<Figure> ma = new ArrayList<>();
      // ma.add(sq);
      // ma.add(re);
  
      // for (Figure figure : ma) {
      // figure.getArea();
      // }
    }
  
  abstract class Figure {
    public abstract double getArea();
  }
  
  class Circle extends Figure {
    double r = 0;
  
    @Override
    public double getArea() {
      return Math.PI * r * r;
    }
  
  }
  
  class Rectangle extends Figure {
  
    protected double width;
    protected double height;
  
    public double getHeight() {
      return height;
    }
  
    public double getWidth() {
      return width;
    }
  
    public void setHeight(double height) {
      this.height = height;
    }
  
    public void setWidth(double width) {
      this.width = width;
    }
  
    @Override
    public double getArea() {
  
      return width * height;
    }
  }
  
  class Square extends Rectangle {
  
    private double side;
  
    public double getSide() {
      return side;
    }
  
    public void setSide(double side) {
      super.height = side;
      super.width = side;
      this.side = side;
    }
  
    @Override
    public void setWidth(double width) {
      super.setWidth(width);
      super.height = width;
      this.side = width;
    }
  
    @Override
    public void setHeight(double height) {
      super.setHeight(height);
      super.width = height;
      this.side = height;
    }
  
    @Override
    public double getArea() {
  
      return super.getArea();
    }
  }
  
  class Square2 extends Figure {
  
    protected double side;
  
    public double getSide() {
      return side;
    }
  
    public void setSide(double side) {
      this.side = side;
    }
  
    @Override
    public double getArea() {
  
      return side * side;
    }
  }
  
  class Rectangle2 extends Square2 {
  
    protected double width;
    protected double height;
  
    public Rectangle2(double width, double height) {
      this.height = height;
      this.width = width;
      super.side = height;
    }
  
    public double getHeight() {
      return height;
    }
  
    public double getWidth() {
      return width;
    }
  
    public void setHeight(double height) {
      this.height = height;
    }
  
    public void setWidth(double width) {
      super.setSide(side);
      this.height = side;
      this.width = side;
  
    }
  
    @Override
    public void setSide(double side) {
      super.setSide(side);
      this.height = side;
      this.width = side;
    }
  
    @Override
    public double getSide() {
      return super.getSide();
    }
  
    @Override
    public double getArea() {
  
      return width * height;
    }
  }
  
  class Square3 extends Figure {
  
    protected double side;
  
    public double getSide() {
      return side;
    }
  
    public void setSide(double side) {
      this.side = side;
    }
  
    @Override
    public double getArea() {
  
      return side * side;
    }
  }
  
  class Rectangle3 extends Figure {
  
    protected double width;
    protected double height;
  
    public Rectangle3(double width, double height) {
      this.height = height;
      this.width = width;
    }
  
    public double getHeight() {
      return height;
    }
  
    public double getWidth() {
      return width;
    }
  
    public void setHeight(double height) {
      this.height = height;
    }
  
    public void setWidth(double width) {
      this.width = width;
    }
  
    @Override
    public double getArea() {
  
      return width * height;
    }
  }