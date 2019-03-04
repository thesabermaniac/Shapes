import java.lang.*;

public class Rectangle {
    char _b;
    char _f;
    int _length;
    int _height;
    final int BORDER = 1;
    public Rectangle (char b, char f, int length, int height){
        this._b = b;
        this._f = f;
        this._length = length;
        this._height = height;
    }
    public String toString(){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < _height; ++i){
            if (i <= BORDER - 1 || i >= (_height - BORDER)) {
                Line line = new Line(_b, _length);
                s.append(line);
                s.append('\n');
            }
            else{
                for (int j = 0; j < _length; ++j){
                    if (j <= (BORDER - 1) || j >= (_length - BORDER)){
                        s.append(_b);
                    }
                    else {
                        //Line line = new Line(_f, _length - 2);
                        s.append(_f);
                    }
                }
                s.append('\n');
            }
        }
        return s.toString();
    }
}
