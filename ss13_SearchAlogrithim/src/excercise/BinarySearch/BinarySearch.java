package excercise.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int [] list = {2,4,5,10,11,45,50,59,60,66,69,70,79};
        int key = 10;
        System.out.println(find(list,key));
        System.out.println(find(list,50));
    }
    private static int find (int [] list, int key){
        int left = 0;
        int right = list.length -1;
        int mid ;
        while (left <= right){
            mid = (left+right)/2;
            if(key < list[mid]){
                right = mid -1;
            } else if (key == list[mid]){
                return mid;
            } else {
                left = mid +1 ;
            }
        }
        return -1;
    }
}
