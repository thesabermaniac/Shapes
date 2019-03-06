import java.lang.*;

public class Hexagon {
    char _c;
    int _length;
    public Hexagon(char c, int length){
        this._c = c;
        this._length = length;
    }
    public String toString(){
        StringBuilder s = new StringBuilder();
        int counter = 1;
        for (int i = 1; i <= _length; ++i) {
            Line spaces = new Line(' ', _length - i);
            s.append(spaces);
            Line fill = new Line(_c, (i + _length) * 2);
            s.append(fill);
            s.append('\n');
        }
        for (int j = (_length - 1); j > 0; --j){
            Line spacesBottom = new Line(' ', counter);
            s.append(spacesBottom);
            Line fillBottom = new Line(_c, (j + _length) * 2);
            s.append(fillBottom);
            s.append('\n');
            counter += 1;
        }
        return s.toString();
    }
}
