import processing.core.PImage;

import java.util.*;

/**
 * An this that exists in the world. See EntityKind for the
 * different kinds of entities that exist.
 */
public final class Obstacle extends Entity {

    public Obstacle(String id, Point position, List<PImage> images, int resourceLimit, int resourceCount, double actionPeriod, double animationPeriod, int health, int healthLimit) {
        super(id, position, images, resourceLimit, resourceCount, actionPeriod, animationPeriod, health, healthLimit);
    }

    public static Obstacle createObstacle(String id, Point position, double animationPeriod, List<PImage> images) {
        return new Obstacle(id, position, images, 0, 0, 0, animationPeriod, 0, 0);
    }

    public void scheduleActions(Entity entity, EventScheduler eventScheduler) {
        eventScheduler.scheduleEvent(entity, Animation.createAnimationAction(entity, 0), entity.getAnimationPeriod());
    }
}
