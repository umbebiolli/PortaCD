public class App {
    public static void main(String[] args) throws Exception {
        CD cd1 = new CD("Paradiso", "Tedua", 13, 200);
        CD cd2 = new CD("Inferno", "Tedua", 10, 170);
        CD cd3 = new CD("Sirio", "Lazza", 15, 210);
        CD cd4 = new CD("Ferite", "Capo Plaza", 7, 90);
        CD cd5 = new CD(cd4);

        System.out.println(cd1);
        System.out.println(cd1.compareDurata(cd3));
        
        PortaCD dischi = new PortaCD(5);
        dischi.setCD(cd1, 0);
        dischi.setCD(cd2, 1);
        dischi.setCD(cd3, 2);
        System.out.println(dischi.getCD(1));
        System.out.println(dischi);

        dischi.killCD(1);
        System.out.println(dischi);
        System.out.println(dischi.getN());
        System.out.println(dischi.cercaCDPerTitolo("Sirio"));

        PortaCD dischi1 = new PortaCD(5);
        dischi1.setCD(cd4, 0);
        dischi1.setCD(cd5, 1);
        dischi1.setCD(cd3, 2);
        System.out.println(dischi1.confrontaCollezione(dischi));

    }
}
