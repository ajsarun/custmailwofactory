package customermailapplication;

public class CustomerFactory 
{
    public static Customer createCustomer(String type) 
    {
        if (type.equalsIgnoreCase("Regular")) { return new RegularCustomer();}
        else if (type.equalsIgnoreCase("Mountain")) { return new MountainCustomer();}
        else if (type.equalsIgnoreCase("Delinquent")) {return new DelinquentCustomer();}

        return null;

    }
}

