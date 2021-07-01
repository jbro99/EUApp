import java.util.Scanner;
import java.util.ArrayList;

public class Utilities {// class called Utilities

    public static boolean onlyContainsNumbers(String text)//passing in a string and calling it text,
    {
        if (text.matches("[0-9]+"))//testing text to make sure its a number and not any letters
        {
            return true;// if it is return true
        }
        else
        {
            return false;// if not returns false
        }
    }

    public static String max30Chars(String max30){//passing in a String and calling it max30
        if (max30.length() <= 30){//testing if the length of the characters that is passed in and stored in max30 is less or equal to 30
            return max30;// return the string stored  in max30 characters
        }
        else{//otherwise
            return max30.substring(0,30);//return first 30 characters
        }
    }
    public static boolean validEmail(String email){ //passing in a String and calling it email
        if(email.contains("@") && email.contains(".")){ //testing to make sure that there is a "@" and a "." in an email e.g jbrophy@hotmail.com
            return true; //if there is both of these characters in the email return true
        }
        else//otherwise
        {
            return false;//if not returns false
        }
    }
    public static boolean validIntRange( int numCheck, int startVal, int endVal){
        if(numCheck >= startVal && numCheck <endVal){//if whatever is stored in numCheck is greater and equal to whatever the start value is and the numCheck is less than the size of the end value
            return true;//return true
        }
        else{//otherwise
            return false;//return false
        }
    }

    //checking valid party
    public static Party validParty(String partyName, PartyList partyList1 ){

            for (int i = 0; i < partyList1.numberOfParties();i++){//starting at 0 and goes as much as the no. of parties
                if (partyList1.getParty(i).getPartyName().equals(partyName)) //if
                    return partyList1.getParty(i);//return the elemet at i

            }
            return null;// if its not a valid party restore null
        }
        //use partyList1
        //looping through each element
        //check the partyName of the element against the partyName passed in
        //when matches return the Party element



    public static String validGenre(String validOrNot ) {
        if (validOrNot.equalsIgnoreCase("RIGHT") || validOrNot.equalsIgnoreCase("LEFT") || validOrNot.equalsIgnoreCase("EXTREME RIGHT") || validOrNot.equalsIgnoreCase("EXTREME LEFT") || validOrNot.equalsIgnoreCase("CENTRE") || validOrNot.equalsIgnoreCase("UNCATEGORISED")) {
            return validOrNot.toUpperCase();//if some of the letters are lowercase still return the uppercase either way
        } else {

            return "Unknown";//return unknown if any of the above hasn't been entered by the user
        }
    }
    public static String toProperCase (String capFirstChar) {// putting everything to lower case then putting the first letter of the word in uppercase

        String holder = capFirstChar.toLowerCase();

        holder = holder.substring(0,1).toUpperCase() + holder.substring(1);
        return holder;
    }

    public static int readNextInt(String prompt) {//it will intitate at least one time
        do {//do this
            var scanner = new Scanner(System.in);// trying to see if its an interger
            try {//it wil try to run this block and if you get an error the catch block will run
                System.out.print(prompt);//print out what stored in prompt
                return Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e) {
                System.err.println("\tEnter a number please.");
            }
        }  while (true);
    }

    /////////////////////////////// //
    public static boolean validIntNonNegative(int i) {
        if(i >= 0) {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean validIndex(int i, ArrayList<Mep> meps) {
        return true;
    }
}



