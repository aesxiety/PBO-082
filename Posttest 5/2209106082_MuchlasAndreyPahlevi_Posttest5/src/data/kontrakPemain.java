package data;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class kontrakPemain extends club{
    private Date tanggalMulaiKontrak;
    private Date tanggalAkhirKontrak;
    private double nilaiKontrak;
    private double klausulPelepasan;

    public kontrakPemain(int idClub, String namaPemain, int idPemain, Date tanggalMulaiKontrak, Date tanggalAkhirKontrak, double nilaiKontrak, double klausulPelepasan){
        super(idClub, namaPemain, idPemain);
        this.tanggalMulaiKontrak = tanggalMulaiKontrak;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
        this.nilaiKontrak = nilaiKontrak;
        this.klausulPelepasan = klausulPelepasan;
    }

    @Override
    public int getIdPemain() {
        return super.getIdPemain();
    }

    @Override
    public kontrakPemain getContract() {
        return super.getContract();
    }

    @Override
    public void updatePemain(BufferedReader br, SimpleDateFormat formatter) throws IOException, ParseException {
        System.out.print("Masukkan Tanggal Mulai Kontrak : ");
        this.tanggalMulaiKontrak = formatter.parse(br.readLine());
        System.out.print("Masukkan Tanggal Akhir Kontrak : ");
        this.tanggalAkhirKontrak = formatter.parse(br.readLine());
    }

    // Overloading
    public void updatePemain(double nilaiKontrakBaru, double klausulPelepasanBaru) throws IOException, ParseException {
        this.nilaiKontrak = nilaiKontrakBaru;
        this.klausulPelepasan = klausulPelepasanBaru;
    }

    public Date getTanggalMulaiKontrak() {
        return tanggalMulaiKontrak;
    }

    public Date getTanggalAkhirKontrak() {
        return tanggalAkhirKontrak;
    }

    public double getNilaiKontrak() {
        return nilaiKontrak;
    }

    public double getKlausulPelepasan() {
        return klausulPelepasan;
    }

    public void setTanggalMulaiKontrak(Date tanggalMulaiKontrak) {
        this.tanggalMulaiKontrak = tanggalMulaiKontrak;
    }

    public void setTanggalAkhirKontrak(Date tanggalAkhirKontrak) {
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    public void setNilaiKontrak(double nilaiKontrak) {
        this.nilaiKontrak = nilaiKontrak;
    }

    public void setKlausulPelepasan(double klausulPelepasan) {
        this.klausulPelepasan = klausulPelepasan;
    }
}
