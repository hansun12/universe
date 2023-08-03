//hansun song
//114856519
public class EmailHost {
    private int capacity = 100;
    private Message[] msgList;
    private int nextMessage;
    private String hostname;

    public EmailHost(String hostname) {
        this.hostname = hostname;
        this.msgList = new Message[capacity];
        this.nextMessage = 0;
    }
    
    public String gethostName() {
        return hostname;
    }

    public void send(Message msg) {
        if(nextMessage >= capacity) {
            System.out.print("message list full");
            return;
        }

        if(msg.getTo().contains(hostname)) {
            msgList[nextMessage++] = msg;
        }
        else {
            System.out.println("bad host");
        }
    }

    public Message[] getMessagesForUser(String userEmail) {
        int size = 0;
        for(int i=0; i<nextMessage; i++) {
            if(msgList[i].getTo().equals(userEmail)) {
                size++;
            }
        }

        System.out.println("Found " + size + " messages.");
        Message[] res = new Message[size];
        int index = 0;
        for(int i=0; i<nextMessage; i++) {
            if(msgList[i].getTo().equals(userEmail)) {
                res[index++] = msgList[i];
            }
        }

        return res;
    }
}
