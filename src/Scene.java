import java.util.ArrayList;
import java.util.List;

/**
 * each scene in the game will perform its logic in this class
 */

public abstract class Scene {

    private final List<GameObject> gameObjects;

    //==================================================================================================================

    public Scene() {
        this.gameObjects = new ArrayList<>();
    }

    //==================================================================================================================
}
