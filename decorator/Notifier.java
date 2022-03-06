package decorator;

interface Notifier {
    public void notify(String message, String to);
}

class MailNotifier implements Notifier {
    @Override
    public void notify(String message, String to) {
        System.out.printf("sending mail to %s with message %s\n", to, message);
    }
}

abstract class NotifierDecorator implements Notifier {
    private Notifier wrappedObject;

    public NotifierDecorator(Notifier notifier) {
        this.wrappedObject = notifier;
    }

    @Override
    public void notify(String message, String to) {
        this.wrappedObject.notify(message, to);
    }
}

class SmsNotifier extends NotifierDecorator {

    public SmsNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void notify(String message, String to) {
        super.notify(message, to);
        this.sendSms(message, to);
    }

    private void sendSms(String message, String to) {
        System.out.printf("sending sms to %s with message %s\n", to, message);
    }
}

class SlackNotifier extends NotifierDecorator {
    public SlackNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void notify(String message, String to) {
        super.notify(message, to);
        this.sendSlackMsg(message, to);
    }

    private void sendSlackMsg(String message, String to) {
        System.out.printf("sending slack to %s with message %s\n", to, message);
    }
}
