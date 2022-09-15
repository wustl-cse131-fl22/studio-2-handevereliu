package studio2;

import java.util.Scanner;


public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter start amount");
	double startAmount=in.nextDouble();
	System.out.println("Enter win chance");
	double winChance=in.nextDouble();
	System.out.println("Enter win limit");
	double winLimit=in.nextDouble();
	System.out.println("Enter simulation limit");
	double totalSimulations=in.nextDouble();

	double simulations=0;
	double ruin=0;
	while (simulations<totalSimulations) {
		double plays=0;
		double money=startAmount;
		while (money>0 && money<winLimit) {
			double x=Math.random()*100.0;
			if (x<=winChance) {
				money+=1;
				plays++;
			}
			else {
				money-=1;
				plays++;
			}
			
		}
		System.out.println("Number of plays: " + plays);
		if (money==0) {
			System.out.println("Ruin");
			ruin++;
		}
		else {
			System.out.println("Success");
	}
		simulations++;
		System.out.println("Simulations: " + simulations);
	}
double a=(1-winChance/100.0)/(winChance/100.0);
double ruinRate=ruin/simulations;
double expectedRuin=0;
System.out.println("Ruin rate: "+ruinRate*100+"%");
if (winChance==50) {
	expectedRuin=1-startAmount/winLimit;
}
else {
	expectedRuin=( Math.pow(a, startAmount)-Math.pow(a, winLimit) )/(1-Math.pow(a, winLimit));
}
System.out.println("Expected ruin rate: "+expectedRuin*100.0+"%");
	}

}
