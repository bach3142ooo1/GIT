package Int_sortiert;

public class main_MeineZahlen {
	public static void main(String[] args) {
		MeineZahlen meinezahlen= new MeineZahlen();
		meinezahlen.eingeben(5);
		System.out.println(meinezahlen.sortDurchAuswahl());
	}
}
