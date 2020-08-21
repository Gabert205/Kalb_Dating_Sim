import java.util.ArrayList;
import java.util.List;

public class SceneManager {

    private final List<Scene> scenes;
    private Scene currentScene;
    private Scene lastScene;

    //==================================================================================================================

    public SceneManager() {
        this.scenes = new ArrayList<>();
    }

    //==================================================================================================================

    public Scene getCurrentScene() {
        return currentScene;
    }

    public void setCurrentScene(Scene currentScene) {
        this.lastScene = currentScene;
        this.currentScene = currentScene;
    }

    public Scene getLastScene() {
        return lastScene;
    }
}
