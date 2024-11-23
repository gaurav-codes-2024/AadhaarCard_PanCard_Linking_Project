package AadhaarCard_PanCard_Linking_Project;

import java.util.HashMap;
import java.util.Map;

public class AadhaarService {
    private static Map<String,AadhaarCard> aadhaarCardMap = new HashMap<>();
    static {
        aadhaarCardMap.put("741001478520",new AadhaarCard("741001478520",
                "Gaurav Thombare","Ganesh Thombare"," kurla"));

        aadhaarCardMap.put("852002587419",new AadhaarCard("852002587419",
                "Rohit Sharma","Rahul Sharma","Bandra"));
    }
    public AadhaarCard getAadhaarByNumber(String aadhaarNumber){
        return aadhaarCardMap.get(aadhaarNumber);
    }
}
