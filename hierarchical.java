class Mammal{
    public void display(){
        System.out.println("A mammal");


    }
}

public class Lion extends Mammal{
    public void details() {
        System.out.println("Lion is a mammal");

    }
}

public class Tiger extends Mammal {
    public void show() {
        System.out.println("Tiger is a mammal");

    }
    public static void main(String[] args) {
        Lion input=new Lion();
        input.display();
        input.details();


        Tiger done=new Tiger();
        done.show();
        done.display();


    }
}
