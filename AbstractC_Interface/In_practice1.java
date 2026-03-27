package AbstractC_Interface;

// MULTIPLE INTERFACE IMPLEMENTATION ------------------
interface Rechargeable {
    void recharge();
}

interface Trackable {
    void trackLocation();
}

class SmartWatch implements Rechargeable, Trackable {
    @Override
    public void recharge() {
        System.out.println("I used to be recharged :)");
    }

    @Override
    public void trackLocation() {
        System.out.println("I can check location!!");
    }
}

class BasicWatch {
    void showTime() {
        System.out.println("Time is 8 pm");
    }
}

public class In_practice1 {
    public static void main(String[] args) {
        Rechargeable r1 = new SmartWatch();
        Trackable t1 = new SmartWatch();

        r1.recharge();
        t1.trackLocation();

        BasicWatch b = new BasicWatch();
        b.showTime();
    }
}
