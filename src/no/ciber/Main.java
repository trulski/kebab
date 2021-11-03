package no.ciber;

public class Main {

    public static void main(String[] args) {
        KebabSjappe Shawarma = new KebabSjappe("Shawarma house", 59.912496, 10.758949);
        KebabSjappe Istanbul = new KebabSjappe("Ekte Instanbul Kebab",59.919192, 10.764363);
        KebabSjappe IstanbulGron = new KebabSjappe("Istanbul Kebab avd Grønland", 59.912969, 10.761187);
        KebabSjappe Beirut = new KebabSjappe("Beirut Kebab", 59.912533, 10.761246);
        KebabSjappe Dronningens = new KebabSjappe("Dronningens Kebab", 59.912381, 10.748229);
        KebabSjappe Kompaniet = new KebabSjappe("Kebab Kompaniet", 59.916493, 10.752360);

        System.out.println(Shawarma.getName() + " er "+ Shawarma.getAvstandFraKontor() + " meter fra kontoret");
        System.out.println(Istanbul.getName() + " er "+ Istanbul.getAvstandFraKontor() + " meter fra kontoret");
        System.out.println(IstanbulGron.getName() + " er "+ IstanbulGron.getAvstandFraKontor() + " meter fra kontoret");
        System.out.println(Beirut.getName() + " er "+ Beirut.getAvstandFraKontor() + " meter fra kontoret");
        System.out.println(Dronningens.getName() + " er "+ Dronningens.getAvstandFraKontor() + " meter fra kontoret");
        System.out.println(Kompaniet.getName() + " er "+ Kompaniet.getAvstandFraKontor() + " meter fra kontoret");
    }
}
