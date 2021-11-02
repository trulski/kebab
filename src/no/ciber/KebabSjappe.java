package no.ciber;

import java.util.HashMap;

public class KebabSjappe {
    private String name;
    private Double latitude;
    private Double longitude;
    private Double avstandFraKontor;

    public KebabSjappe(String name, Double latitude, Double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.avstandFraKontor = rekneAvstandFraKontor();
    }

    private Double rekneAvstandFraKontor(){
        Double avstand;
        Double kontorLat = 59.916783; // Kontor deg North
        Double kontorLon = 10.762599; // Kontor deg East

        Double kebabLat = latitude; // Kebab deg North
        Double kebabLon = longitude; // Kebab deg East

        Double kmLat = 110.54; // 1 deg lat in km
        Double kmLon = 111.32*Math.cos(kontorLat); // 1 deg lon in km

        kebabLat = kebabLat*kmLat*1000; // In metres
        kebabLon = kebabLon*kmLon*1000; // In metres
        kontorLat = kontorLat*kmLat*1000; // In metres
        kontorLon = kontorLon*kmLon*1000; // In metres

        return avstand = Math.sqrt((Math.pow((kontorLat - kebabLat),2)) + (Math.pow((kontorLon - kebabLon),2)));
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAvstandFraKontor() {
        return avstandFraKontor;
    }
}
