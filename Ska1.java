//program that uses circle class
//call this file ska1.java
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
    
      class Ska1 {
	public static void main(String[] args) {
		circle c = new circle();
		c.x=0;
		c.y=0;
		c.r=5;
		System.out.println("circunference =" + c.circum());
		System.out.println("Area="+c.area());
	}
}
