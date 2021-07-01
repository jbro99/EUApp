import java.util.ArrayList;
import java.util.Arrays;

public class PartyList {
// array list
    private ArrayList<Party> parties;
    private int count = 0;// count increass when you add a party and decreases when you delete a party

    //constructer
    public PartyList() {
        this.parties = new ArrayList<>();
    }
    //add Method
    public void addParty(Party party){
        parties.add(party);
        count++;
    }
    //get party
    public Party getParty(int index)
    {
        return parties.get(index);
    }
    public boolean removeParty(int i){
        //if the i is valid
        if( Utilities.validIntRange(i, 0, parties.size()) ){
            parties.remove(i);
            count--;
            return true;
        }
        else{
            return false;
        }
    }
    //this should return (as a String) the list of MEPs currently added to this Country
    public String listOfParties(){
        if(parties.size() == 0){
            return "No meps";
        }
        else{
            String listOfMEPs = "";
            for(int i = 0; i < parties.size(); i++){
                listOfMEPs = listOfMEPs + i +": " + parties.get(i)+ "\n";
            }
            return listOfMEPs;
        }

    }


    public int numberOfParties()//had to create a method to return the number of parties
{
    return count;
}


    //-------
    //getters
    //-------

    public ArrayList<Party> getPartyList() {
        return parties;
    }


    //-------
    //setters
    //-------

    public void setParties(ArrayList<Party> parties) {
        this.parties = parties;
    }

    public Party largestParty()
        {
                Party largest = parties.get(0);
                for (int i = 1; i < parties.size(); i++) {
                    if (parties.get(i).getNumLocalReps() > largest.getNumLocalReps()) {
                        largest = parties.get(i);
                    }
                }
                return largest;
    }
    public String listPartiesBySpecificGenre(String genre)
    {
        String genresList = "";
        for(int i = 0; i < parties.size(); i++)
        {
            if(parties.get(i).getPartyGenre().equalsIgnoreCase(genre))//checking the genre of the parties
            {
                genresList = genresList + parties.get(i).getPartyName() + ", ";
            }
        }
        return genresList;
    }

}

