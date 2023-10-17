/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5testbeholder;

/**
 *
 * @author croberts22
 */

//Beholder class acts as a blueprint
public class Beholder 
{
    // Private instance variables
    private String name;
    private String color;
    private String eyeColor;
    private String teeth;
    private int numEyeStalks;
    private double radius;
    
    //default public (constructor) Beholder with attributes in the body
    public Beholder()
    {
       name = "Beholder";
       radius = 3.0;
       color = "Purple";
       eyeColor = "Bright Purple";
       teeth = "Sharp";
       numEyeStalks = 10;
    }        

    /** Constructs a Beholder instance with the given radius and default color */
    public Beholder(double r){
        radius = r;
        color = "Bright Purple";
        eyeColor = "Bright Purple";
        teeth = "Sharp";
        numEyeStalks = 10;        
    }
    
    // Constructs a Beholder with given radius and color eye color kind of teeht and number of eye stalks
    public Beholder(String n,double r, String c, String e, String t, int s) { // 3rd constructor
        name = n;
        radius = r;
        color = c;
        eyeColor = e;
        teeth = t;
        numEyeStalks = s;
    }

    //Creating methods - getters and setters
    public String getName(){
        return name;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double r){
        radius = r;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String c){
        color = c;
    } 
    
    public String getEyeColor(){
        return eyeColor;
    }
    
    public void setEyeColor(String e){
        eyeColor = e;
    }
    
    public String getTeeth(){
        return teeth;
    }
    
    public void setTeeth(String t){
        teeth = t;
    }
    
    public int getNumEyeStalks(){
        return numEyeStalks;
    }

    public void setNumEyeStalks(int s){
        numEyeStalks = s;
    }

    
    

    
    // Methods used for invoking attacks
    public void fireEyeBeam(String beam){
        System.out.println("The " + name + " fires a " + beam + " eye beam!");
    }
    
    public void levitate(){
        System.out.println("The " + name + " levitates ominously...");
    }
    
    //@Override Public toString method 
    public String toString(){
        return 
                "\nType of Beholder: " + name + "\n" +
                "Radius= " + radius + "\n" +
                "Skin color: " + color + "\n" +
                "Eye Color: " + eyeColor + "\n" +
                "Teeth: " + teeth + "\n" +
                "Number of Eye Stalks: " + numEyeStalks + "";
    
    }

    //Main method for testing Beholder attributes and states
    public static void main(String[] args){
        
        /*declare at least two of class objects: one using the default constructor and one using the
        multi-parameter constructor.
        */
        //BeholderClass object = new Myclass 
        
        Beholder defaultBeholder = new Beholder();
        
        
        Beholder spectator = new Beholder("Spectator", 2.0,"Green", "Ethereal Green", "Sharp",4 );
        
        
        Beholder gauth = new Beholder("Gauth", 2.0,"Orange ","Blue ", "Sharp but Jagged ", 13);
       
        
        System.out.println("Beholderkin details ");
        System.out.println(defaultBeholder);
        System.out.println(spectator);
        System.out.println(gauth);
        
        // Methods used for Beholderkin actions
        System.out.println("\nAttacks and abilities: ");
        defaultBeholder.fireEyeBeam("Death Ray");
        defaultBeholder.levitate();
        
        spectator.fireEyeBeam("Fear Ray");
        spectator.levitate();
        
        gauth.fireEyeBeam("Devour Magic Ray");
        gauth.levitate();
        
    }
}
