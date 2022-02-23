package com.company;

import java.io.File;

public class Postinfo {

    int postNummer;
    String byNavn;


    public Postinfo(int postNummer, String byNavn) {
        this.postNummer = postNummer;
        this.byNavn = byNavn;

    }

    public int getPostNummer() {
        return postNummer;
    }

    private void setPostNummer(int postNummer) {
        this.postNummer = postNummer;
    }

    public String getByNavn() {
        return byNavn;
    }

    private void setByNavn(String byNavn) {
        this.byNavn = byNavn;
    }

    @Override
    public String toString() {
        return "Postnummer = " + postNummer + "\n Bynavn: " + byNavn;
    }
}
