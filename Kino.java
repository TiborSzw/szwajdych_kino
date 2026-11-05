public class Kino
{
    private String name = "UNKN";
    private int saele = 1;
    private boolean dreiD = false;
    private boolean imax = false;
    private int sitzplaetze = 200;

    public Kino(String neuName, int neuSaele, boolean neuDreiD)
    {
        setName(neuName);
        setSaele(neuSaele);
        setDreiD(neuDreiD);
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

    public void setName(String neuName)
    {
        name = neuName;
    }

    public void setSaele(int neuSaele)
    {
        saele = neuSaele;
    }

    public void setDreiD(boolean neuDreiD)
    {
        dreiD = neuDreiD;
    }

    public void setImax(boolean neuImax)
    {
        imax = neuImax;
    }

    public void setSitzplaetze(int neuSitzplaetze)
    {
        sitzplaetze = neuSitzplaetze;
    }

    public void printKino()
    {
        System.out.println(name + " Kino: " + saele + " Saele - " + dreiD);
    }
}
