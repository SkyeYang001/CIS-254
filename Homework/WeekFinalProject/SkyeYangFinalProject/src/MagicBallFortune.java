/**
 * Final Project
 * Description:
 * Magic Ball Fortune class, represents a Magic 8 Ball fortune and its type
 * (affirmative, non-committal, or negative).
 * and type.
 * 
 * @author Skye Yang
 * @since 12/02/2025
 */

public class MagicBallFortune {
    private String fortune;
    private char type;

    /**
     * The default constructor method
     * 
     * @param fortune
     * @param type
     */
    public MagicBallFortune(String fortune, char type) {
        this.fortune = fortune;
        this.type = type;
    }

    /**
     * Sets obj
     * 
     * @param obj
     */
    public MagicBallFortune(MagicBallFortune obj) {
        this.fortune = obj.fortune;
        this.type = obj.type;
    }

    /**
     * Sets fortune String
     * 
     * @param fortune
     */
    public void setFortune(String fortune) {
        this.fortune = fortune;
    }

    /**
     * Sets type character
     * 
     * @param type
     */
    public void setType(char type) {
        this.type = type;
    }

    /**
     * Gets fortune String
     * 
     * @return fortune String
     */
    public String getFortune() {
        return this.fortune;
    }

    /**
     * Gets type character
     * 
     * @return type character
     */
    public char getType() {
        return this.type;
    }

    /**
     * Creates a String, telling the fortune and it's type
     * 
     * @return fortune String and full type
     */
    @Override
    public String toString() {
        String category;
        if (type == 'P') {
            category = "Affirmative";
        } else if (type == 'C') {
            category = "Non-Committal";
        } else {
            category = "Negative";
        }
        return String.format("%s (%s)", fortune, category);
    }

}
