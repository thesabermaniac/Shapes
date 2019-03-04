import java.lang.*;

public class Rectangle {
    // This initializes the variables for the border and fill characters as well as the length and width of the rectangle
    char _b;
    char _f;
    int _length;
    int _height;
    final int BORDER = 1;
    // The next class creates the rectangle object, initializing the specs to the arguments it's passed
    public Rectangle (char b, char f, int length, int height){
        this._b = b;
        this._f = f;
        this._length = length;
        this._height = height;
    }
    // This class uses the StringBuilder class to create the rectangle using the specs that were sent into the constructor
    public String toString(){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < _height; ++i){
            // This sets the upper and lower borders of the rectangle
            if (i <= BORDER - 1 || i >= (_height - BORDER)) {
                Line line = new Line(_b, _length);
                s.append(line);
                s.append('\n');
            }
            // This sets the inner lines of the rectangle
            else{
                for (int j = 0; j < _length; ++j){
                    // This block adds the border characters on the borders
                    if (j <= (BORDER - 1) || j >= (_length - BORDER)){
                        s.append(_b);
                    }
                    // This adds the fill characters in the middle of the rectangle
                    else {
                        s.append(_f);
                    }
                }
                s.append('\n');
            }
        }
        return s.toString();
    }
}
