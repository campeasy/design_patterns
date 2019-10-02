class Singleton{
    private static Singleton s = new Singleton(47);
    // the only one instance of the class is referred by 's'
    
    private int i;
    private Singleton(int x){
        i = x;
    }

    public static Singleton Instance(){
        return s;
    }
    public int getValue(){
        return i;
    }
    public void setValue(int x){
        i = x;
    }
}

class Main{
    public static void main(String [] args){
        Singleton s1 = Singleton.Instance();
        System.out.println("S1 contains: "+s1.getValue());

        Singleton s2 = Singleton.Instance();
        s2.setValue(17);

        System.out.println("S1 contains: "+s1.getValue());
    }
}