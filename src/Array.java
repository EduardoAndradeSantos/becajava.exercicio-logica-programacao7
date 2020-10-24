import java.util.Scanner;

public class Array {
	public Scanner leitor = new Scanner(System.in);
	public int[] numeros = new int[10];
	public int[] inverso = new int[10];
	public int i = 0;
	public int x = 9;

	public Array() {
		GravaArray();
		InverteOrdem();
	}

	public void GravaArray() {
		while (i < 10) {
			System.out.printf("Digite uma sequencia de numeros 10 vezes: ");
			numeros[i] = leitor.nextInt();
			i++;
		}
	}

	public void InverteOrdem() {
		System.out.printf("ordem invertida é: ");
		while (x > -1) {
			System.out.printf(numeros[x] + " ,");
			x--;
		}
	}
}
