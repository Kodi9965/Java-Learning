package training;

interface Iface{
    public int m1(int a,int b);
}

class Main{
    public static void main (String[] args) {
        Iface inface = (a,b)->a+b;
        System.out.println(inface.m1(5,6));
        
    }
}
