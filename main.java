public static void main(String[] args) {
    triangulo t1 = new triangulo();
    t1.base = 5;
    t1.altura = 10;
    t1.lado1 = 3;
    t1.lado2 = 4;
    t1.lado3 = 5;
    t1.calcularArea();
    t1.calcularPerimetro();
    t1.calcularAngulos();
    // mostrar los resultados
    System.out.println("Area: " + t1.area);
    System.out.println("Perimetro: " + t1.perimetro);
    System.out.println("Angulos: " + t1.calcularAngulos());

}