public class GameObject {

    private final Vector2 position;

    //==================================================================================================================

    public GameObject() {
        this.position = new Vector2();
    }

    public GameObject(double x, double y) {
        this.position = new Vector2(x, y);
    }

    //==================================================================================================================
}
