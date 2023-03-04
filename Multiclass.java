
 class circle{
   double x,y; //co-ordinate of center
   double r;  //radius

   //method that returns circumference
   double circum(){
       return 2*3.14*r;
   }
   
   //method that returns area
   double area(){
    return (22/7)*r*r;
   }
 }
 
 class box{
    double w; //width
    double h; //height
    double d; //depth
    double area(){
    	double a;
    	a=(w*h+h*d+w*d)*2;
    	return a;
    }
    double vol(){
    	double v; //volume
    	v =w*h*d;
    	return v;
    }
 }
    //declaring objects of type circle and box
      class Multiclass {
	public static void main(String[] args) {
		circle c = new circle();
		box b=new box();
		c.x=0;
		c.y=0;
		c.r=5;
		b.w=3;
		b.h=4;
		b.d=6;
		System.out.println("circunference =" + c.circum());
		System.out.println("Area="+c.area());
		System.out.println("area of box=" +b.area());
		System.out.println("volume of box="+ b.vol());
	}
}
