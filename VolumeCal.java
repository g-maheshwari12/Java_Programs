interface CalVolume
{
	static double pi = 3.14159; 
	void volume(); 
}
class Cone implements CalVolume 
{ 
	double r;
	double h;; 
	Cone(double r,double h)
	{
		this.r=r;
		this.h=h;
	}
	public void volume() 
	{ 
		double vol;
		vol=(double)1/3*pi*h*r*r;
		System.out.println("Volume of Cone is=> "+vol);
	} 
} 
class Hemisphere implements CalVolume 
{ 
	double r;
	Hemisphere(double r)
	{
		this.r=r;
	}
	public void volume() 
	{ 
		double vol;
		vol=(double)(2*pi*(double)Math.pow(r,3))/(double)(3); 
		System.out.println("Volume of Hemisphere is=> "+vol);
	} 
} 
class Cylinder implements CalVolume 
{ 
	double r;
	double h;; 
	Cylinder(double r,double h)
	{
		this.r=r;
		this.h=h;
	}
	public void volume() 
	{ 
		double vol;
		vol = pi*r*r*h; 
		System.out.println( "Volume of Cylinder is => "+vol ); 
	} 
} 
public class VolumeCal 
{
	public static void main(String args[]) 
	{ 
		Cone c1=new Cone(5.0,12.0);
		Hemisphere h1=new Hemisphere(11.0);
		Cylinder cy=new Cylinder(5.0,7.0);
		CalVolume ref;
		ref=c1;
		ref.volume();
		ref=h1;
		ref.volume();
		ref=cy;
		ref.volume();
	} 
}