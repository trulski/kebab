package no.ciber;

import java.util.HashMap;

public class KebabSjappe {
    private String name;
    private Double latitude;
    private Double longitude;
    private Long avstandFraKontor;

    public KebabSjappe(String name, Double latitude, Double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.avstandFraKontor = rekneAvstandFraKontor();
    }

    private Long rekneAvstandFraKontor(){
        double avstand;
        double kontorLat = 59.916783; // Kontor deg North
        double kontorLon = 10.762599; // Kontor deg East

        double kebabLat = latitude; // Kebab deg North
        double kebabLon = longitude; // Kebab deg East

        double kmLat = 110.54; // 1 deg lat in km
        double kmLon = 111.32*Math.cos(kontorLat); // 1 deg lon in km

        kebabLat = kebabLat*kmLat*1000; // In metres
        kebabLon = kebabLon*kmLon*1000; // In metres
        kontorLat = kontorLat*kmLat*1000; // In metres
        kontorLon = kontorLon*kmLon*1000; // In metres

        avstand = Math.sqrt((Math.pow((kontorLat - kebabLat),2)) + (Math.pow((kontorLon - kebabLon),2)));

        return Math.round(avstand);
    }

    public String getName() {
        return name;
    }

    public Long getAvstandFraKontor() {
        return avstandFraKontor;
    }
}
