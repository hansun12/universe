public class UseMessage {
    public static void main(String[] args) {
        //task 1
		Message msg1 = new Message();
		Message msg2 = new Message("song.hansun@stonybrook.edu", "songhs-0601@naver.com", "2023/5/5", true, "Greetings", "Hello! nice to meet you!");
		// System.out.println("msg1-from: " + msg1.getFrom());
		// System.out.println("msg1-to: " + msg1.getTo());
		// System.out.println("msg1-date: " + msg1.getDate());
		// System.out.println("msg1-receiptRequested: " + msg1.getReturnReceiptRequested());
		// System.out.println("msg1-subject: " + msg1.getSubject());
		// System.out.println("msg1-body: " + msg1.getBody());
		// System.out.println("========================================");
		// System.out.println("msg1-bodyLenth(getLength()) : " + msg1.getLength());
		
		// msg1.setTo("songhs-0601@naver.com");
		// msg1.setSubject("greetings and notice");
		// msg1.setBody("Hello! nice to meet you!");
		// msg1.setReturnReceiptRequested(true);
				
		// System.out.println("msg1-from: " + msg1.getFrom());
		// System.out.println("msg1-to: " + msg1.getTo());
		// System.out.println("msg1-date: " + msg1.getDate());
		// System.out.println("msg1-receiptRequested: " + msg1.getReturnReceiptRequested());
		// System.out.println("msg1-subject: " + msg1.getSubject());
		// System.out.println("msg1-body: " + msg1.getBody());
		// System.out.println("========================================");
		// System.out.println("msg1-bodyLenth(getLength()) : " + msg1.getLength());
		
		// System.out.println("msg2-from: " + msg2.getFrom());
		// System.out.println("msg2-to: " + msg2.getTo());
		// System.out.println("msg2-date: " + msg2.getDate());
		// System.out.println("msg2-receiptRequested: " + msg2.getReturnReceiptRequested());
		// System.out.println("msg2-subject: " + msg2.getSubject());
		// System.out.println("msg2-body: " + msg2.getBody());
		// System.out.println("========================================");
		// System.out.println("msg2-bodyLenth(getLength()) : " + msg2.getLength());
		
		// //task 2
		// msg2.setBody("It is too hot to hike and too cold to plunge.");
		// msg2.setSubject("deadline");
		// msg1.setSubject("deadline");

		// System.out.println(msg2.isImportant());
		// System.out.println(msg1.isImportant());
		
		// System.out.println("====================================");
		// msg1.print();
		
		// System.out.println(msg1.toString());
		
		Message[] messages = new Message[5];
		messages[0] = msg1;
		messages[1] = msg2;
		messages[2] = new Message("song.hansun@gmail.com", "songhs-0601@naver.com", "2023/1/1", true, "deadline", "Hello! nice to meet you!");
		messages[3] = new Message("song.hansun@naver.com", "example@naver.com", "2023/2/2", true, "notice", "Hello! nice to meet you@");
		messages[4] = new Message("song.hansun@daum.net", "example2@naver.com", "2023/3/3", true, "meeting", "Hello! nice to meet you#");
		
		System.out.println("==================================");
		for(Message i: messages) {
			i.print();
			System.out.println();
		}
		System.out.println("==================================");
		for(Message i: messages) {
			System.out.println(i.toString());
			System.out.println();
		}
		System.out.println("==================================");
		for(Message i: messages) {
			if(i.isImportant()) {
				System.out.println(i.toString());
				System.out.println();
			}
		}
	}
}
