package us.kpatrick;

/**
 * This class is for a Cat.
 * Created by kpatr on 12/27/17.
 * @author kpatr
 */
public class Cat extends Pet implements Talkable {
    private int mousesKilled;

    /**
     * Constructor Class takes mouses killed and the Cat Name.
     * @param mousesKilled how many mouses filled
     * @param name the name of the cat
     */
    public Cat(int mousesKilled, String name) {
        super(name);
        this.mousesKilled = mousesKilled;
    }

    /**
     * This gets the number of mice killed
     * @return mouses Killed
     */
    public int getMousesKilled() {
        return mousesKilled;
    }

    /**
     * Increment number of mice
     */
    public void addMouse() {
        mousesKilled++;
    }

    /**
     * Cat says Meow
     */
    @Override
    public String talk() {
        return "Meow";
    }

    /**
     * Get string of mouses killed
     * @return string Cat name='name' mousesKilled='x'
     */
    @Override
    public String toString() {
        return "Cat: " + "name=" + name + " mousesKilled=" + mousesKilled;
    }
}

