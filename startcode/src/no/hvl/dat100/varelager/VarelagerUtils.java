package no.hvl.dat100.varelager;

public class VarelagerUtils {

	public static Vare finnBilligste(Vare[] varer) {
		Vare billigste = varer[0];
		for (int i = 1; i < varer.length - 1; i++) {
			if (varer[i].getPris() < billigste.getPris()) {
				billigste = varer[i];
			}
		}
		return billigste;
		

	}
	
	public static double totalPris(Vare[] varer) {		
		double sum = 0;
		for (Vare v: varer) {
			sum += v.getPris();
		}
		return sum;
	}
	
	public static int[] finnVarenr(Vare[] varer) {
		int[] vareNummerTab = new int[varer.length];
		for(int i = 0; i < varer.length; i++) {
			vareNummerTab[i] = varer[i].getVarenr();
		}
		return vareNummerTab;
	}
	
	public static double[] finnPrisDifferanser(Vare[] varer) {
		double[] prisDiffTab = new double[varer.length - 1];		
		
		for (int i = 0; i < prisDiffTab.length; i++) {
			prisDiffTab[i] = Math.abs(varer[i].getPris() - varer[i + 1].getPris());
		}
		return prisDiffTab;

	}
}
