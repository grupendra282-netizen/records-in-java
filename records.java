record Point(int x,int y){
	public static Point origin(){
		return new Point(0,0);
	}
}
record Person(String name, int age){
	public Person{
		if(name== null || name.isEmpty()){
			throw new IllegalArgumentException("Invalid name");
		}
		if (age<0){
			throw new IllegalArgumentException("Invalid age");
		}
		
	}
}
record Rectangle(Point topLeft, Point bottomRight){
	public Rectangle{
		if(topLeft == null || bottomRight== null){
			 throw new IllegalArgumentException("Points cannot be null");
		}
		if (bottomRight.x() <= topLeft.x() || bottomRight.y() <= topLeft.y()){
			
		throw new IllegalArgumentException("Invalid coordinates");
	}
}
public int area(){
	return(bottomRight.x() - topLeft.x()) * (bottomRight.y() - topLeft.y());
}
}
class main{
	public static void main(String[] args){
		Point p = Point.origin();
		System.out.println(p);
		Person person = new Person("Rupendra", 21);
		System.out.println(person);
		Rectangle r= new Rectangle(
	new Point(0,0), new Point(5,4));
	System.out.println("Area: " + r.area());
	}
}
	