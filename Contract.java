public interface Contract {
    public String getcontractID(String contractID);
    public String getpropertyID(String propertyID);
    public String gettenantID(String tenantID);
    public int getrentAmount(int rentAmount);
    public Contract signContract();
}
