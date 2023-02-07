public abstract class Character implements Movable , Comparable<Character>{
    protected String name;
    protected final String RPGClass;
    protected int life = 50;
    protected int agility = 2;
    protected int strength = 2;
    protected int wit = 2;
    protected Integer capacity = 0;

    //-----ctr
    protected Character(String cName, String cClass) {
        this.name = cName;
        RPGClass = cClass;
    }

    protected Character(String cName, String cClass, Integer cCapacity) {
        this.name = cName;
        RPGClass = cClass;
        this.capacity = cCapacity;
    }
    //------method
    public int compareTo (Character charac) {
        if (charac != null) {
            return this.capacity.compareTo(charac.capacity);
        }
        else return 0;
    }

    public void attack(String weapon) {
        System.out.println(this.name + ": Rrrrrrrrr....");
    }

    @Override
    public void moveBack() {
        System.out.println(this.name + ": moves back");
    }

    @Override
    public void moveForward() {
        System.out.println(this.name + ": moves forward");
    }

    @Override
    public void moveLeft() {
        System.out.println(this.name + ": moves left");
    }

    @Override
    public void moveRight() {
        System.out.println(this.name + ": moves right");
    }

    public final void unsheathe() {
        System.out.println(this.name +": unsheathes his weapon.");
    }

    //----getter

    public String getName() {
        return name;
    }

    public String getRPGClass() {
        return this.RPGClass;
    }

    public int getLife() {
        return life;
    }

    public int getAgility() {
        return agility;
    }

    public int getStrength() {
        return strength;
    }

    public int getWit() {
        return wit;
    }
}
