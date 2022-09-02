package customermailapplication;

public class CustomerFactory 
{
    public static Customer createCustomer(String type) 
    {
        if (type.equalsIgnoreCase("Regular")){ return new RegularCustomer();}
        else if (type.equalsIgnoreCase("Mountain")) { return new MountainCustomer();}
        else if (type.equalsIgnoreCase("Delinquent")) {return new DelinquentCustomer();}

        return null;

    }

    private Customer customer;
    public void getCustomerTypeFromUser(String customerType) {
        switch(customerType) {
            case "Regular":
                customer = new RegularCustomer();
                break;
            case "Mountain":
                customer = new MountainCustomer();
                break;
            case "Delinquent":
                customer = new DelinquentCustomer();
                break;
        }
    }
    public String generateMail() {
        return customer.createMail();
    }
}

