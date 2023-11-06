package Factory_Pattern;

interface IColor{
	void fill();
}

class LightRed implements IColor{
	public void fill() {
		System.out.println("Fill in LightRed Color");
	}
}

class LightGreen implements IColor{
	public void fill() {
		System.out.println("Fill in LightGreen Color");
	}
}

class LightBlue implements IColor{
	public void fill() {
		System.out.println("Fill in LightBlue Color");
	}
}

class DarkRed implements IColor{
	public void fill() {
		System.out.println("Fill in DarkRed Color");
	}
}

class DarkGreen implements IColor{
	public void fill() {
		System.out.println("Fill in DarkGreen Color");
	}
}

class DarkBlue implements IColor{
	public void fill() {
		System.out.println("Fill in DarkBlue Color");
	}
}


abstract class ColorSelection{
	public abstract IColor getColor(String type);
}

class LightColorFactory extends ColorSelection{
	public IColor getColor(String type) {
		if(type.equals("red")) {
			return new LightRed();
			
		}else if(type.equals("green")) {
			return new LightGreen();
			
		}else {
			return new LightBlue();
		}
	}
}

class DarkColorFactory extends ColorSelection{
	
	public IColor getColor(String type) {
		
		if(type.equals("red")) {
			return new DarkRed();
			
		}else if(type.equals("green")) {
			return new DarkGreen();
			
		}else {
			return new DarkBlue();
		}
	}
}

public class FactoryMethod {
 public static void main(String[] args) {
	 ColorSelection lightColor = new LightColorFactory();
	 lightColor.getColor("red").fill();
	 
	 ColorSelection darkColor = new DarkColorFactory();
	 darkColor.getColor("red").fill();
}
}

