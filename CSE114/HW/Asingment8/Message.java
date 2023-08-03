//hansun song
//114856519
public class Message {
    private String from;
    private String to;
    private String date;
    private boolean returnReceiptRequested;
    private String subject;
    private String body;

    public Message() {
        from = "";
        to = "";
        date = "";
        returnReceiptRequested = false;
        subject = "";
        body = "";
    }

    public Message(String from, String to, String date, boolean returnReceiptRequested, String subject, String body) {
        this.from = from;
        this.to = to;
        this.date = date; 
        this.returnReceiptRequested = returnReceiptRequested;
        this.subject = subject;
        this.body = body;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getDate() {
        return date;
    }

    public boolean getReturnReceiptRequested() {
        return returnReceiptRequested;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }
    
    public int getLength() {
        return body.length();
    }
    
    
    public void setTo(String to) {
    	this.to = to;
    }
    
    public void setSubject(String subject) {
    	this.subject = subject;
    }
    
    public void setReturnReceiptRequested(boolean returnReceiptRequested) {
        this.returnReceiptRequested = returnReceiptRequested;
    }

    public void setFrom(String from) {
        this.from = from;
    }
    
    public void setDate(String date) {
        this.date = date;
    }

    public void setBody(String body) {
    	this.body = body;
    }
    
    public boolean isImportant() {
    	if(this.date.contains("2022")) {
    		if(this.subject.contains("notice")) {
    			return true;
    		}
    	
    		if(this.subject.contains("Meeting")) {
    			return true;
    		}
    	
    		if(this.subject.contains("deadline")) {
    			return true;
    		}
    	}
    	return false;
    }
    
    public void print() {
    	System.out.println(" From: " + from);
        System.out.println(" To: " + to);
        System.out.println(" Date: " + date);
        System.out.println(" ReturnReceiptRequested: " + returnReceiptRequested);
        System.out.println(" Subject: " + subject);
        System.out.println(" Length: " + getLength());
        System.out.println(" Body: " + body);
        System.out.println();
    }
    
    public String toString() {
        return "(" + from + ", " + to + ", " + subject + ")";
    }
}