import java.util.ArrayList;
import java.util.List;

/**
 * each scene in the game will perform its logic in this class
 */

public abstract class Scene {

    private final String NAME;

    private final List<GameObject> gameObjects;

    //==================================================================================================================

    public Scene(String sceneName) {
        this.NAME = sceneName;
        this.gameObjects = new ArrayList<>();

    }

    //==================================================================================================================

    public abstract void update();

    public abstract void draw();
}
