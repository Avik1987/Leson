public class Main {
    public static void main(String[] args) {
     Car mersedes=new Car();
     mersedes.setColor("black");
     mersedes.setEngine("V8");
     mersedes.setMark("best");
     mersedes.setModel("E-320");
     mersedes.setSeatplaces(4);
     Car BMW=new Car();
     BMW.setSeatplaces(4);
     BMW.setModel("BMW3");
     BMW.setMark("good");
     BMW.setColor("Red");
     BMW.setEngine("V7");

        System.out.print(mersedes.getColor()+" "+ mersedes.getMark() +" "+mersedes.getEngine()+ " "+mersedes.getModel());
        System.out.println();
        System.out.println(BMW.getColor()+ " "+ BMW.getMark()+" "+BMW.getEngine()+" "+BMW.getModel());


    }
}