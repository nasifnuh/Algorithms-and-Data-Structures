public class ThreeSum {
    public static int count(int[] array){
        int count =0;
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                for(int k=j+1; k<array.length; k++){
                    if (array[i]+array[j]+array[k] == 0){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int array[] = {-40, 20, 20,0};
        System.out.println(ThreeSum.count(array));
    }
}
