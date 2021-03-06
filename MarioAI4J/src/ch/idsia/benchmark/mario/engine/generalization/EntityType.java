package ch.idsia.benchmark.mario.engine.generalization;

import ch.idsia.benchmark.mario.engine.sprites.Sprite;

public enum EntityType {

	/**
	 * No entity at this spot.
	 * <p>
	 * ZLevels: 0, 1, 2
	 */
	NOTHING("", Sprite.KIND_NONE, EntityKind.SAFE, 0, 1, 2),
	
	/**
	 * A collectible fire flower.
	 * <p>	
	 * ZLevels: 0, 1
	 */
	FIRE_FLOWER("FF", Sprite.KIND_FIRE_FLOWER, EntityKind.COLLECTIBLE, 0, 1),
	
	/**
	 * A collectible mushroom!
	 * <p>
	 * ZLevels: 0, 1
	 */
	MUSHROOM("M", Sprite.KIND_MUSHROOM, EntityKind.COLLECTIBLE, 0, 1),
	
	/**
	 * Something with spikes! Don't touch this!
	 * <p>
	 * ZLevels: 0, 1
	 * <p>
	 * {@link Sprite#KIND_SPIKY} or {@link Sprite#KIND_ENEMY_FLOWER} or {@link Sprite#KIND_SPIKY_WINGED}
	 */
	SPIKES("S", Sprite.KIND_SPIKY, EntityKind.DANGER_INVINCIBLE, 0, 1), 
	
	/**
	 * A fireball.
	 * <p>
	 * ZLevels: 0, 1
	 * <p>
	 * {@link Sprite#KIND_FIREBALL}
	 */
	FIREBALL("FB", Sprite.KIND_FIREBALL, EntityKind.SAFE, 0, 1),
	
	/**
	 * A Bullet Bill.
	 * <p>
	 * ZLevels: 0
	 * <p>
	 * {@link Sprite#KIND_BULLET_BILL}
	 */
	BULLET_BILL("BB", Sprite.KIND_BULLET_BILL, EntityKind.SAFE, 0),
	
	/**
	 * A Goomba.
	 * <p>
	 * ZLevels: 0
	 * <p>
	 * {@link Sprite#KIND_GOOMBA}
	 */
	GOOMBA("G", Sprite.KIND_GOOMBA, EntityKind.DANGER_SHOOTABLE_SQUISHABLE, 0),
	
	/**
	 * A winged Goomba.
	 * <p>
	 * ZLevels: 0
	 * <p>
	 * {@link Sprite#KIND_GOOMBA_WINGED
	 */
	GOOMBA_WINGED("GW", Sprite.KIND_GOOMBA_WINGED, EntityKind.DANGER_SHOOTABLE_SQUISHABLE, 0),
	
	/**
	 * A green Koopa.
	 * <p>
	 * ZLevels: 0
	 * <p>
	 * {@link Sprite#KIND_GREEN_KOOPA
	 */
	GREEN_KOOPA("GK", Sprite.KIND_GREEN_KOOPA, EntityKind.DANGER_SHOOTABLE_SQUISHABLE, 0),
	
	/**
	 * A winged green Koopa.
	 * <p>
	 * ZLevels: 0
	 * <p>
	 * {@link Sprite#KIND_GREEN_KOOPA_WINGED
	 */
	GREEN_KOOPA_WINGED("KW", Sprite.KIND_GREEN_KOOPA_WINGED, EntityKind.DANGER_SHOOTABLE_SQUISHABLE, 0),
	
	/**
	 * A red Koopa.
	 * <p>
	 * ZLevels: 0
	 * <p>
	 * {@link Sprite#KIND_RED_KOOPA
	 */
	RED_KOOPA("RK", Sprite.KIND_RED_KOOPA, EntityKind.DANGER_SHOOTABLE_SQUISHABLE, 0),
	
	/**
	 * A red winged Koopa.
	 * <p>
	 * ZLevels: 0
	 * <p>
	 * {@link Sprite#KIND_RED_KOOPA_WINGED
	 */
	RED_KOOPA_WINGED("RW", Sprite.KIND_RED_KOOPA_WINGED, EntityKind.DANGER_SHOOTABLE_SQUISHABLE, 0),
	
