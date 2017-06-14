package TeamE;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "aula", schema = "gestione_universita")
public class Aula {
	@Id
	@GeneratedValue
	private int id;
	private int numeroPosti;
	private String materia;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumeroPosti() {
		return numeroPosti;
	}
	public void setNumeroPosti(int numeroPosti) {
		this.numeroPosti = numeroPosti;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	@Override
	public String toString() {
		return "Aula [id=" + id + ", numeroPosti=" + numeroPosti + ", materia=" + materia + "]";
	}
	
	

}
