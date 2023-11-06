package Factory_Pattern;

interface IColor2{
	void fill();
}

class Red implements IColor2{
	public void fill() {
		System.out.println("Fill in Red Color");
	}
}

class Green implements IColor2{
	public void fill() {
		System.out.println("Fill in Green Color");
	}
}

class Blue implements IColor2{
	public void fill() {
		System.out.println("Fill in Blue Color");
	}
}

class ColorFactory{
	public static IColor2 getColor(String type) {
		if(type.equals("red")) {
			return new Red();
		}else if(type.equals("green")) {
			return new Green();
		}else {
			return new Blue();
		}
	}
}

public class SimpleFactory {
 public static void main(String[] args) {
	ColorFactory.getColor("red").fill();
	ColorFactory.getColor("green").fill();
	ColorFactory.getColor("blue").fill();
}
}
