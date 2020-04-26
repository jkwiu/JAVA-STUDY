package ch5;

/**
 * 배열의 복사
 */
public class CopyOfArr {
    
    public static void main(String[] args) {
        // 반복문을 이용한 복사
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[arr1.length];
        
    
        for(int i=0; i<arr1.length; i++){
            arr2[i] = arr1[i];
        }

        // System.arraycopy()를 이용한 복사
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
    }


}