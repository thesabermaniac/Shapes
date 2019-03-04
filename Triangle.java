import java.lang.*;

public class Triangle {
    char _c;
    int _length;
    public Triangle(char c, int length){
        this._c = c;
        this._length = length;
    }
    public String toString(){
        StringBuilder s = new StringBuilder();
        for (int i = 1; i <= _length; ++i){
            Line spaces = new Line(' ', _length - i);
            s.append(spaces);
            Line fill = new Line(_c, i);
            s.append(fill);
            s.append('\n');
        }
        return s.toString();
    }
}
