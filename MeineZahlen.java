package Int_sortiert;
import java.util.Scanner;
public class MeineZahlen {
	private int[] zahlarr;
	public void eingeben(int a) {
		this.zahlarr= new int[a];
		Scanner input = new Scanner(System.in);
		for(int i=0;i<a; i++) {
			this.zahlarr[i]=input.nextInt();
		}
		input.close();
	}
	public int[] getZahlarr() {
		return zahlarr;
	}
	public void setZahlarr(int[] zahlarr) {
		this.zahlarr = zahlarr;
	}
	public int ausgeben(int a) {
		return this.zahlarr[a];
	}
	public void tauschen(int c,int d) {
		int temp=c;
		c=d;
		d=temp;
	}
	public MeineZahlen sort() {
		MeineZahlen afterSort= new MeineZahlen();
		for(int i=0;i<this.zahlarr.length;i++) {
			for(int k=0;k<this.zahlarr.length;k++) {
				if(this.zahlarr[i]<this.zahlarr[k]) {
					int temp=this.zahlarr[i];
					this.zahlarr[i]=this.zahlarr[k];
					this.zahlarr[k]=temp;
				}
			}
		}
		afterSort.setZahlarr(zahlarr);
		return afterSort;
	}
	public MeineZahlen ohneMittelSort() {
		MeineZahlen afterSort= new MeineZahlen();
		for(int i=0;i<this.zahlarr.length;i++) {
			for(int k=0;k<this.zahlarr.length;k++) {
				if(this.zahlarr[i]<this.zahlarr[k]) {
					this.zahlarr[i]=this.zahlarr[k]+this.zahlarr[i];
					this.zahlarr[k]=this.zahlarr[i]-this.zahlarr[k];
					this.zahlarr[i]=this.zahlarr[i]-this.zahlarr[k];
				}
			}
		}
		afterSort.setZahlarr(zahlarr);
		return afterSort;
	}
	public MeineZahlen sortDurchAuswahl() {

		MeineZahlen afterSort= new MeineZahlen();
		for(int i=0;i<this.zahlarr.length;i++) {
			int min= this.zahlarr[i];
			for(int k=i+1;k<this.zahlarr.length;k++) {
				if(min>this.zahlarr[k]) {
					int temp= this.zahlarr[i];
					this.zahlarr[i]=this.zahlarr[k];
					this.zahlarr[k]=temp;
					min=this.zahlarr[i];
					}
			}
		}
		afterSort.setZahlarr(zahlarr);
		return afterSort;
	}
	public String toString() {
		String arr= "";
		for(int i=0;i<this.zahlarr.length;i++) {
			arr= arr+String.valueOf(zahlarr[i]);
			arr=arr+" ";
		}
		return arr;
	}

}
