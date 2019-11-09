package my.gitrepo;

public class FibonacciSeries 
{

public static void main(String[] args) 
{
	
	//Fibonacci series --> 0,1,1,2,3,5,8,13,21
	
int a=-1;
int b=1;

int sum=0;

for(int i=0;i<=10;i++)
{
	sum=a+b; 
	
	a=b;
	b=sum;
	
	System.out.print(sum+"  "); // It will print First 10 fibonacci numbers starts from 0
	
	//made some changes for GIT Reference
}
	
}	
}
