
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    private String description;
    private String name;

    /**
     * Constructor for objects of class Item
     */
    public Item(String description, String name)
    {
        // initialise instance variables
        this.description = description;
        this.name = name;
    }


    public String getDescription()
    {
        return description;
    }
    
    public String getName()
    {
        return name;
    }
}