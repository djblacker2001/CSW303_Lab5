public class Permanent implements Contract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private int rentAmount;

    
    public Permanent(String contractID, String propertyID, String tenantID, int rentAmount) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.rentAmount = rentAmount;
        this.tenantID = tenantID;
    }

    
    public String getContractID(String contractID) {
        return contractID;
    }

    public String getPropertyID(String propertyID) {
        return propertyID;
    }

    public String getTenantID(String tenantID) {
        return tenantID;
    }

    public int getRentAmount(int rentAmount) {
        return rentAmount;
    }


    @Override
    public String toString() {
        return ("Permanent: "+"ContractID: "+contractID+"; PropertyID: "+propertyID 
        +"; TenantID: "+tenantID+ 
        "; RentAmount: " +rentAmount);
    }

    public Contract signContract() {
        Contract permanent = new Permanent(contractID, propertyID, tenantID, rentAmount);
        return permanent;
    }

    @Override
    public String getcontractID(String contractID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getpropertyID(String propertyID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String gettenantID(String tenantID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getrentAmount(int rentAmount) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
