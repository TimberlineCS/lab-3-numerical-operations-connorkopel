public class NumericalOperations{
  public static void main(String args[]){

//challenge 1
double d1 = 37.9;
double d2 = 1004.128;
int i1 = 12;
int i2 = 18;
System.out.println(57.2 * (i1 / i2) + 1);
System.out.println(57.2 * ((double)i1 / i2) + 1);
System.out.println(15 - i1 * (d1 * 3) + 4);
System.out.println(15 - i1 * ((int)d1 * 3) + 4);
System.out.println(15 - i1 * (int)(d1 * 3) + 4);





//challenge 2
int n = 1234;
int n1 = 1234 % 10;
n = n/10;

int n2 = n;
n2 = n2 % 10;
n = n/10;

int n3 = n;
n3 = n3 % 10;
n = n/10;

int n4 = n;

System.out.print(n1);
System.out.print(n2);
System.out.print(n3);
System.out.print(n4);
  }
}