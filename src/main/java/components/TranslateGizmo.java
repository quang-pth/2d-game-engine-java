package components;

import editor.PropertiesWindow;
import jade.MouseListener;

public class TranslateGizmo extends Gizmo {
    public TranslateGizmo(Sprite arrowSprite, PropertiesWindow propertiesWindow) {
        super(arrowSprite, propertiesWindow);
    }

    @Override
    public void update(float dt) {
        if (activeGameObject != null) {
            if (xAxisActive && !yAxisActive) {
                activeGameObject.transform.position.x -= MouseListener.getWorldDx();
            } else if (yAxisActive) {
                activeGameObject.transform.position.y -= MouseListener.getWorldDY();
            }
        }

        super.update(dt);
    }
}
