public class KantinFaste {
	public static void main (String [] args) {
		
		int NasiGoreng = 8000;
		int IndomieGoreng = 8000;
		int IndomieRebus = 8000;
		int Minas = 10000;
		int BaksoMaknyus = 10000;
		int BaksoUrat = 15000;
		int TehGentong = 6000;
		int EsKosong = 1000;
		
		int TotalPembelian = Minas + BaksoUrat + IndomieRebus + TehGentong + EsKosong;
		
		int reqBagus = Minas + TehGentong;
		int reqFadhil = BaksoUrat + EsKosong;
		int reqHusain = IndomieRebus;
		
		System.out.println("Pesanan Bagus = " + reqBagus);
		System.out.println("Pesanan Fadhil = " + reqFadhil);
		System.out.println("Pesanan Husain = " + reqHusain);
		System.out.println("Total Semua Pembelian = " + TotalPembelian);
	}
}