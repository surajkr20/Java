package BitManipulations;

// 832. Flipping an Image
// Explanation :- Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.To flip an image horizontally means that each row of the image is reversed.

public class flipImage {
    public static void main(String[] args) {
        
    }

    static int[][] flipAndInvertImage(int[][] image){
        for(int[] row: image){
            // reverse the array
            for(int i=0; i< (image[0].length + 1)/2; i++){
                // swap
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;
            }
        }
        return image;
    }
}
