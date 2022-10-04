public class Area {

	double length;
	double width;

	void area()
	{
		double area;
		area = this.length * this.width;
		System.out.println("Площадь прямоугольника = " + area);
	}

	}

class Use_Area {
	
	public static void main(String args[])
	{

		Area rect = new Area();
		rect.length = 15.854;
		rect.width = 22.65;

		System.out.println("Длина = " + rect.length);
		System.out.println("Ширина = " + rect.width);

		rect.area();

	}
}
