import java.util.Scanner;

public class EstruturadeRepeti��oexer03 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		double soma=0;
		double a,b=0;
		
		System.out.println("Por favor, digite 20 valores seguidos:");
		do {
		
		a=leitor.nextDouble();
		soma=a+soma;
		b++;}
		while (b<20); 
		
		
		
		System.out.println("A soma total deles � = "+(soma));
		System.out.println("E sua a m�dia � de = "+soma/20);
	}

}
