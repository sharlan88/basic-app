package by.itstep.oop.casting;

public class ShapesTester {


    public static void shapeTest(Shape shape){
        shape.calculateP();
        shape.calculateS();
        shape.print();
        shape.showInfo();
    }



    public static void main(String[] args) {
        Triangle t1 = new Triangle(11, 9 , 6);
        t1.setColor("Red");
        t1.calculateP();
        t1.calculateS();
        t1.print();
        t1.showInfo();

        Rectangle rec1 = new Rectangle(4, 13);
        Rectangle rec2 = new Rectangle(5);


        rec1.calculateP();
        rec1.calculateS();
        rec1.showInfo();

        // casting -

        //Upcasting
        Shape sh1 = new Triangle(3, 7, 6);
        //(<Super Type>) instance
        Shape sh2 = (Shape) new Rectangle(54);


        Shape sh3 = new Triangle(5, 7, 11);
      //  sh3.setC(1000);
        //DownCasting -
        Triangle tr2 = (Triangle) sh3;//
        tr2.setC(9);




        Rectangle rectangle = new Rectangle(7);
        Triangle triangle = new Triangle(4, 5, 8);

        shapeTest(rectangle);
        shapeTest(triangle);

    }


}
