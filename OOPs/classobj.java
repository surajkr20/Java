package OOPs;

class Computer {
    public void musicPlay() {
        System.out.println("music playing....");
    }

    public String getMePen(int cost) {
        if(cost>=10){
            return "pen";
        }else return "nothing";
    }
}

public class classobj {
    public static void main(String[] args) {
        Computer use = new Computer(); // use is a reference variable

        use.musicPlay();
        String str = use.getMePen(0);
        System.out.println(str);
    }

}
