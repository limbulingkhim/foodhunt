package com.example.foodhunt;

/**
 * The type Game levels speeds.
 */
public class GameLevelsSpeeds {

    private static int yellowSpeed;
    private static int greenSpeed;
    private static int redSpeed;

    private static String level;

    /**
     * Instantiates a new Game levels speeds.
     *
     * @param ySpeed the y speed
     * @param gSpeed the g speed
     * @param rSpeed the r speed
     * @param lvl    the lvl
     */
    public GameLevelsSpeeds(int ySpeed, int gSpeed, int rSpeed, String lvl) {
        yellowSpeed = ySpeed;
        greenSpeed = gSpeed;
        redSpeed = rSpeed;
        level = lvl;
    }

    /**
     * Gets yellow speed.
     *
     * @return the yellow speed
     */
    public static int getYellowSpeed() {
        return yellowSpeed;
    }

    /**
     * Gets green speed.
     *
     * @return the green speed
     */
    public static int getGreenSpeed() {
        return greenSpeed;
    }

    /**
     * Gets red speed.
     *
     * @return the red speed
     */
    public static int getRedSpeed() {
        return redSpeed;
    }

    /**
     * Gets level.
     *
     * @return the level
     */
    public static String getLevel() {
        return level;
    }
}
