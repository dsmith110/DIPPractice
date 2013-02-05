package dippractice;

public class MessageService {
    
//    private static final String MSG = "Hello";
    private OutputStrategy out;
    private InputStrategy in;
//    private String msg;
    
    public MessageService(OutputStrategy out, InputStrategy in) {
        this.out = out;
        this.in = in;
    }
    
    public void outputMessage() {
//        this.inputMessage();
        out.outputMessage(in.inputMessage());
    }
    
//    private void inputMessage() {
//        msg = in.inputMessage();
//    }
}
