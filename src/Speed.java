public enum Speed {

    SLOW (30),
    NORMAL(90),
    FAST (150);

    private final int yourSpeed;


    private Speed (int yourSpeed){
        this.yourSpeed = yourSpeed;
    }

    public void printYourSpeed(){
        System.out.println("Poruszasz się z prędkością " + this.name() + ", która wynosi " + yourSpeed + " km/h");
    }

}
