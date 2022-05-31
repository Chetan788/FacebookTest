package test1;

public class Test {
	public static void main(String[] args) {
	int a=10;
	int b=0;
	int c=2;
int d []= {11,2,34,45,8};

try {
	 c=a/b;
	System.out.println(d[10]);
}
catch(ArithmeticException x) {
	b=1;
c=a/b;
}

catch(Exception x){
System.out.println("exception handle");
x.printStackTrace();
}

System.out.println(c);
System.out.println("an");
}
}
