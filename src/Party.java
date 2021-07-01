/**
 * A scaled down version of a Party class
 *
 * @author Justin Brophy
 * @version 2.1
 */
public class Party { // a class is the blueprint from which a object is created. makeing a rule
                     // an object is a physical presentation created from the class
                     // attributes . This is the blue print which an object is created
    private String partyName;
    private String partyLeader;
    private String partyGenre;
    private int numLocalReps;

    /**
     /* Constructor for objects of class Party
     /* @param partyName Name of the party
     /* @param partyLeader leader of the party
     /* @param partyGenre genre of the party
    / * @param numLocalReps buber of local reps of the party
     **/
    //Constructer created Asking for all the party details
    public Party(String partyName, String partyLeader, String partyGenre, int numLocalReps)
    {
        this.partyName = partyName;// attribute is equal to whatever is being passed in for example labour Party
        this.partyLeader = partyLeader;
        //this.partyGenre = partyGenre;
        setPartyGenre(partyGenre);//calling the setter down below to set the attributes
        //this.numLocalReps = numLocalReps;
        setNumLocalReps(numLocalReps);//calling the setter down below 

    }

    //-------
    //getters
    //-------

    public String getPartyName() {
        return partyName;
    }

    public String getPartyLeader() {
        return partyLeader;
    }

    public String getPartyGenre() {
        return partyGenre;
    }

    public int getNumLocalReps() {
        return numLocalReps;
    }

    //-------
    //setters
    //-------


    public void setPartyName(String partyName) {


        this.partyName = Utilities.max30Chars(partyName);
    }

    public void setPartyLeader(String partyLeader) {
        this.partyLeader = partyLeader;
    }

    public void setPartyGenre(String partyGenre) {
        if (partyGenre.equalsIgnoreCase("RIGHT") || partyGenre.equalsIgnoreCase("LEFT") || partyGenre.equalsIgnoreCase("EXTREME RIGHT") || partyGenre.equalsIgnoreCase("EXRTEME LEFT") || partyGenre.equalsIgnoreCase("CENTRE") || partyGenre.equalsIgnoreCase("UNCATEGORISED"))

        {
            this.partyGenre = partyGenre.toUpperCase();
        }
        else this.partyGenre = "UNKNOWN";//if its false read the message "UNKNOWN"
    }
    public void setNumLocalReps(int numLocalReps) {
        if ( numLocalReps >= 0){//ask for another input if its not true
        this.numLocalReps = numLocalReps;//initilaze the attribute if the condition s true
        }
    }
    /**
     * Builds a String representing a user friendly representation of the object state
     * @return Details of the specific mep
     */

    /**
     *the class has a toString method to return a string containing
     * a user frindy reprsentation of the object state
     */
    public java.lang.String toString() {
        return "Party Name: " + partyName
                + ", Party leader: " + partyLeader
                + ", Party Genre: " + partyGenre
                +",  Number of Local Reps: " + numLocalReps;
    }

    public void setPartyMEP(String mepParty) {
    }
}
