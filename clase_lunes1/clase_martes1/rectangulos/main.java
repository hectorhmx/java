class Main{
public static void main(String[] args) {
   double altura;
   double base;
   Rectangulo rectan = new Rectangulo();
   Rectangulo gran = new Rectangulo();
   rectan.setBase(5.0);
   rectan.setAltura(6.1);
   System.out.println("El area es: "+rectan.calcularArea(rectan.base,rectan.getAltura));
   System.out.println("El perimetro es: "+rectan.calcularPerimetro(rectan.base,rectan.getAltura));


   gran = rectan.agrandar(5);
   gran.altura= 5*rectan.getAltura();
   gran.base = 5* rectan.getAltura();
   System.out.println("Las dimensiones del nuevo rectangulo grande son:");
   System.out.println("Base:"+gran.getBase());
   System.out.println("Altura:"+gran.getAltura());
}
}
