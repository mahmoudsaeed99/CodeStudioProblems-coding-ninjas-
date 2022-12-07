public class test {

    public static abstract class Shape{
        String hello(){
            return "hello";
        }
        double area(){
            return 0.0;
        }
    }
    public static class Rectangle extends Shape{
        private int x ;
        private int y ;
        Rectangle(int x , int y){
             this.x = x;
             this.y = y;
        }

        @Override
        double area() {
            return this.x * this.y ;
        }
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(2,3);
        System.out.println(r.area());
        System.out.println(r.hello());
    }
}
