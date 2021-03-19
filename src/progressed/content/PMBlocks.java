package progressed.content;

import mindustry.content.*;
import mindustry.ctype.*;
import mindustry.gen.Sounds;
import mindustry.graphics.Pal;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.meta.*;
import progressed.world.blocks.defence.turret.*;
import progressed.world.blocks.distribution.*;
import progressed.world.blocks.power.*;

import static mindustry.type.ItemStack.*;
import static mindustry.Vars.*;

public class PMBlocks implements ContentList{
    public static Block
    //Miniguns
    minigun, miinigun, mivnigun,

    //Crit Snipers
    caliber,

    //Pixel Turrets
    bit,

    //Misc
    tinker,

    //Random distribution
    floatingConveyor,
    
    //Sandbox Power
    strobeNode, strobeInf, strobeBoost;

    @Override
    public void load(){
        minigun = new MinigunTurret("minigun"){{
            requirements(Category.turret, with(Items.copper, 200, Items.graphite, 175, Items.titanium, 100, Items.thorium, 80));
            size = 4;
            range = 255f;
            health = 1800;
            shootCone = 20f;
            shootSound = Sounds.shootBig;
            targetAir = targetGround = true;
            rotateSpeed = 4f;
            recoilAmount = 3f;
            restitution = 0.02f;
            cooldown = 0.11f;
            inaccuracy = 8f;
            shootEffect = smokeEffect = ammoUseEffect = Fx.none;
            heatColor = Pal.turretHeat;

            barX = 4f;
            barY = -10f;
            barStroke = 1f;
            barLength = 9f;

            shootLocs = new float[]{0f};
            windupSpeed = 0.000125f;
            windDownSpeed = 0.0125f;
            minFiringSpeed = 1f/6f;

            //Dummy stats to mess with the shots/sec stat
            reloadTime = 3f;
            shots = 1;

            ammo(Items.copper, PMBullets.standardCopperMini, Items.graphite, PMBullets.standardDenseMini, Items.silicon, PMBullets.standardHomingMini, Items.pyratite, PMBullets.standardIncendiaryMini, Items.thorium, PMBullets.standardThoriumMini, Items.blastCompound, PMBullets.standardExplosiveMini);
        }};

        miinigun = new MinigunTurret("miinigun"){{
            requirements(Category.turret, with(Items.copper, 350, Items.graphite, 300, Items.plastanium, 175, Items.thorium, 80, PMItems.techtanite, 80));
            size = 4;
            range = 255f;
            health = 1800;
            shootCone = 20f;
            shootSound = Sounds.shootBig;
            targetAir = targetGround = true;
            rotateSpeed = 4f;
            recoilAmount = 3f;
            restitution = 0.02f;
            cooldown = 0.11f;
            inaccuracy = 8f;
            shootEffect = smokeEffect = ammoUseEffect = Fx.none;
            heatColor = Pal.turretHeat;

            barX = 4f;
            barY = -10f;
            barStroke = 1f;
            barLength = 9f;

            shootLocs = new float[]{-4f, 4f};
            windupSpeed = 0.000125f/1.2f;
            windDownSpeed = 0.0125f;
            minFiringSpeed = 1f/6f;

            //Dummy stats to mess with the shots/sec stat
            reloadTime = 3f;
            shots = 2;

            ammo(Items.copper, PMBullets.standardCopperMini, Items.graphite, PMBullets.standardDenseMini, Items.silicon, PMBullets.standardHomingMini, Items.pyratite, PMBullets.standardIncendiaryMini, Items.thorium, PMBullets.standardThoriumMini, Items.blastCompound, PMBullets.standardExplosiveMini);
        }};

        mivnigun = new MinigunTurret("mivnigun"){{
            requirements(Category.turret, with(Items.copper, 650, Items.graphite, 600, Items.titanium, 120, Items.thorium, 160, Items.plastanium, 325, PMItems.techtanite, 240));
            size = 4;
            range = 255f;
            health = 1800;
            shootCone = 20f;
            shootSound = Sounds.shootBig;
            targetAir = targetGround = true;
            rotateSpeed = 4f;
            recoilAmount = 3f;
            restitution = 0.02f;
            cooldown = 0.11f;
            inaccuracy = 8f;
            shootEffect = smokeEffect = ammoUseEffect = Fx.none;
            heatColor = Pal.turretHeat;

            barX = 5f;
            barY = -10f;
            barStroke = 1f;
            barLength = 9f;

            shootLocs = new float[]{-9f, -3f, 3f, 9f};
            windupSpeed = 0.000125f/1.4f;
            windDownSpeed = 0.0125f;
            minFiringSpeed = 1f/6f;

            //Dummy stats to mess with the shots/sec stat
            reloadTime = 3f;
            shots = 1;

            ammo(Items.copper, PMBullets.standardCopperMini, Items.graphite, PMBullets.standardDenseMini, Items.silicon, PMBullets.standardHomingMini, Items.pyratite, PMBullets.standardIncendiaryMini, Items.thorium, PMBullets.standardThoriumMini, Items.blastCompound, PMBullets.standardExplosiveMini);
        }};

        caliber = new SniperTurret("caliber"){{
            requirements(Category.turret, BuildVisibility.sandboxOnly, empty);
            size = 3;
            reloadTime = 450f;
            inaccuracy = 0f;
            range = 544f;
            split = 3f;
            chargeTime = 300f;
            shootLength = 18f;
            shootSound = Sounds.railgun;
            ammo(Items.thorium, PMBullets.sniperBoltThorium);
        }};

        bit = new BitTurret("bit"){{
            requirements(Category.turret, with(Items.copper, 50, Items.lead, 60,  Items.silicon, 40, Items.titanium, 30));
            size = 2;
            reloadTime = 70f;
            recoilAmount = 4f;
            inaccuracy = 15f;
            range = 140f;
            powerUse = 1.35f;
            shootType = PMBullets.pixel;
        }};

        tinker = new LaunchTurret("tinker"){{
            requirements(Category.turret, with(Items.copper, 125, Items.lead, 75, Items.silicon, 30, Items.titanium, 50));
            size = 3;
            reloadTime = 60f * 10f;
            minRange = 5f * tilesize;
            range = 40 * tilesize;
            velocityInaccuracy = 0.2f;
            cooldown = 0.03f;
            recoilAmount = 6f;
            restitution = 0.02f;
            shootShake = 2f;
            shootLength = 16f;
            ammo(PMItems.basicSentryBox, PMBullets.basicSentryLaunch, PMItems.dashSentryBox, PMBullets.dashSentryLaunch);
        }};

        floatingConveyor = new FloatingConveyor("floating-conveyor"){{
            requirements(Category.distribution, with(Items.copper, 1, Items.metaglass, 2, Items.titanium, 1));
            health = 15;
            speed = 0.08f;
            displayedSpeed = 11f;
        }};

        strobeNode = new StrobeNode("rainbow-power-node");

        strobeInf = new StrobeSource("rainbow-power-source");

        strobeBoost = new StrobeSource("rainbow-power-boost"){{
            boost = true;
            speedBoost = 100f;
        }};
    }
}