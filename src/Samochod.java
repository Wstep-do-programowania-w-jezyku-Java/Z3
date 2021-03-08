
public class Samochod {
	private String marka, kolor;
	private int liczbaKol;

	{
		liczbaKol=4;
	}
	
	public Samochod(String marka, String kolor) {
		this.marka = marka;
		this.kolor = kolor;
	}
	
	public Samochod(String marka, String kolor, int liczbaKol) {
		this(marka,kolor);
		this.liczbaKol=liczbaKol;
	}
	public String getMarka() {
		return marka;
	}
	public String getKolor() {
		return kolor;
	}
	public int getLiczbaKol() {
		return liczbaKol;
	}


}
