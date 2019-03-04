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
    }
}
