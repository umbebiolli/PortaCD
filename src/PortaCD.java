public class PortaCD {
    private CD dischi[];
    private int max_num_cd;

    public PortaCD() {
        this.max_num_cd = 5;
        this.dischi = new CD[max_num_cd];
    }

    public PortaCD(int n) {
        max_num_cd = n;
        dischi = new CD[n];
    }

    public PortaCD(PortaCD p) {
        dischi = new CD[max_num_cd];
        for (int i = 0; i < dischi.length; i++) {
            if (p.getCD(i) != null) {
                dischi[i] = new CD(p.getCD(i));
            }
        }
    }

    public CD getCD(int posizione) {
        if (posizione < 0 || posizione >= max_num_cd) {
            return null;
        } else {
            return dischi[posizione];
        }
    }

    public int setCD(CD cd, int posizione) {
        if (posizione < 0 || posizione >= max_num_cd) {
            return -1;
        } else if (dischi[posizione] != null) {
            return -2;
        } else {
            dischi[posizione] = cd;
            return posizione;
        }
    }

    public int killCD(int posizione) {
        if (posizione < 0 || posizione >= max_num_cd) {
            return -1;
        } else if (dischi[posizione] == null) {
            return -2;
        } else {
            dischi[posizione] = null;
            return posizione;
        }
    }

    // ca
    public int getNumMaxDischi() {
        return max_num_cd;
    }

    public int getN() {
        int conta = 0;
        for (int i = 0; i < dischi.length; i++) {
            if (dischi[i] != null) {
                conta++;
            }
        }
        return conta;
    }

    public int cercaCDPerTitolo(String titolo) {
        int r = -1;
        for (int i = 0; i < dischi.length; i++) {
            if (dischi[i] != null) {
                if (dischi[i].getTitolo().equals(titolo)) {
                    r = i;
                }
            }
        }
        return r;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < dischi.length; i++) {
            s += "Il porta CD in posizione " + i + " contiene " + "\n" + dischi[i] + "\n";
        }
        return s;
    }

    public int confrontaCollezione(PortaCD p) {
        int r = 0;
        for (int i = 0; i < dischi.length; i++) {
            for (int j = 0; j < dischi.length; j++) {
                if (dischi[i] != null && p.dischi[j] != null && dischi[i].equals(p.dischi[j])) {
                    r++;
                }
            }

        }
        return r;
    }

}
