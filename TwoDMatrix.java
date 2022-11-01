public class TwoDMatrix {
    public static void main(String[] args) {
        int [][]matrix= new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        int m = matrix.length;
        int n = matrix[0].length,k=0;
        int []arr = new int[m*n];
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                arr[k]=matrix[i][j];
                k++;
            }
        }
        int l =m*n;
        int beg=0,end=l-1;
        boolean result = binarySearch(arr, beg,end,target);
        System.out.println(result);
    }


        public static boolean binarySearch(int []arr, int beg, int end, int target){
            if(beg<=end){
                int mid=beg+(end-beg)/2;
                if(arr[mid]==target){
                    return true;
                }
                else if(arr[mid]>target){
                    return binarySearch(arr,beg,mid-1,target);
                }
                else{
                    return binarySearch(arr,mid+1,end,target);
                }
            }
            return false;
        }


}
