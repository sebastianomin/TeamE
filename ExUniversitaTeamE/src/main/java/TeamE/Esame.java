package TeamE;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "esame", schema = "gestione_universita")
public class Esame {

	@Id
	private String nome;
	private int numeroPrenotati;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroPrenotati() {
		return numeroPrenotati;
	}
	public void setNumeroPrenotati(int numeroPrenotati) {
		this.numeroPrenotati = numeroPrenotati;
	}
	@Override
	public String toString() {
		return "Esame [nome=" + nome + ", numeroPrenotati=" + numeroPrenotati + "]";
	}
	

}