package edu.nwpu.rjwdz.chainofresponsibility;

/**
 * Created by lovywinsy on 2017/1/22.
 */
public class FaxErrorHandler implements IReceiver {
    private IReceiver nextReceiver;

    public FaxErrorHandler(IReceiver nextReceiver) {
        this.nextReceiver = nextReceiver;
    }

    @Override
    public boolean processMessage(Message msg) {
        if (msg.text.contains("Fax")) {
            System.out.println("FaxErrorHandler processed " + msg.priority + "priority issue: " + msg.text);
            return true;
        } else {
            if (null != nextReceiver) {
                nextReceiver.processMessage(msg);
            }
        }
        return false;
    }
}
