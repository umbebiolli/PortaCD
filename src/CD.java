public class CD {
    private String titolo;
    private String autore;
    private int numeroBrani;
    private int durata;

    public CD() {

    }
    // molto utile
    public CD(String titolo, String autore, int numeroBrani, int durata) {
        this.titolo = titolo;
        this.autore = autore;
        this.numeroBrani = numeroBrani;
        this.durata = durata;
    }

    public CD(CD cd) {
        this.numeroBrani = cd.numeroBrani;
        this.titolo = cd.titolo;
        this.autore = cd.autore;
        this.durata = cd.durata;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getNumeroBrani() {
        return numeroBrani;
    }

    public void setNumeroBrani(int numeroBrani) {
        this.numeroBrani = numeroBrani;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public String toString() {
        return "Titolo: " + titolo + "\n" + "Autore: " + autore + "\n" + "Numero Brani: " + numeroBrani + "\n" + "Durata: " + durata;
    }

    /* public int compareDurata(CD cd) {
        int r;
        if (cd.getDurata() == durata) {
            r = 0;
        } else if (durata > cd.getDurata()) {
            r = 1;
        } else {
            r = -1;
        }
        return r;
    } */

    public int compareDurata(CD cd) {
        return this.getDurata() - cd.getDurata();
    }

    public boolean equals(CD cd) {
        boolean r = false;
        if (this.titolo.equals(cd.getTitolo())) {
            if (this.autore.equals(cd.getAutore())) {
                if (this.durata == cd.getDurata()) {
                    if (this.numeroBrani == cd.getNumeroBrani()) {
                        r = true;
                    }     
                }
            }
        }
        return r;
    }
}