	/**
	 * A still shell.
	 * <p>
	 * ZLevels: 0
	 * <p>
	 * {@link Sprite#KIND_SHELL}
	 */
	SHELL_STILL("ST", Sprite.KIND_SHELL, EntityKind.SAFE_SHOOTABLE, 0),
	
	/**
	 * A moving shell.
	 * <p>
	 * ZLevels: 0
	 * <p>
	 * {@link Sprite#KIND_SHELL}
	 */
	SHELL_MOVING("SM", Sprite.KIND_SHELL, EntityKind.DANGER_SHOOTABLE, 0),
	
	/**
	 * A wave Goomba.
	 * <p>
	 * ZLevels: 0
	 * <p>
	 * {@link Sprite#KIND_WAVE_GOOMBA}
	 */
	WAVE_GOOMBA("WG", Sprite.KIND_WAVE_GOOMBA, EntityKind.DANGER_SHOOTABLE_SQUISHABLE, 0),
	
	/**
	 * Something dangerous!
	 * <p>
	 * ZLevels: 1
	 * <p>
	 * {@link Sprite#KIND_BULLET_BILL},
	 * {@link Sprite#KIND_GOOMBA}, {@link Sprite#KIND_GOOMBA_WINGED}, 
	 * {@link Sprite#KIND_GREEN_KOOPA}, {@link Sprite#KIND_GREEN_KOOPA_WINGED},
	 * {@link Sprite#KIND_RED_KOOPA}, {@link Sprite#KIND_RED_KOOPA_WINGED},
	 * {@link Sprite#KIND_SHELL}, {@link Sprite#KIND_WAVE_GOOMBA}
	 */
	DANGER("D!", Sprite.KIND_GOOMBA, EntityKind.DANGER_SHOOTABLE_SQUISHABLE, 1),
	
	/**
	 * A Spiky.
	 * <p>
	 * ZLevels: 0
	 * <p>
	 * {@link Sprite#KIND_SPIKY}.
	 */
	SPIKY("SP", Sprite.KIND_SPIKY, EntityKind.DANGER_INVINCIBLE, 0),
	
	/**
	 * An enemy flower.
	 * <p>
	 * ZLevels: 0
	 * <p>
	 * {@link Sprite#KIND_ENEMY_FLOWER}
	 */
	ENEMY_FLOWER("EF", Sprite.KIND_ENEMY_FLOWER, EntityKind.DANGER_SHOOTABLE, 0),
	
	/**
	 * A winged Spiky.
	 * <p>
	 * ZLevels: 0
	 * <p>
	 * {@link Sprite#KIND_SPIKY_WINGED}
	 */
	SPIKY_WINGED("SW", Sprite.KIND_SPIKY_WINGED, EntityKind.DANGER_INVINCIBLE, 0),
	
	/**
	 * The princess.
	 * <p>
	 * ZLevels: 0, 1, 2
	 * <p>
	 * {@link Sprite#KIND_PRINCESS}
	 */
	PRINCESS("P", Sprite.KIND_PRINCESS, EntityKind.COLLECTIBLE, 0, 1, 2),
	
	/**
	 * Mario himself.
	 * <p>
	 * ZLevels: 0, 1, 2
	 * <p>
	 * {@link Sprite#KIND_MARIO}
	 */
	MARIO("M", Sprite.KIND_MARIO, EntityKind.SAFE, 0, 1, 2),
	
	/**
	 * Some entity... ???
	 * <p> 
	 * ZLevels: 0 (received in this level means BUG), 1 (received in this level means BUG), 2
	 */
	SOMETHING("?", 1, EntityKind.SAFE, 0, 1, 2);
		
	private String debug;
	
	private int code;

	private int[] zLevels;
	
	private EntityKind kind;
	
	private EntityType(String debug, int code, EntityKind kind, int... zLevels) {
		this.debug = debug;
		this.code = code;
		this.kind = kind;
		this.zLevels = zLevels;		
	}
	
	public String getDebug() {
		return debug;
	}

	public int getCode() {
		return code;
	}
	
	public int[] getZLevels() {
		return zLevels;
	}

	public EntityKind getKind() {
		return kind;
	}

	public boolean isZLevel(int zLevel) {
		for (int level : zLevels) {
			if (zLevel == level) return true;
		}
		return false;
	}
	
}
