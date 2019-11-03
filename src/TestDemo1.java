class Point<T>{
    private T X;
    private T Y;

    public T getX() {
        return X;
    }

    public T getY() {
        return Y;
    }

    public Point(T X, T Y){
        this.X=X;
        this.Y=Y;

    }

    public void fun(Point d1) {
        System.out.println(d1);
    }
    public String toString(){
        return this.X.toString();
    }
}

public class TestDemo1 {
    public static void main(String[] args) {
        Point<Integer>  d1 = new Point<Integer>(1,2);
        Point<String >  d2 = new Point<String>("舒服","速度");
        System.out.println(d1.getX() +" " +  d1.getY() );
        System.out.println(d2.getX() + d2.getY());
        d1.fun(d1);
    }

}
