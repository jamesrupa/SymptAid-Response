package src;

public class Symptoms {

    // VARIABLES
    public boolean condition;
    //          TRUE == SEVERE          FALSE == NON-SEVERE
    public String displayNONSEV, displaySEV = "";


    public Symptoms() {

    }

    public String Display() {

        displaySEV = "URGENT";
        displayNONSEV = "IF NEEDED";

        if (condition) {
            return displaySEV;
        } else {
            return displayNONSEV;
        }

    }

}
