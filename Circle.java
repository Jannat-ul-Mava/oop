class Circle{

	Point center;

        double radius;

	public void setCenter(Point c){
		center=c;
	}
        public Point getCenter(){
		return center;
         }


	public void setRadius(double r1){
		radius=r1;
	}
        public double getRadius(){
		return radius;
         }
	public void Display(){
		int x=center.getX();
		int y=center.getY();
		System.out.println("Radius:"+radius);
		System.out.println("X:"+x+"  Y:"+y);

	}



}
