package src;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    public static String input;

    String[] EmergencySymptoms = {"cant breathe", "quick breaths",
            "short breaths","fatigue", "cold sweat", "chest pain",
            "stiff muscles", "blind", "blurred vision","double vision",
            "vertigo", "numb"};
    String EmergencyString = Arrays.toString(EmergencySymptoms)
            .replace("null", "").replace
            ("[","").replace(",","")
            .replace("]","").trim();
    String[] UrgentSymptoms = {"blister", "swelling", "melting skin"};
    String UrgentString = Arrays.toString(UrgentSymptoms)
            .replace("null", "").replace
            ("[","").replace(",","")
            .replace("]","").trim();
    String[] MinorSymptoms = {"sneezing", "coughing", "cough", "sore throat"};
    String MinorString = Arrays.toString(MinorSymptoms).replace("null",
            "").replace("[","")
            .replace(",","").replace("]","")
            .trim();

}
