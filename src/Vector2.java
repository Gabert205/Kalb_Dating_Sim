public class Vector2 {

    private double x;

    private double y;

    //==================================================================================================================
    //CONSTRUCTORS
    //==================================================================================================================

    public Vector2() {
        this.x = 0;
        this.y = 0;
    }

    public Vector2(double x) {
        this.x = x;
        this.y = 0;
    }

    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //==================================================================================================================
    //GETS, SETS, & ADDS
    //==================================================================================================================

    //region GETS, SETS, & ADDS

    public static Vector2 identity() {
        return new Vector2(1, 1);
    }

    public static Vector2 radianToVector(double radian) {
        return new Vector2(Math.cos(radian), Math.sin(radian));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void addX(double deltaX) {
        this.x += deltaX;
    }

    public double getY() {
        return y;
    }


    //endregion

    //==================================================================================================================
    //STATIC METHODS
    //==================================================================================================================

    public void setY(double y) {
        this.y = y;
    }

    public void addY(double deltaY) {
        this.y += deltaY;
    }

    //==================================================================================================================
    //PRIVATE METHODS
    //==================================================================================================================


    //==================================================================================================================
    //PUBLIC METHODS
    //==================================================================================================================

    public double getMagnitude() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public Vector2 getUnitVector() {
        double magnitude = getMagnitude();
        return new Vector2(x / magnitude, y / magnitude);
    }

    public double getRadian() {
        return Math.atan2(y, x);
    }

    public Vector2 getDifferenceVector(Vector2 other) {
        return new Vector2(
                other.getX() - x,
                other.getY() - y
        );
    }

    public Vector2 getInverse() {
        return new Vector2(
                -x,
                -y
        );
    }

    public Vector2 update(Vector2 other) {
        this.x += other.getX();
        this.y += other.getY();

        return this;
    }

    public Vector2 scale(double scalar) {
        Vector2 out = new Vector2(x, y);

        out.x *= scalar;
        out.y *= scalar;

        return out;
    }

    //==================================================================================================================
    //
    //==================================================================================================================

    public String toString() {
        return this.x + " - " + this.y;
    }
}

