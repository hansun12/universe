public class Customer {

    private String name;
    private int ssn;
    private String address;
    private int rating;

    public Customer(String iname, int issn, String iaddress, int irating) {
        name = iname;
        ssn = issn;
        address = iaddress;
        rating = irating;
    }

    /*
     * getters (readers)
     */
    public String getName() {
        return name;
    }

    public int getSsn() {
        return ssn;
    }

    public String getAddress() {
        return address;
    }

    public int getRating() {
        return rating;
    }

    /*
     * setters (writers)
     */
    public void setName(String nname) {
        name = nname;
    }

    public void setAddress(String naddress) {
        address = naddress;
    }

    public void setRating(int nrating) {
        rating = nrating;
    }

    /*
     * Add other useful methods here
     */


    /*
     * I am omitting UseCustomer.java since this class is simple
     * enough and it is designed mainly to be composed into another
     * class.  If you feel the need to create UseCustomer.java to
     * test the implementation of this class, you would certainly
     * want to create UseCustomer.java with a main in it.
     */
}
