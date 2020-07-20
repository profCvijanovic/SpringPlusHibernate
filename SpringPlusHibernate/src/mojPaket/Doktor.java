package mojPaket;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Doktor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Value("${doktor.ime}")
	private String ime;
	@Value("${doktor.oblast}")
	private String oblast;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getOblast() {
		return oblast;
	}
	public void setOblast(String oblast) {
		this.oblast = oblast;
	}
	
	public void pozdrav() {
		System.out.println("Pozdrav od " + this.ime + " koji je " + this.oblast);
	}

}
