import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Osoba extends Object{
	private String imie, nazwisko;
	private LocalDate dataUr;
	
	public Osoba(String imie, String nazwisko, int rok, int mies, int dzien) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.dataUr = LocalDate.of(rok, mies, dzien);
	}

	public String getImie() {
		return imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public LocalDate getDataUr() {
		return dataUr;
	}
	
	@Override
	public String toString() {
		return imie+" "+nazwisko+" "+dataUr;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		
		if(obj==null)
			return false;
		
		if (obj.getClass()!=this.getClass())
			return false;
		
		Osoba o=(Osoba)obj;
		
		return o.imie.equals(this.imie) && o.nazwisko.equals(this.nazwisko)&&
				o.dataUr.equals(this.dataUr);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(imie,nazwisko,dataUr);
	}
	
}
