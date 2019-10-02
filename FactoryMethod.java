interface Shape{  // Product (not instanceable)
    void draw();
    void fill();
}

interface ShapeCreator{       // Creator (not instanceable)
    public Shape getShape();  // Factory Method
}

class CreatorCircle implements ShapeCreator{  // Concrete Creator 1
    // OVERRIDING:
    public Shape getShape(){
        return new Circle();
    }
}

class Circle implements Shape{  // Concrete Product 1
    // OVERRIDING:
    public void draw(){
        System.out.println("Empty Circle ( )");
    }
    public void fill(){
        System.out.println("Full Circle (•)");
    }
}

class Square implements Shape{  // Concrete Product 2
    // OVERRIDING:
    public void draw(){
        System.out.println("Empty Square [ ]");
    }
    public void fill(){
        System.out.println("Full Square [x]");
    }
}

class Main{
    public static void main(String [] args){
        ShapeCreator creator = new CreatorCircle();
        Shape shape = creator.getShape();

        shape.draw();
        shape.fill(); 
    }
}