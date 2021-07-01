/**
 * A scaled down version of a Product class
 *
 * @author Justin Brophy
 * @version 2.1
 */
public class Mep {//class called Mep
         //attributes
    private String MEPName;
    private String MEPEmail;
    private String MEPPhone;
    private PartyList thePartyList;
    private Party MepParty;

    /**
     * Constructor for objects of class Product
     * @param MEPName Name of the MEP
     * @param MEPEmail Email of the MEP
     * @param MEPPhone Phone number of the MEP
     * @param MEPParty Party of the MEP
     */
    public Mep(String MEPName, String MEPEmail, String MEPPhone, Party MEPParty,  PartyList thePartyList)
    {
        this.MEPName = MEPName;
        this.MEPEmail = MEPEmail;
        this.MEPPhone = MEPPhone;
        this.MepParty=MEPParty;
        this.thePartyList=thePartyList;


    }

    //-------
    //getters
    //-------


    public String getMEPName(){
        return MEPName;
    }

    public String getMEPEmail() {
        return MEPEmail;
    }

    public String getMEPPhone() {
        return MEPPhone;
    }

    public Party getMEPParty() {
        return MepParty;
    }

    //-------
    //setters
    //-------


    public void setMEPName(String MEPName) {

        this.MEPName = Utilities.max30Chars(MEPName);
    }

    public void setMEPEmail(String MEPEmail) {
        if( Utilities.validEmail(MEPEmail) == true)
            this.MEPEmail = MEPEmail;//you can store the email address
        else{
            this.MEPEmail = "Invalid format email";//if it doesnt store it, return the message Invalid format email.
        }
    }

    public void setMEPPhone(String MEPPhone) {
        if( Utilities.onlyContainsNumbers(MEPPhone) == true)//if class. method name and passing what ever is stored in MEPPhone is true
            this.MEPPhone = MEPPhone;//you can store the phone number
        else//otherwise
        {
            this.MEPPhone = "Unknown";//else if its false just print out Unknown
        }


    }

    public void setMEPParty(String MEPParty,PartyList thePartyList ) {
        this.thePartyList = thePartyList;
        this.MepParty = MepParty;
    }



    /**
     * Builds a String representing a user friendly representation of the object state
     * @return Details of the specific mep
     */

    public String toString() {// meththod to print the object
        return "MEP Name: " + MEPName
                + ", MEP Email: " + MEPEmail
                + ", MEP Phone: " + MEPPhone
                +", MEP Party: " + MepParty + "\n";

    }
}
