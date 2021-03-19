package progressed.ai;

import mindustry.entities.*;
import mindustry.entities.units.*;

public class SentryAI extends AIController{
    @Override
    protected void updateMovement(){
        if(!Units.invalidateTarget(target, unit, unit.range()) && unit.type.rotateShooting && unit.type.hasWeapons()){
            unit.lookAt(Predict.intercept(unit, target, unit.type.weapons.first().bullet.speed));
        }
    }

    @Override
    protected boolean retarget(){
        return timer.get(timerTarget, target == null ? 10f : 20f);
    }
}
