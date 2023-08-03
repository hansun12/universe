//hansun song
//114856519
public class Controller {
    private EmailHost[] eHosts;
    private int capacity;
    private int nextHost;

    public Controller(int capacity) {
        this.capacity = capacity;
        eHosts = new EmailHost[capacity];
        nextHost = 0;
    }

    public boolean registerHost(String hostName, EmailHost eHost) {
        if(nextHost >= capacity) {
            return false;
        }

        for(int i=0; i<nextHost; i++) {
            if(eHosts[i].gethostName().equals(hostName)) {
                return false;
            }
        }

        eHosts[nextHost++] = eHost;
        return true;
    }

    public EmailHost findHost(String hostName) {
        for(EmailHost e : eHosts) {
            if(e.gethostName().contains(hostName)) {
                return e;
            }
        }
        return new EmailHost("");
    }

    public EmailHost getHostFor(String email) {
        String eBits[] = email.split("[@]");
        if (eBits.length < 2) {
            System.out.println("Bad email address.");
            return new EmailHost("");
        }

        for(EmailHost e : eHosts) {
            if(e.gethostName().contains(eBits[1])) {
                return e;
            }
        }

        return new EmailHost("");
    }
}
