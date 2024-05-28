interface I1{
    int m1(int a,int b);
    int m2(int a,int b,int c);
}
class A implements I1{
    public int m1(int a,int b){
        return a*b;
    }
    public int m2(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String args[]){
        A obj=new A();
        System.out.println(obj.m1(10,20));
        System.out.println(obj.m2(10,20,30));
    }
}