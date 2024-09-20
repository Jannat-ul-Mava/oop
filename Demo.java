public class Demo{
    
    public static void main(String args[]){

      // code in which x and y has same value in the rectangle and circle 

	/* Point p=new Point();
	 p.setX(30);
	 p.setY(40);
        
         Rectangle r=new Rectangle();
         r.setHeight(20.0);
         r.setWidth(30.0);
	 r.setLeftTopCorner(p);

         Circle c=new Circle();
         c.setRadius(40.0);
	 c.setCenter(p);

	 r.Display();
	 c.Display();*/

	// code in which x value changes in both rectangle and circle 

	 /*Point p=new Point();
	 p.setX(90);
	 p.setY(70);
        
         Rectangle r=new Rectangle();
         r.setHeight(20.0);
         r.setWidth(30.0);
	 r.setLeftTopCorner(p);

         Circle c=new Circle();
         c.setRadius(40.0);
	 c.setCenter(p);
	 c.getCenter().setX(80);

	 r.Display();
	 c.Display();*/

	// code in which x and y has different value in the rectangle and circle when we change it 
	
	 Point p=new Point();
	 p.setX(90);
	 p.setY(70);
        
         Rectangle r=new Rectangle();
         r.setHeight(20.0);
         r.setWidth(30.0);
	 r.setLeftTopCorner(p);

         Circle c=new Circle();
         c.setRadius(40.0);
	 c.setCenter(p);
	 c.setCenter(new Point());
	 c.getCenter().setX(50);
	 c.getCenter().setY(60);

	 r.Display();
	 c.Display();



}

}