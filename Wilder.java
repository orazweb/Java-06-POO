
// classe Wilder
public class Wilder {

    // attributes
    private String firstName;
    private boolean aware;

    //constructors
    public Wilder (String firstName, boolean aware) {
        this.firstName = firstName;
        this.aware = aware;
    }

    // instance method
    public String whoAmI() {

        if (this.isAware() == true) 
          return "Je m'appelle " +this.getFirstName()+ " et je suis aware";
          else return "Je m'appelle " +this.getFirstName()+ " et je ne suis pas aware";
    }

    // getters
    public String getFirstName() {
        return this.firstName;
    }

    public boolean isAware() {
        return this.aware;
    }

    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

}
