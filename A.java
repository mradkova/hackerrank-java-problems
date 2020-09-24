
class A {
   String val = "A";
   public String value() {
      return val;
   }
}
class B extends A {
   String val = "B";
   public String value() {
      return val;
   }
   
   
   public static void main(String[] args) {
	   A b = new B();
	   System.out.print(b.val);
	   System.out.print(b.value());
   }
}

