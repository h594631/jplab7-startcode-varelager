package no.hvl.dat100.varelager;

public class Varelager {

	protected Vare[] varer;
	protected int antall;
	
	public Varelager(int n) {
		
		varer = new Vare[n];
		antall = 0;

	}
	
	public Vare[] getVarer() {
		
		return varer;

	}
	
	public boolean leggTilVare(Vare v) {
		boolean sattInn = false;
		
		if (antall < varer.length) {
			varer[antall] = v;
			antall++;
			sattInn = true;
		}
		return sattInn;
	}
	
	public boolean leggTil(int varenr, String navn, double pris) {
		
		Vare v = new Vare(varenr, navn, pris);
		boolean sattInn = leggTilVare(v);
		return sattInn;
	}
	
	public Vare finnVare(int varenr) {
			
		Vare v = null;
		int i = 0;
		while (i < varer.length && (v == null)) {
			if (varer[i].getVarenr() == varenr) {
				v = varer[i];
			}
			i++;
		}
		return v;
	}
	
	private String SEP = "==============================";
	
	public void printVarelager() {
				
		System.out.println(SEP);
		for (Vare v : varer) {
			System.out.print(v.toString());
			System.out.println();
		}
		System.out.println(SEP);
	}
	
}
