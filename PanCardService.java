package AadhaarCard_PanCard_Linking_Project;

import java.util.HashMap;
import java.util.Map;

public class PanCardService {
    private static Map<String,PanCard> panCardMap = new HashMap<>();
    static {
        panCardMap.put("ABCDE7410L", new PanCard("ABCDE7410L",
                "741001478520","SBI","ELSS,FD,Bonds"));

        panCardMap.put("ABCDE8520L",new PanCard("ABCDE8520L",
                "852002587419","HDFC","ELSS,FD,Gold"));
    }
    public PanCard getPanByAadhaarNumber(String aadhaarNumber){
        for(PanCard pan: panCardMap.values()){
            if(pan.getAadhaarNumber().equals(aadhaarNumber)){
                return pan;
            }
        }
        return null;
    }
}
