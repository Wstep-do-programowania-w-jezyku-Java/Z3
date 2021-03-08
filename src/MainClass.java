import java.util.Date;

public class MainClass {

	public static void main(String[] args) {
		Czlowiek c1=new Czlowiek("Jan","Kowalski",1976,3,23);
		System.out.println(c1.getImie()+" "+c1.getNazwisko()+" "+c1.getDataUr());
		
		Date tmp=c1.getDataUr();
		tmp.setYear(3000-1900);
		System.out.println(c1.getImie()+" "+c1.getNazwisko()+" "+c1.getDataUr());

		
//		Samochod s1=new Samochod("VW", "czarny");
//		System.out.println(s1.getMarka()+" "+s1.getKolor()+" "+s1.getLiczbaKol());
//		
//		Samochod s2=new Samochod("opel", "biały",6);
//		System.out.println(s2.getMarka()+" "+s2.getKolor()+" "+s2.getLiczbaKol());
//		
//		Czlowiek[] ludzie=new Czlowiek[3];
//		ludzie[0]= new Czlowiek("Zbigniew", "Nowak", 1976, 4, 15);
//		ludzie[1]= new Czlowiek("Tomasz", "Matlak", 1966, 3, 25);
//		ludzie[2]= new Czlowiek("Jan", "Nowak", 1956, 3, 5);
//		
//		for(Czlowiek c: ludzie)
//			System.out.println(c.getImie()+" "+c.getNazwisko()+" "+c.getDataUr());
//		
//		Samochod[] samochody={new Samochod("VW", "zielony"),new Samochod("Seat", "żółty")};
//		for(Samochod s: samochody)
//			System.out.println(s.getMarka()+" "+s.getKolor()+" "+s.getLiczbaKol());
		Osoba o1=new Osoba("Zenon", "Xenon", 1967,12,12);
		System.out.println(o1);
		Osoba o2=new Osoba("Zenon", "Zenon", 1967,12,12);
		System.out.println(o1.equals(o2));
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		
	}

}
