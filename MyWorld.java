import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private DialogueBox dialogue;
    private Character character;
    public MyWorld()
    {    
        super(1280, 720, 1);

        setBackground("airports.jpg");
        
        character = new Character();
        addObject(character, 950, 250);
        
        DialogueBox dialogue = new DialogueBox(
        "Erva",
        "Hi there! Welcome to the airport."
        );

        addObject(dialogue, 640, 610);
        
    }
        
    public void act()
    {
        if (Greenfoot.mouseClicked(null))
        {
            nextDialogue();
        }
        if (Greenfoot.mouseClicked(null))
        {
            nextDialoguez();
        }
    }

    public void nextDialogue()
    {
        removeObject(dialogue);
        character.changeExpression("speakErva.png");

        dialogue = new DialogueBox(
            "Erva",
            "We need to roll now! we have short amount of time left."
        );

        addObject(dialogue, 640, 610);
    }
    
    public void nextDialoguez()
    {
        removeObject(dialogue);
        character.changeExpression("thinkErva.png");

        dialogue = new DialogueBox(
            "Erva",
            "Since you're new here, I'll teach you on the way."
        );

        addObject(dialogue, 640, 610);
    }
}
