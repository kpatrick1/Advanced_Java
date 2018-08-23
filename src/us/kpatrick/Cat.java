package us.kpatrick;

/**
 * This class is for a Cat.
 * Created by mgreen14 on 12/27/17.
 */
public class Cat extends Pet implements Talkable {
    private int mousesKilled;

    /**
     * Constructor Class takes mouses killed and the Cat Name.
     * @param mousesKilled
     * @param name
     */
    public Cat(int mousesKilled, String name) {
        super(name);
        this.mousesKilled = mousesKilled;
    }

    /**
     * This gets the number of mice killed
     * @param none
     * @return mouses Killed
     * @throws Nothing
     * @exception none
     */
    public int getMousesKilled() {
        return mousesKilled;
    }

    public void addMouse() {
        mousesKilled++;
    }

    @Override
    public String talk() {
        return "Meow";
    }

    @Override
    public String toString() {
        return "Cat: " + "name=" + name + " mousesKilled=" + mousesKilled;
    }
}

