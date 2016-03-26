package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {
	private LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();

	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		if(knjiga == null || knjige.contains(knjiga)) throw new RuntimeException("Greska pri unosu knjige!"); 
		knjige.add(knjiga);
	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		if(knjiga == null || knjige.contains(knjiga)) throw new RuntimeException("Greska pri brisanju knjige!"); 
		knjige.remove(knjiga);
	}

	@Override
	public LinkedList<Knjiga> VratiSveKnjige() {
		return knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, long ISBN, String naslov, String izdavac) {
		if (autor==null && ISBN==0 && naslov==null && izdavac==null) 
			throw new RuntimeException("Morate uneti bar neki kriterijum za pretragu");
		
		LinkedList<Knjiga> rezultat = new LinkedList<Knjiga>();
		
		for (Knjiga knjiga : knjige) {
			if(knjiga.getNaslov().contains(naslov)) rezultat.add(knjiga);
		}
		return rezultat;
	}

}
