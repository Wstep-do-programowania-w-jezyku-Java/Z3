import java.time.LocalDate;
import java.util.Date;

public class Czlowiek {
	private String imie, nazwisko;
	private Date dataUr;
//	private int wzrost;
	
	public Czlowiek(String imie, String nazwisko, int rok, int mies, int dzien) {
		this.imie=imie;
		this.nazwisko=nazwisko;
		Date tmp=new Date();
		tmp.setYear(rok-1900);
		tmp.setMonth(mies-1);
		tmp.setDate(dzien);
		this.dataUr=tmp;
	}
	
	public String getImie() {
		return imie;
	}
	
	public String getNazwisko() {
		return nazwisko;
	}
	
	public Date getDataUr() {
		return (Date) dataUr.clone();
	}
	
//	public int getWzrost() {
//		return wzrost;
//	}
}
