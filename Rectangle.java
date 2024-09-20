class Rectangle{
	
	Point lengthTopCorner;
	
	private double height;
	private double width;
	
	public void setLeftTopCorner(Point l){
		lengthTopCorner=l;
	}
	public Point getLeftTopCorner(){
		return lengthTopCorner;
	}

	public void setHeight(double h1){
		height=h1;
	}
	public void setWidth(double w1){
		width=w1;
	}


 	public double getHeight(){
		return height;
         }
 	public double getWidth(){
		return width;
         }

	public void Display(){
	   int x=lengthTopCorner.getX();
	   int y=lengthTopCorner.getY();
           System.out.println("Height:"+height+" Width:"+width);
	   System.out.println("X:"+x+"  Y:"+y);

	}


}