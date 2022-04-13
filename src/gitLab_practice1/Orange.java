package gitLab_practice1;


public class Orange {
	String color;
	Orange(String color)
	{
		this.color=color;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orange greenapple = new Orange("Green");
		String color = greenapple.getColor();
		System.out.println("Color of apple is:" +color);

	}

}