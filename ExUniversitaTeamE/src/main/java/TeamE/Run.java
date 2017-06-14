package TeamE;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Prenotazione p = new Prenotazione();
		ServicesCrud crud = new ServicesCrud("jpa-example");
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Su quale tabella vuoi lavorare?");
			System.out.println("1 Aula - 2 Esame ");
			int sceltaTabella = scanner.nextInt();
			scanner.nextLine();
			switch (sceltaTabella) {
			case 1: // Aula
				System.out.println("Cosa vuoi fare?");
				System.out.println("1_C 2_R 3_U 4_D");
				int crud1 = scanner.nextInt();
				scanner.nextLine();
				switch (crud1) {
				case 1:
					p.createAula(crud, scanner);
					break;
				case 2:
					p.readAula(crud, scanner);
					break;
				case 3:
					p.updateAula(crud, scanner);
					break;
				case 4:
					p.deleteAula(crud, scanner);
					break;
				default:
					System.out.println("Scelta non valida");
					break;
				}
				break;
			case 2: // esame
				System.out.println("Cosa vuoi fare?");
				System.out.println("1 C ,2 R,3 U ,4D");
				int crud2 = scanner.nextInt();
				scanner.nextLine();
				switch (crud2) {
				case 1:
					p.createEsame(crud, scanner);
					break;
				case 2:
					p.readEsame(crud, scanner);
					break;
				case 3:
					p.updateEsame(crud, scanner);
					break;
				case 4:
					p.deleteEsame(crud, scanner);
					break;
				default:
					System.out.println("Scelta non valida");
					break;
				}
				break;
			default:
				System.out.println("Scelta non valida");
				break;
			}

		}
	}
}