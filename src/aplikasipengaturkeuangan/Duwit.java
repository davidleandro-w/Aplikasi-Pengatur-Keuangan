package aplikasipengaturkeuangan;

public class Duwit {

    
    private String saldo,jenis,keterangan,tanggal,waktu;
    private int jumlah;
    
    
    public Duwit(){}
     
    
    public Duwit(String saldo, String jenis, int jumlah, String keterangan, String tanggal, String waktu) {
        this.saldo = saldo;
        this.jenis = jenis;
        this.jumlah = jumlah;
        this.keterangan = keterangan;
        this.tanggal = tanggal;
        this.waktu = waktu;
    }
  
    public String getSaldo() {
        return saldo;
    }
    public String getJenis() {
        return jenis;
    }
    public String getKeterangan() {
        return keterangan;
    }
    public String getTanggal() {
        return tanggal;
    }
    public String getWaktu() {
        return waktu;
    }
    public int getJumlah() {
        return jumlah;
    }
   
    
}
