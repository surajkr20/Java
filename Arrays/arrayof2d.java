package Arrays;

public class arrayof2d {
    public static void main(String[] args){
        // // multi-dimensional array

        // // declaration of 2d array
        // int num[][] = new int[3][3];

        // // i = no of rows and, j = no of collumns

        // for(int i=0; i<3; i++){ // first loops is print rows
        //     for(int j=0; j<3; j++){ // collumns
        //         num[i][j] = (int) (Math.random() * 10); // it's generate random no's
        //         System.out.print(num[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        int nums[][] = new int[3][];  
        // jagged array - it means collumns size not fixed, it's depends on you

        nums[0] = new int[3];
        nums[1] = new int[1];
        nums[2] = new int[2];
        
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; i++){
                nums[i][j] = (int)(Math.random() * 10);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    }
}
