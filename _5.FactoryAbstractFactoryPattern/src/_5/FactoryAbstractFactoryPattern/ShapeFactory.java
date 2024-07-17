package _5.FactoryAbstractFactoryPattern;

public class ShapeFactory {
	public Shape getShape(String type) {
		switch(type){
			case "Circle":
				return new Circle();
			case "Square":
				return new Square();
			default:
				return null;
		}
	}
}
