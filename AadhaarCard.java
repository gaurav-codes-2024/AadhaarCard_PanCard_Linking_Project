package AadhaarCard_PanCard_Linking_Project;

public class AadhaarCard {
    private String aadhaarNumber;
    private String name;
    private String fatherName;
    private String address;

    //constructor to access via object
    public AadhaarCard(String aadhaarNumber, String name, String fatherName, String address) {
        this.aadhaarNumber = aadhaarNumber;
        this.name = name;
        this.fatherName = fatherName;
        this.address = address;
    }
//doing this to get the output
    @Override
    public String toString() {
        return "AadhaarCard{" +
                "aadhaarNumber='" + aadhaarNumber + '\n' +
                ", name='" + name + '\n' +
                ", fatherName='" + fatherName + '\n' +
                ", address='" + address + '\n' +
                '}';
    }




    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



}
