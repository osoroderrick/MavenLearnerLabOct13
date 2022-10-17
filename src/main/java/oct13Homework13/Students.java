package oct13Homework13;

public final class Students extends People{

    private static final Students INSTANCE = new Students();

    private Students(){
       this.add(new Student(111l,"Durran",12));
       this.add(new Student(112l,"Emilia", 12));
       this.add(new Student(113l,"Henry",12));
       this.add(new Student(114l,"Isaiah", 12));
       this.add(new Student(115l,"Jared",12));
       this.add(new Student(116l,"Jazmin", 12));
       this.add(new Student(117l,"Joe",12));
       this.add(new Student(118l,"Kyle", 12));
       this.add(new Student(119l,"Memseletu",12));
       this.add(new Student(120l,"Miguel", 12));
       this.add(new Student(121l,"Omar",12));
       this.add(new Student(122l,"Shawn", 12));
       this.add(new Student(123l,"Tayyaba",12));
       this.add(new Student(124l,"Vanity", 12));
       this.add(new Student(125l,"Aquil",12));
       this.add(new Student(126l,"Karem", 12));

    }

    public static Students getInstance(){
        return INSTANCE;
    }
}
