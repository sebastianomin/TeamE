package TeamE;

import java.util.ArrayList;
import java.util.Scanner;



public class Prenotazione {
	ArrayList<Aula> aule=new ArrayList<Aula>();
	ArrayList<Esame> esami=new ArrayList<Esame>();
	
	public void createEsame(ServicesCrud crud, Scanner scanner) {
		System.out.println("Inserisci nome");
		String nome = scanner.nextLine();
		System.out.println("Inserisci numero studenti prenotati");
		int prenotati = scanner.nextInt();
		scanner.nextLine();
		Esame e = new Esame();
		e.setNome(nome);
		e.setNumeroPrenotati(prenotati);
		crud.jpaCreate(e);
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
		System.out.println("Inserisci materia");
		String materia = scanner.nextLine();
		System.out.println("Inserisci numeroPosti");
		int numeroPosti = scanner.nextInt();
		scanner.nextLine();
		Aula a = new Aula();
		a.setMateria(materia);
		a.setNumeroPosti(numeroPosti);
		
		crud.jpaCreate(a);
	}

	void readAula(ServicesCrud crud, Scanner scanner) {
		System.out.println("Inserisci ID aula");
		int idAula = scanner.nextInt();
		scanner.nextLine();
		String query = "SELECT a FROM Aula a WHERE s.id =" + idAula;
		Aula a = (Aula) crud.jpaRead(query).getSingleResult();
		System.out.println(a);

	}

	public void updateAula(ServicesCrud crud, Scanner scanner) {
		System.out.println("Inserisci ID aula");
		int idAula = scanner.nextInt();
		scanner.nextLine();
		String query = "SELECT a FROM Aula a WHERE a.id =" + idAula;
	    Aula a = (Aula) crud.jpaRead(query).getSingleResult();
		System.out.println(a);
		System.out.println("Cosa vuoi modificare?");
		System.out.println("1 materia - 2 numeroPosti");
		int scelta = scanner.nextInt();
		scanner.nextLine();
		switch (scelta) {
		case 1:
			System.out.println("Inserisci nuova materia");
			String nuovaMateria = scanner.nextLine();
			a.setMateria(nuovaMateria);
			break;
		case 2:
			System.out.println("Inserisci numeroPosti");
			int nuoviPosti = scanner.nextInt();
			scanner.nextLine();
			a.setNumeroPosti(nuoviPosti);
			break;
		
		default:
			System.out.println("Scelta non valida");
			break;
		}
		crud.jpaUpdate(a);
	}

	public void deleteAula(ServicesCrud crud, Scanner scanner) {
		System.out.println("Inserisci ID aula");
		int idAula = scanner.nextInt();
		scanner.nextLine();
		String query = "SELECT a FROM Aula a WHERE a.id =" + idAula;
		Aula a= (Aula) crud.jpaRead(query).getSingleResult();
		crud.jpaDelete(a);

	}
	
	public void VerificaDisponibilita(ServicesCrud crud){
		
		
	}


	
}

