interface Icon{  //AbstractProductA
	public void draw();
	public void fill();
}

class Circle implements Icon{  // ProductA1
	public void draw(){ System.out.print("( )"); }
	public void fill(){ System.out.print("(•)"); }
}

class Box implements Icon{     // ProductA2
	public void draw(){ System.out.print("[ ]"); }
	public void fill(){ System.out.print("[x]"); }
}

interface Text{  //AbstractProductB
	public void tell();
	public void shout();
}

class Japanese implements Text{  // ProductB1
	public void tell(){ System.out.println("Youkoso. Konnichiwa! Hajimemashite"); }
	public void shout(){ System.out.println("Shizukanishite kudasai"); }
}

class English implements Text{  // ProductB2
	public void tell(){ System.out.println("Welcome. Nice to meet you"); }
	public void shout(){ System.out.println("Be quiet please!"); }
}

interface Creator{  //AbstractFactory
	public Icon getIcon();
	public Text getText();
}

class Creator1 implements Creator{  //ConcreteFactory1
	public Icon getIcon(){ return new Circle(); }
	public Text getText(){ return new Japanese(); }
}

class Creator2 implements Creator{  //ConcreteFactory2
	public Icon getIcon() { return new Box(); }
	public Text getText() { return new English(); }
}

class Main{
    public static void main(String [] args){
		Creator c = new Creator1();
		c = new Creator2();
		
		Icon ic = c.getIcon();
		Text t = c.getText();

		ic.draw();
		t.tell();
		t.shout();
    }
}