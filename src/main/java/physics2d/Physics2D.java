package physics2d;

import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.World;

public class Physics2D {
    private Vec2 gravity = new Vec2(0, -10.0f);
    private World world = new World(gravity);

    private float physicsTime = 0.0f;
    private float getPhysicsTimeStep = 1.0f / 60.0f;
    private int veloctiyInterations = 8;
    private int positionInterations = 3;

    public void update(float dt) {
        physicsTime += dt;
        if (physicsTime >= 0.0f) {
            physicsTime -= getPhysicsTimeStep;
            world.step(getPhysicsTimeStep, veloctiyInterations, positionInterations);
        }
    }
}
