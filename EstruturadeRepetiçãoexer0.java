            import java.util.Scanner;
                
            public class EstruturadeRepeti��oexer0 {
            
	        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
             		
     	    double salr=1000, salr2=0, altura, media, soma=0, menor=3, maior=0;
		    String genero;
		    int cont=1, cont1000=0;
		    
		    do {
			System.out.println("� um Homem(M) ou uma Mulher(F):");
			genero=leitor.next();
			System.out.println("Qual a quantia do sal�rio em R$:");
			salr2=leitor.nextDouble();
			System.out.println("Qual � a altura em metros (Ex.:1,7):");
			altura=leitor.nextDouble();
			cont++;
			soma=soma+salr2;
			media=soma/20;
			
			if(altura>maior) {
				maior=altura;
			}
			if(altura<menor) {
				menor=altura;
			}
			
			if (salr2<salr && genero.contentEquals("F")) { 
				cont1000++;}}
			
			while(cont<=20);
		    System.out.printf("A M�dia de sal�rio do grupo: %2f:\n",media);
		    System.out.println("O mais alto do grupo tem:"+maior+" metros, e o mais baixo tem:"+menor+"metros.");
		    System.out.println("As Mulheres com sal�rio at� 1000R$: "+cont1000);
			}
				

	}

