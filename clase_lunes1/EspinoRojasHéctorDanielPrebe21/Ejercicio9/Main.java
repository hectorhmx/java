class Main{
  public static void main(String[] args) {
    Animal[]animales = new Animal[10];
    animales[0]=new Dog();
    animales[1]=new Cat();
    animales[2]=new Bird();
    animales[3]=new Mouse();
    animales[4]=new Cow();
    animales[5]=new Frog();
    animales[6]=new Elephant();
    animales[7]=new Duck();
    animales[8]=new Fish();
    animales[9]=new Seal();
    for(int i =0;i<10;i++)
    {
      if(((i+1)%4) == 0)
        System.out.print("And ");
      sing(animales[i]);
    }
    System.out.println("====================");
    sing(new Fox());
    System.out.println("====================");
}
  public static void sing(Interface a){
    System.out.println(a.cantar());
  }
}
