package abstractclass;

public class Exec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractDemo d;
		d=new Square(0.2f);
		d.calculate();
		d.display();
		d=new Circle(0.1f);
		d.calculate();
		d.display();
	}

}
