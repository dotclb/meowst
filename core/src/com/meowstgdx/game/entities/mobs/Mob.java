package com.meowstgdx.game.entities.mobs;

import com.meowstgdx.game.entities.Entity;

public abstract class Mob extends Entity {
    protected int moveSpeed;
    protected int attackSpeed;
    protected int health;
    protected int maxHealth;
    protected float stamina;
    protected float maxStamina;
    protected int damage;
    protected int protection;

    protected Mob(float moveSpeed, float attackSpeed, int health, int maxHealth, int stamina, int maxStamina, int damage, int protection) {
        super(0, 0, 5, 5);
    }

    public void hurt(int amount) {
        setHealth(getHealth() - amount);
    }


    // Getters
    public float getMoveSpeed() {
        return moveSpeed;
    }

    public float getAttackSpeed() {
        return attackSpeed;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public float getStamina() {
        return stamina;
    }

    public float getMaxStamina() {
        return maxStamina;
    }

    public int getDamage() {
        return damage;
    }

    public int getProtection() {
        return protection;
    }


    // Setters
    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setMaxStamina(int maxStamina) {
        this.maxStamina = maxStamina;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }
}
