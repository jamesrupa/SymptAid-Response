package src;

public class Symptoms {

    // VARIABLES
    public boolean condition;
    //          TRUE == SEVERE          FALSE == NON-SEVERE
    public String result = "";


    public Symptoms() {

        // LIBRARY OF INFORMATION

        String[] EmergencySymptoms = {"cant breathe", "quick breaths",
                "short breaths","fatigue", "cold sweat", "chest pain",
                "stiff muscles", "blind", "blurred vision","double vision",
                "vertigo", "numb"};
        String[] UrgentSymptoms = {"blister", "swelling", "melting skin"};
        String[] MinorSymptoms = {"sneezing", "coughing", "cough", "sore throat"};

    }

    public boolean Severity() {
        if (condition) {
            return true;
        } else {
            return false;
        }
    }

    public String Result() {

        // NEEDS TO DETERMINE THE SEVERITY AND RETURN THAT RESULT

        result = "No Medical Attention Required";
        return result;
    }

}
