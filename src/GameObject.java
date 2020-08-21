public class GameObject {

    private final Vector2 position;

    // Suggestion to add to gameObject: image address, (optional) name (so that its easier to search for),
    //               (optional) xScale (if we wanted to change the image to fit screen better), (optional) yScale (same as xScale),
    //               (optional) velX (if we wanted to have a set speed for any movement), (optional) velY (same as yVel).
    // Just based off of what I had in my LLRPG

    //==================================================================================================================

    public GameObject() {
        this.position = new Vector2();
    }

    public GameObject(double x, double y) {
        this.position = new Vector2(x, y);
    }

    //==================================================================================================================
}
