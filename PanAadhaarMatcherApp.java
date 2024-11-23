package AadhaarCard_PanCard_Linking_Project;

import java.util.Scanner;

public class PanAadhaarMatcherApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AadhaarService aadhaarService = new AadhaarService();
        PanCardService panCardService = new PanCardService();

        System.out.println(" Enter the Aadhaar Number : ");
        String aadhaarNumber = sc.nextLine();

        AadhaarCard aadhaarCard = aadhaarService.getAadhaarByNumber(aadhaarNumber);
        PanCard panCard = panCardService.getPanByAadhaarNumber(aadhaarNumber);

        if(aadhaarCard!=null && panCard!=null){
            System.out.println("Aadhaar Details : "+aadhaarCard);
            System.out.println("PanCard Details : "+panCard);
        }
        else{
            System.out.println("No Match Found");
        }

    }
}
