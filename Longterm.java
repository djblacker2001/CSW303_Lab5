public class Longterm implements  Contract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private int rentAmount;

    
    public Longterm (String contractID, String propertyID, String tenantID, int rentAmount) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.rentAmount = rentAmount;
        this.tenantID = tenantID;
    }

    
    public String getContractID(String contractID) {
        this.contractID = contractID;
        return contractID;
    }

    public String getPropertyID(String propertyID) {
        this.propertyID = propertyID;
        return propertyID;
    }

    public String getTenantID(String tenantID) {
        this.tenantID = tenantID;
        return tenantID;
    }

    public int getRentAmount(int rentAmount) {
        this.rentAmount = rentAmount;
        return rentAmount;
    }


    @Override
    public String toString() {
        return ("Longterm: "+"ContractID: "+this.contractID+"; PropertyID: "+this.propertyID 
        +"; TenantID: "+this.tenantID+ 
        "; RentAmount: " +this.rentAmount);
    }

    public Contract signContract() {
        Contract longterm = new Longterm(this.contractID, this.propertyID, this.tenantID, this.rentAmount);
        return longterm;
    }


    @Override
    public String getcontractID(String contractID) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public String getpropertyID(String propertyID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getpropertyID'");
    }


    @Override
    public String gettenantID(String tenantID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'gettenantID'");
    }


    @Override
    public int getrentAmount(int rentAmount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getrentAmount'");
    }
}
