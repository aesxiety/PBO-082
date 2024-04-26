package data;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.text.ParseException;
// import java.text.SimpleDateFormat;

public class pemain {
    private int idPemain;
    private String namaPemain;
    private String asalKlub;
    private int umur;
    private double marketValue;

    public pemain(int idPemain, String namaPemain, String asalKlub, int umur, double marketValue){
        this.idPemain = idPemain;
        this.namaPemain = namaPemain;
        this.asalKlub = asalKlub;
        this.umur = umur;
        this.marketValue = marketValue;
    }
    public int getIdPemain() {
        return idPemain;
    }
    public String getNamaPemain() {
        return namaPemain;
    }
    public String getAsalKlub() {
        return asalKlub;
    }
    public int getUmur() {
        return umur;
    }
    public double getMarketValue() {
        return marketValue;
    }
    public void setIdPemain(int idPemain) {
        this.idPemain = idPemain;
    }
    public void setNamaPemain(String namaPemain) {
        this.namaPemain = namaPemain;
    }
    public void setAsalKlub(String asalKlub) {
        this.asalKlub = asalKlub;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }
}