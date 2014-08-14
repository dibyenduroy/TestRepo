package scjp;

class Clidder {
private final void flipper() { System.out.println("Clidder"); }
}
public class Clidlet extends Clidder {
public final void flipper() { System.out.println("Clidlet"); }
public static void main(String [] args) {
new Clidlet().flipper();
}




}


class AgedP {

public AgedP(int x) {
super();
}
}
public class Kinder extends AgedP {

public Kinder(int x) {
super(x);
}
}
