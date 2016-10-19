package misc;

public class Donor
{
    String title;
    String firstName;
    String lastName;
    Float amount;
    
    public Donor(String title, String firstName, String lastName, Float amount) 
    {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.amount = amount;
    }

    public String getTitle()
    {
        return title;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public Float getAmount()
    {
        return amount;
    }
    
}