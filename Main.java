public class Main {
    public static void main(String[] args){
        Line line = new Line('@', 10);
        System.out.println(line.toString());
        System.out.println('\n');
        Rectangle rect = new Rectangle('@', '#', 15, 25);
        System.out.println(rect.toString());
        System.out.println('\n');
        Square sq = new Square('@', '#', 5);
        System.out.println(sq.toString());
        System.out.println('\n');
        Triangle tr = new Triangle('#', 10);
        System.out.println(tr.toString());
        System.out.println('\n');
        Hexagon hex = new Hexagon('@', 10);
        System.out.println(hex.toString());
        System.out.println('\n');
    }
}
