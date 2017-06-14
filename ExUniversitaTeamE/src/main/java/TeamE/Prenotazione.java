package TeamE;

import java.util.Scanner;

public class Prenotazione {
	public void createEsame(ServicesCrud crud, Scanner scanner) {
		System.out.println("Inserisci nome");
		String nome = scanner.nextLine();
		System.out.println("Inserisci numero studenti prenotati");
		int prenotati = scanner.nextInt();
		scanner.nextLine();
		Esame esame = new Esame();
		esame.setNome(nome);
		esame.setNumeroPrenotati(prenotati);
		crud.jpaCreate(esame);
	}

	public void readEsame(ServicesCrud crud, Scanner scanner) {
		System.out.println("Inserisci nome esame");
		String nome = scanner.nextLine();
		scanner.nextLine();
		String query = "SELECT e FROM Esame e WHERE e.nome =" + nome;
		Esame esame = (Esame) crud.jpaRead(query).getSingleResult();
		System.out.println(esame);

	}

	public void updateEsame(ServicesCrud crud, Scanner scanner) {
		System.out.println("Inserisci nome esame");
		String nome = scanner.nextLine();
		String query = "SELECT e FROM Esame e WHERE e.nome =" + nome;
		Esame esame = (Esame) crud.jpaRead(query).getSingleResult();
		System.out.println(esame);
		System.out.println("Cosa vuoi modificare?");
		System.out.println("1 Nome - 2 numeroPrenotati");
		int scelta = scanner.nextInt();
		scanner.nextLine();
		switch (scelta) {
		case 1:
			System.out.println("Inserisci nuovo nome");
			String nuovoNome = scanner.nextLine();
			esame.setNome(nuovoNome);
			break;
		case 2:
			System.out.println("Inserisci numeroPrenotati");
			int numeroPrenotati = scanner.nextInt();
			scanner.nextLine();
			esame.setNumeroPrenotati(numeroPrenotati);
			break;
		default:
			System.out.println("Scelta non valida");
			break;
		}
		crud.jpaUpdate(esame);
	}

	public void deleteEsame(ServicesCrud crud, Scanner scanner) {
			System.out.println("Inserisci nome esame");
			String nome = scanner.nextLine();
			String query = "SELECT e FROM Esame e WHERE e.nome =" + nome;
			Esame esame = (Esame) crud.jpaRead(query).getSingleResult();
			crud.jpaDelete(esame);

	}
	public void createAula(ServicesCrud crud, Scanner scanner) {
		System.out.println("Inserisci nome");
		String nome = scanner.nextLine();
		System.out.println("Inserisci numero studenti prenotati");
		int prenotati = scanner.nextInt();
		scanner.nextLine();
		Esame esame = new Esame();
		esame.setNome(nome);
		esame.setNumeroPrenotati(prenotati);
		crud.jpaCreate(esame);
	}

	
}

