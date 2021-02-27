package DataAccessLayer;

public class Address {
    Integer AddressID;
    Integer UnitNo;
    String Street;
    String Suburb;
    String City;
    String PhoneNo;

    public Address()
    {

    }

    public Address(Integer AddressID, Integer UnitNo, String Street, String Suburb, String City, String PhoneNo)
    {
        this.AddressID = AddressID;
        this.UnitNo = UnitNo;
        this.Street = Street;
        this.Suburb = Suburb;
        this.City = City;
        this.PhoneNo = PhoneNo;
    }
}
