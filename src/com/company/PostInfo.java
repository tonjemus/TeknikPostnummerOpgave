package com.company;

public class PostInfo {
    private int postnummer;
    private String byNavn;

    public PostInfo(int postnummer, String byNavn) {
        this.postnummer = postnummer;
        this.byNavn = byNavn;
    }

    public int getPostnummer() {
        return postnummer;
    }

    public void setPostnummer(int postnummer) {
        this.postnummer = postnummer;
    }

    public String getByNavn() {
        return byNavn;
    }

    public void setByNavn(String byNavn) {
        this.byNavn = byNavn;
    }

}
