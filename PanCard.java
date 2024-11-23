package AadhaarCard_PanCard_Linking_Project;

public class PanCard {
    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public String getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    public String getInvestment() {
        return investment;
    }

    public void setInvestment(String investment) {
        this.investment = investment;
    }

    public PanCard(String panNumber, String aadhaarNumber, String bankDetails, String investment) {
        this.panNumber = panNumber;
        this.aadhaarNumber = aadhaarNumber;
        this.bankDetails = bankDetails;
        this.investment = investment;
    }

    @Override
    public String toString() {
        return "PanCard{" +
                "panNumber='" + panNumber + '\n' +
                ", aadhaarNumber='" + aadhaarNumber + '\n' +
                ", bankDetails='" + bankDetails + '\n' +
                ", investment='" + investment + '\n' +
                '}';
    }

    private String panNumber;
    private String aadhaarNumber;
    private String bankDetails;
    private String investment;
}
