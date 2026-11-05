public class Kino
{
    private String name = "UNKN";
    private int saele = 1;
    private boolean dreiD = false;
    private boolean imax = false;
    private int sitzplaetze = 200;

    public Kino(String name, int saele, boolean dreiD)
    {
        setName(name);
        setSaele(saele);
        setDreiD(dreiD);
        setImax(false);
        setSitzplaetze(200);
    }

    /*
     * Welche Konstruktoren koennen nicht implementiert werden?
     *
     * Java unterscheidet Konstruktoren nur an der Signatur:
     * Anzahl, Datentypen und Reihenfolge der Parameter.
     * Die Namen der Parameter spielen keine Rolle.
     *
     * Kino(neuName, neuImax, neuSaele)   ->  (String, boolean, int)
     * hat dieselbe Signatur wie
     * Kino(neuName, neuDreiD, neuSaele)  ->  (String, boolean, int)
     * und kann daher nicht implementiert werden.
     *
     * Kino(neuName, neuSaele, neuImax)   ->  (String, int, boolean)
     * hat dieselbe Signatur wie
     * Kino(neuName, neuSaele, neuDreiD)  ->  (String, int, boolean)
     * und kann daher nicht implementiert werden.
     */

    public Kino(String name, boolean dreiD, boolean imax, int saele, int sitzplaetze)
    {
        setName(name);
        setSaele(saele);
        setDreiD(dreiD);
        setImax(imax);
        setSitzplaetze(sitzplaetze);
    }

    public Kino(String name, boolean dreiD, int saele)
    {
        setName(name);
        setSaele(saele);
        setDreiD(dreiD);
        setImax(false);
        setSitzplaetze(200);
    }

    public Kino(String name, boolean dreiD)
    {
        setName(name);
        setSaele(1);
        setDreiD(dreiD);
        setImax(false);
        setSitzplaetze(200);
    }

    public Kino(String name)
    {
        setName(name);
        setSaele(1);
        setDreiD(false);
        setImax(false);
        setSitzplaetze(200);
    }

    public Kino()
    {
        setName("UNKN");
        setSaele(1);
        setDreiD(false);
        setImax(false);
        setSitzplaetze(200);
    }

    public Kino(String name, int saele)
    {
        setName(name);
        setSaele(saele);
        setDreiD(false);
        setImax(false);
        setSitzplaetze(200);
    }

    public String getName()
    {
        return name;
    }

    public int getSaele()
    {
        return saele;
    }

    public boolean getDreiD()
    {
        return dreiD;
    }

    public boolean getImax()
    {
        return imax;
    }

    public int getSitzplaetze()
    {
        return sitzplaetze;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSaele(int saele)
    {
        this.saele = saele;
    }

    public void setDreiD(boolean dreiD)
    {
        this.dreiD = dreiD;
    }

    public void setImax(boolean imax)
    {
        this.imax = imax;
    }

    public void setSitzplaetze(int sitzplaetze)
    {
        this.sitzplaetze = sitzplaetze;
    }

    public void printKino()
    {
        if (dreiD == true)
        {
            System.out.println("Kino: " + name + " - " + saele + " Säle - mit 3D");
        }
        else
        {
            System.out.println("Kino: " + name + " - " + saele + " Säle - ohne 3D");
        }
    }
}
