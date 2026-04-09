public class triangulo {

    // atributos
    private int id;
    public int numLados;
    public int numVertices;
    public String color;
    public double area;
    public double perimetro;
    public String tipo;
    public double base;
    public double altura;
    public double lado1;
    public double lado2;
    public double lado3;

    // metodos
    public void calcularArea() {
        area = base * altura / 2;

    }

    public void calcularPerimetro() {
        perimetro = lado1 + lado2 + lado3;

    }

    public double calcularAngulos() {
        // codigo para calcular los angulos

        double angulo1 = Math.acos((lado2 * lado2 + lado3 * lado3 - lado1 * lado1) / (2 * lado2 * lado3));
        double angulo2 = Math.acos((lado1 * lado1 + lado3 * lado3 - lado2 * lado2) / (2 * lado1 * lado3));
        double angulo3 = Math.acos((lado1 * lado1 + lado2 * lado2 - lado3 * lado3) / (2 * lado1 * lado2));
        return angulo1 + angulo2 + angulo3;
    }

}