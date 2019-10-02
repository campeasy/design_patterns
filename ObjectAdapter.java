interface ILabel{  //Target
	public String getNextLabel();
}

class LabelServer{ //Adaptee
	private int nextLabelNum = 1;
	private String labelPrefix;
	
	public LabelServer(String prefix){
		labelPrefix = prefix;
	}
	public String serveNextLabel(){
		return labelPrefix + nextLabelNum++;
	}
}

class Label implements ILabel{  // Object Adapter 
	private LabelServer theService;
	public Label(String prefix){
		theService = new LabelServer(prefix);
	}
	
	public String getNextLabel(){ 
		return theService.serveNextLabel();
	}
}

class Main{
    public static void main(String [] args){
		System.out.println("Object Adapter:");
		ILabel s = new Label("LAB");
		String l = s.getNextLabel();
		
		if(l.equals("LAB1")) System.out.println("Test Passed");
		else System.out.println("Test Failed");
    }
}