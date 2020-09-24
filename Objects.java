public class Objects {
	public static void main(String[] args) {

		Object o1 = new Object();
		Object o2 = o1;

		System.out.print(o1 == o2);
		System.out.print(";");
		System.out.print(o2.equals(o1));
	}
}
