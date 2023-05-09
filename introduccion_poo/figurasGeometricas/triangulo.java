package figurasGeometricas;

public class triangulo extends figurasGeometricas {
  private double  ladoA, ladoB, ladoC, base, altura;

  public triangulo() {

  }

  public triangulo(double area, double perimetro, double ladoA, double ladoB, double ladoC, double base,
      double altura) {

    this.ladoA = ladoA;
    this.ladoB = ladoB;
    this.ladoC = ladoC;
    this.base = base;
    this.altura = altura;
  }

 

  public double getLadoA() {
    return ladoA;
  }

  public void setLadoA(double ladoA) {
    this.ladoA = ladoA;
  }

  public double getLadoB() {
    return ladoB;
  }

  public void setLadoB(double ladoB) {
    this.ladoB = ladoB;
  }

  public double getLadoC() {
    return ladoC;
  }

  public void setLadoC(double ladoC) {
    this.ladoC = ladoC;
  }

  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }


@Override
  public double calcularPerimetro() {
    double perimetro = ladoC + ladoB + ladoC;
    System.out.println("El perimetro es:");
    return perimetro;
  }
@Override
  public double calcularArea() {
    double area = ((base * altura) / 2);
    System.out.println("El area es: ");
    return area;
  }

}