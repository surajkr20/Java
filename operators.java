
public class operators {
    public static void main(String[] args){
        int x = 1;
        int y = 6;

        // conditions
        if(x>y){
            System.out.println("hello");
        }else{
            System.out.println("byy byy");
        }

        // ternary operators
        boolean result = x<y ? true : false;
        System.out.println(result);

        switch (x) {
            case 1:
                System.out.println("Sunday");
            case 2:
                System.out.println("Monday");
            case 3:
                System.out.println("Tuesday");
            case 4:
                System.out.println("Wednesday");
            case 5:
                System.out.println("Thursday");
            case 6:
                System.out.println("Friday");
            case 7:
                System.out.println("Saturday");
            
        }
    }
}
