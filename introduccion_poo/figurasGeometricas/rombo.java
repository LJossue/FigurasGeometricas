package figurasgeometricas;
import java.util.*;
public class rombo extends figurasgeometricas{
    Scanner read = new Scanner(System.in);
    private double ladoA;
    private double dMayor;
        private double dMenor;
        private double perimetro;
        private double area;





    public rombo() {

    }
    public rombo(double ladoA, double dMayor, double dMenor, double perimetro, double area) {
        this.ladoA = ladoA;
        this.dMayor = dMayor;
        this.dMenor = dMenor;
        this.perimetro = perimetro;
        this.area = area;
    }



    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getdMayor() {
        return dMayor;
    }

    public void setdMayor(double dMayor) {
        this.dMayor = dMayor;
    }

    public double getdMenor() {
        return dMenor;
    }

    public void setdMenor(double dMenor) {
        this.dMenor = dMenor;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
@Override
    public double calcularPerimetro() {
        double perimetro = ladoA + ladoA + ladoA + ladoA;
        System.out.println("El perimetro es:");
        return perimetro;
    }
@Override
    public double calcularArea() {
        setArea (((getdMayor() * getdMenor())/2));
        System.out.println("El area es: ");
        return getArea();
    }
}
