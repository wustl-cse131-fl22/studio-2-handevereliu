package studio2;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double squareArea=1;
double circleRadius=0.5;
double centerx=0;
double centery=0;
double inCircle=0;
double outCircle=0;

for (int i=0;i<100000;i++) {
	double x=Math.random()-0.5;
	double y=Math.random()-0.5;
	double distance=Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
	if (distance<=0.5) {
		inCircle++;
	}

	}
double ratio=inCircle/100000.0;
double pi=ratio*4.0;

System.out.println("Pi equals "+pi);
}
}	
