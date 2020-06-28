import java.util.Scanner;

    public class EstruturadeRepetiçãoexer01 {

	public static void main(String[] args) {
		
    Scanner leitor = new Scanner (System.in);
		
	float num;
		
	System.out.println("Digite um numero e descubra se ele é positivo ou negativo");
	num=leitor.nextFloat();
		
	if (num<0)
	System.out.println("Ele é negativo.");
	if (num>0)
	System.out.println("Ele é positivo.");
		
	if (num==0)
	System.out.println("Ele é neutro, é o número ZERO.");
		}
}
