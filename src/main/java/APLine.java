public class APLine {
  private int a,b,c;
  public APLine(int _a, int _b, int _c) {
    a = _a; b = _b; c = _c;
  }
  public double getSlope() {
    return -(double)a/b;
  }
  public boolean isOnLine(int x, int y) {
    return (a*x + b*y + c)==0;
  }
}
