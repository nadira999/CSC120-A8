import java.util.ArrayList; // import ArrayList

/** 
 *  Class representing a ninjaTurtle exploring the city. 
 *  The ninjaTurtle class serves as a character that can be used to explore the City.
 */
public class ninjaTurtle implements Contract{
    
    private String name;
    private ArrayList<String> inventory;
    private boolean flight;
    private boolean walking;
    private int height;
    

// Default constructor with name as input
    public ninjaTurtle (String name) {
        System.out.println("Let's save the world together!");
        this.name = name;
        this.height = 1;
        this.flight = false;
        this.walking = false;
    }

// Overloaded constructor with name and height
    public ninjaTurtle (String name, int height) {
        System.out.println("You have acquired a friend! Let's explore the subway together!");
        this.name = name;
        this.height = height;
        this.flight = false;
        this.walking = false;
        this.inventory = new ArrayList<String>(); // initialize inventory to a new ArrayList<String>
    }

  /** 
   *  Adds an item to the ninjaTurtle's invenotry
   *  @param item item to be added to inventory
   */
    public void grab(String item) {
        this.inventory.add(item);
        System.out.println(this.name + " has added " + item + " to their inventory!");
    }

  /** 
   *  Removes an item from the ninjaTurtle's inventory
   *  @param item item to be removed from inventory
   *  @return String stating that the item has been droped, given that it's in the inventory 
   */
    public String drop(String item) {
        if (this.inventory.contains(item)) {
            this.inventory.remove(item);
            return this.name + " has removed " + item + " from their inventory!";
        }
        else{
            return this.name + " cannot drop " + item + " because it is not in their inventory!";
        }
    }

    /** 
   *  Prints the ninjaTurtle's inventory
   */
    public void seeInventory(){
        System.out.println("Items in inventory: " + this.inventory);
      }

  /** 
   *  The ninjaTurtle perceives an item
   *  @param item item to be perceived
   */
    public void examine(String item){
        System.out.println(this.name + " gains a new perspective on " + item);
    }

  /** 
   *  The ninjaTurtle uses the item to do something cool
   *  @param item item to be used
   */
    public void use(String item){
        System.out.println(this.name + " is using " + item + " to do something cool!");
    }

  /** 
   *  The ninjaTurtle walks in given direction
   *  @param direction direction for the ninjaTurtle to walk in
   *  @return T/F: is the ninjaTurtle is walking 
   */
    public boolean walk(String direction) {
        if (this.flight == false) {
            System.out.println(this.name + " is walking " + direction);
            return this.walking = true;
        }
        else {
            System.out.println(this.name + " is flying " + direction);
            this.walking = false;
            return this.walking = false;
        }
    }

  /** 
   *  Given that the ninjaTurtle is not already walking, the ninjaTurtle flys the given distance
   *  @param x direction for the ninjaTurtle to fly in (left/right)
   *  @param y direction for it to fly in (forward/backward)
   *  @return T/F: is the ninjaTurtle flying 
   */
    public boolean fly(int x, int y){
        if (this.walking == false) {
            if (x < 0 && y < 0) {
                System.out.println(this.name + " is flying " + x + " km to the left and " + y + " km south");
                return this.flight = true;
            } 
            else if (x < 0 && y > 0) {
                System.out.println(this.name + " is flying " + x + " km to the left and " + y + " km south");
                return this.flight = true;
            }
            else if (x > 0 && y < 0) {
                System.out.println(this.name + " is flying " + x + " km to the right and " + y + " km south");
                return this.flight = true;
            }
            else if (x > 0 && y > 0) {
                System.out.println(this.name + " is flying " + x + " km to the right and " + y + " km North");
                return this.flight = true;
            }
            else if (x == 0 && y < 0) {
                System.out.println(this.name + " is flying " + y + " km North");
                return this.flight = true;
            }
            else if (x == 0 && y > 0) {
                System.out.println(this.name + " is flying " + y + " km North");
                return this.flight = true;
            }
            else if (x < 0 && y == 0) {
                System.out.println(this.name + " is flying " + x + " km to the left");
                return this.flight = true;
            }
            else if (x > 0 && y == 0) {
                System.out.println(this.name + " is flying " + x + " km to the right");
                return this.flight = true;
            }
            else {
                System.out.println(this.name + " is floating.");
                return this.flight = false;
            }
        }
        else{
            System.out.println(this.name + " is walking. " + this.name + " must examine their surronding.");
            return this.flight = false;
        }
    }

  /** 
   *  Reduces the ninjaTurtle's height by half if it's not already too short
   *  @return The ninjaTurtle's current height
   */
    public Number shrink(){
        if (this.height < 2){
            System.out.println("Alert! If " + this.name + " shrinks any further they'll disappear!");
            if (this.height == 1) {
                System.out.println(this.name + " is still " + this.height + " meters tall.");
                return this.height;
            }
            else{
                System.out.println(this.name + " is still " + this.height + " meters tall.");
                return this.height;
            }
        }
        else {
            this.height = this.height/2;
            if (this.height == 1) {
                System.out.println(this.name + " shrunk! " + this.name + " is now " + this.height + " meters tall.");
                return this.height;
            }
            else{
                System.out.println(this.name + " shrunk! " + this.name + " is now " + this.height + " meters tall.");
                return this.height;
            }
        }
        
    }

  /** 
   *  Doubles the ninjaTurtle's  height
   *  @return The ninjaTurtle's  current height 
   */
    public Number grow(){
        this.height = this.height*2;
        System.out.println(this.name + " grew! " + this.name + " is currently " + this.height + " meters tall.");
        return this.height;
    }

    public void rest(){
        if (this.flight == true){
            System.out.println(this.name + " is not flying.");
            this.flight = false;
        }
        else if (this.walking == true){
            System.out.println(this.name + " is not walking");
            this.walking = false;
        }
        else {
            System.out.println(this.name + " is taking time to rest! " + this.name + " is now resting.");
            this.walking = false;
            this.flight = false;
        }
    }

  /** 
   *  Increases the ninjaTurtle's height for eternity.
   */
    public void undo(){
        System.out.println("Alert! During" + this.name + "'s last action, " + this.name + " accidentally grew!");
        grow();
    }

  /** 
   *  Displays all possible functions that the a ninjaTurtle can perform
   */
    public void showOptions() {
        System.out.println("Available options for " + this.name + ":\n + grab(item) \n + drop(item) \n + seeInventory() \n + examine(item) \n + use(item)\n + walk(direction)\n + fly(x,y)\n + shrink()\n + grow()\n + rest()\n + undo()");
      }

  /** 
   *  Information about the ninjaTurtle
   */
    public String toString() {
        return this.name + " is a " + this.height + " meters tall.";
    }

    public static void main(String[] args) {
        ninjaTurtle Rafeal = new ninjaTurtle("Rafeal", 1);
        System.out.println(Rafeal);
        Rafeal.showOptions();
        Rafeal.grab("Bow and Arrow");
        Rafeal.seeInventory();
        Rafeal.drop("bomb");
        Rafeal.seeInventory();
        Rafeal.examine("Bow and Arrow");
        Rafeal.use("Bomb");
        Rafeal.walk("North");
        Rafeal.rest();
        Rafeal.fly(0, 0);
        Rafeal.rest();
        Rafeal.shrink();
        Rafeal.grow();
        Rafeal.rest();
        Rafeal.undo();
        Rafeal.seeInventory();
    
      }

}

