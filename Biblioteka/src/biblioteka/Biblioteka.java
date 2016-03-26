package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {
	private LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();

	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		knjige.add(knjiga);
	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		knjige.remove(knjiga);
	}

	@Override
	public LinkedList<Knjiga> VratiSveKnjige() {
		return knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, long ISBN, String naslov, String izdavac) {
		LinkedList<Knjiga> rezultat = new LinkedList<Knjiga>();
		for (Knjiga knjiga : knjige) {
			if(knjiga.getNaslov().contains(naslov)) rezultat.add(knjiga);
		}
		return rezultat;
	}

}
