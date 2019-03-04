import java.lang.*;

public class Square {
    char _b;
    char _f;
    int _length;
    public Square(char b, char f, int length){
        this._b = b;
        this._f = f;
        this._length = length;
    }
    public String toString(){
        StringBuilder s = new StringBuilder();
        Rectangle rect = new Rectangle(_b, _f, _length, _length);
        s.append(rect);
        return s.toString();
    }
}
