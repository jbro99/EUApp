import java.util.ArrayList;

public class Country {//

    private String name;
    private int noMEPs;
    private ArrayList<Mep> meps;//im going to have an arraylist of MEP called meps
    private int count = 0;

    /**
     * Constructor for objects of class Country
   //  * @param name Name of the country
  //   * @param noMEPS number of meps of the country
  //
     */

    public Country(String name, int noMEPs) {//main method, passing the String which is name and int which is noMEPs
        this.name = name;
        this.noMEPs = noMEPs;
        meps = new ArrayList<Mep>();//connecting the Mep class to the arraylist
    }
    public int mepsListSize()
    {
        return meps.size();
    }
   //getting Meps in the arrayList
    public ArrayList<Mep> getMeps(){
        return meps;
    }
    //setting Meps in the arrayList
    public void setMeps(ArrayList <Mep> meps){
        this.meps = meps;
    }
    //adding an Mep
    public void addMEP(Mep Mep){//arrayList holds ojects of this type
        meps.add(Mep);// the array list of meps and thn adding
        count++;
        //System.out.println(count);
    }
    //getting an MEP
    public Mep getMEP( int i){
        //need to add valid check
        return meps.get(i);
    }

    public int getNoMEPs(){
        return noMEPs;
    }
    public void setNoMEPs(int i){
        this.noMEPs = i;
    }
    public int numberOfMEPs(){
        return count;
    }
    //this should remove the Mep object at position i (if it exists). If a successful delete takes place, then return true, otherwise false.
    public boolean removeMEP(int i){
        //if the i is valid
        if( Utilities.validIntRange(i, 0, meps.size()) ){
            meps.remove(i);
            count--;
            return true;//If a successful delete takes place return true
        }
        else{
            return false;
        }
    }
    //this should return (as a String) the list of MEPs currently added to this Country
    public String listOfMEPs(){
        if(meps.size() == 0){
            return "No meps";
        }
        else{
            String listOfMEPs = "";
            for(int i = 0; i < meps.size(); i++){
                listOfMEPs = listOfMEPs + i +": " + meps.get(i)+ "\n";
            }
            return listOfMEPs;
        }

    }
    //this should return (as a String) the list of MEPs currently added to this Country that are members of the supplied Party.
    public String listOfMEPsByParty(Party party){

        if(!meps.isEmpty()){
            String str = "";
            for (int i  = 0; i < meps.size(); i++){
                if(meps.get(i).getMEPParty().equals(party))
                    str = str + i + ": "+ meps.get(i)+ "\n";
            }
            return str;
        }
        else{
            return "No Meps are associated with this party" + party;
        }
    }
    //this should return the number of MEPs currently added to this Country that are members of the supplied Party.
    public int noOfMEPsByParty(Party party){
        if (count > 0)
        {
            return count;
        }
        else
        {
            return -1;
        }
    }



    //-------
    //getters
    //-------
    public String getName() {
        return name;
    }
    //-------
    //setters
    //-------
    public void setName(String name) {
        this.name = name;
    }

    //toString() is a method that returns a string version of an object.
    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", noMEPs=" + noMEPs +
                ", meps=" + meps +
                '}';
    }
}
