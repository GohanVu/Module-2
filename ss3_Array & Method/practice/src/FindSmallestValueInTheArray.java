public class FindSmallestValueInTheArray {
    public static void main(String[] args) {
        FindSmallestValueInTheArray findSmallestValueInTheArray = new FindSmallestValueInTheArray();
        int [] arrays = {4,12,7,8,1,6,9};
        int index = findSmallestValueInTheArray.smallestValue(arrays);
        System.out.println("Smallest value is : "+ arrays[index]+ " has position at: "+(index+1));
    }
    public int smallestValue(int [] array){
        int index = array [0];
        for (int i = 0; i < array.length; i++) {
                if (array[i]< array[index]){
                    index = i ;
                }
        }
        return  index;
    }
}
