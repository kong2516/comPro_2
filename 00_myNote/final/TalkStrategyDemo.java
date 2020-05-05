public class TalkStrategyDemo {
    public static void main(String[] args) {
        TalkFactory talkFactory = new TalkFactory();
        SaySomething said = talkFactory.getTalking(1);
        said.saySomething();
    }
}

class TalkFactory {
    public SaySomething getTalking(int num) {
        if (num == 1)
            return new Greetings();
        else if (num == 2) {
            return new GoodBye();
        } else
            return new Apology();
    }
}

interface SaySomething {
    void saySomething();
}

class Greetings implements SaySomething {
    @Override
    public void saySomething() {
        System.out.println("Hi");
    }
}

class GoodBye implements SaySomething {
    @Override
    public void saySomething() {
        System.out.println("Good bye");
    }
}

class Apology implements SaySomething {
    @Override
    public void saySomething() {
        System.out.println("Sorry");
    }
}