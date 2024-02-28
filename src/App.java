import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.err.println("Digite seu nome: ");
        Scanner sc =new Scanner(System.in);
		String name;
		name =sc.next();
		System.out.println("Welcome: "+name);

		sc.close();
    }
}
