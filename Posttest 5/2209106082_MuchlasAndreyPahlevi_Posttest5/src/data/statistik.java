package data;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class statistik extends club{
    String posisi;
    private int gol;
    private int assist;
    private int match;
    
    public statistik(int idClub, String namaPemain, int idPemain, String posisi, int gol, int assist, int match) {
        super(idClub, namaPemain, idPemain);
        this.posisi = posisi;
        this.gol = gol;
        this.assist = assist;
        this.match = match;
    }

    @Override
    public int getIdPemain() {
        return super.getIdPemain();
    }

    @Override
    public statistik getState() {
        return super.getState();
    }
    
    public String getPosisi() {
        return posisi;
    }

    public int getGol() {
        return gol;
    }

    public int getAssist() {
        return assist;
    }

    public int getMatch() {
        return match;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public void setGol(int gol) {
        this.gol = gol;
    }

    public void setAssist(int assist) {
        this.assist = assist;
    }

    public void setMatch(int match) {
        this.match = match;
    }

    @Override
    public void updatePemain(BufferedReader br, SimpleDateFormat formatter) throws IOException, ParseException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePemain'");
    }
}
