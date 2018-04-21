public class Triangulo{
  final double base;
  final double lado1;
  final double lado2;
  final double altura;


  Triangulo(double base,double altura,double lado1,double lado2){
   if(base == 0 || altura == 0 ||lado1==0||lado2==0){
     System.out.println("Valor equivocado prro");
    }else{
    this.base = Math.abs(base);
      this.altura = Math.abs(altura);
      this.lado1 = Math.abs(lado1);
      this.lado2=Math.abs(lado2);
    }}


  public double calAr(){
    return (base*altura/2);
  }
  public double calPer(){
    return (base+lado1+lado2);
  }
}
