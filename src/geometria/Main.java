package geometria;

public class Main {

  public static void main (String[] args)
  {
      Punkt punkt=new Punkt("A", 0, 0);
      Punkt punkt1=new Punkt(  "B",0, 0 );
      Punkt punkt2=new Punkt("C",0, 0);
      Pole pole=new Pole();
      pole.pole(punkt,punkt1,punkt2);
      Kolo kolko=new Kolo("a", 0,0,1);
  }
}
