package com.scorpio4938.fantasia.entity.custom;

import com.scorpio4938.fantasia.entity.ModEntities;
import com.scorpio4938.fantasia.entity.ai.PestilenceZombieAttackGoal;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class PestilenceZombieEntity extends AnimalEntity {
    private static final TrackedData<Boolean> ATTACKING =
            DataTracker.registerData(PestilenceZombieEntity.class, TrackedDataHandlerRegistry.BOOLEAN);

    public final AnimationState idleAnimationState = new AnimationState();

    private int idleAnimationTimeOut = 0;

    public final AnimationState attackAnimationState = new AnimationState();

    public int attackAnimationTimeOut = 0;

    private void setUpAnimationState() {
        if (this.idleAnimationTimeOut <= 0) {
            this.idleAnimationTimeOut = this.random.nextInt(40) + 80;
            this.idleAnimationState.start(this.age);
        } else {
            --this.idleAnimationTimeOut;
        }
        if (this.isAttacking() && this.attackAnimationTimeOut <= 0) {
            attackAnimationTimeOut = 20;
            attackAnimationState.start(this.age);
        } else {
            --this.attackAnimationTimeOut;
        }
        if (!this.isAttacking()) {
            attackAnimationState.stop();
        }
    }

    public PestilenceZombieEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public void tick() {
        super.tick();
        if (this.getWorld().isClient) {
            setUpAnimationState();
        }
    }

    @Override
    protected void updateLimbs(float posDelta) {
        float f = this.getPose() == EntityPose.STANDING ? Math.min(posDelta * 6.0f, 1.0f) : 0.0f;
        this.limbAnimator.updateLimbs(f, 0.2f);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
//        this.goalSelector.add(1, new AnimalMateGoal(this, 1.0D));
//        this.goalSelector.add(2, new TemptGoal(this, 1.25D, Ingredient.empty(),false));
        this.goalSelector.add(1, new WanderAroundFarGoal(this, 1.0D));
        this.goalSelector.add(2, new LookAroundGoal(this));

        this.goalSelector.add(1, new PestilenceZombieAttackGoal(this, 1D, true));
        this.targetSelector.add(1, new RevengeGoal(this));
    }

    public static DefaultAttributeContainer.Builder createPestilenceZombieAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 200)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.3F)
                .add(EntityAttributes.GENERIC_ARMOR, 0.3)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 3.2)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 30.0)
                .add(EntityAttributes.ZOMBIE_SPAWN_REINFORCEMENTS);

    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return stack.isOf(Items.ROTTEN_FLESH);
    }

    @Nullable
    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return ModEntities.PESTILENCE_ZOMBIE.create(world);
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(ATTACKING, false);
    }

    @Override
    public void setAttacking(boolean attacking) {
        this.dataTracker.set(ATTACKING, attacking);
    }

    @Override
    public boolean isAttacking() {
        return this.dataTracker.get(ATTACKING);
    }
}
