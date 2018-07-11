package ciagi;

public class Odwrotnosc extends Fib {

    public Odwrotnosc(int numer) {
        super(numer);
    }

    private double sum()
    {
        double suma=0;

        double[] tab1=new double[numer+1];
        for(double i=1; i<=numer;i++)
        {
            tab1[(int) i]=1/(i*i);
            suma+=1/(i*i);
        }
        return suma;
    }

    public void ciag()
    {
        System.out.println("Wyraz " + numer + " ciagu 1/n^2 wynosi 1/"+numer*numer);
    }

    public void suma()
    {
        System.out.println("Suma pierwszych " + numer + " wyrazow ciagu 1/n^2 wynosi " + sum());
    }
}
