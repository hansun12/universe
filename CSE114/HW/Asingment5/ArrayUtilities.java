package CSE114.HW.Asingment5;


public class ArrayUtilities {

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + ", ");
        System.out.println();
    }
    
    public static boolean occursIn(int[] array, int findMe) {
        // linear search => binary search
        for(int i = 0; i < array.length; i++) {
            if(array[i] == findMe) {
                return true;
            }
        }
        return false;
    }
    //git tesssssssst
    public static int[] mergeIntArrays(int[] list1, int[] list2) {
        int[] res = new int[list1.length + list2.length];
        int index = 0;
        
        // list1과 list2 concatenate
        for(int i = 0; i < list1.length; i++) res[index++] = list1[i];
        for(int i = 0; i < list2.length; i++) res[index++] = list2[i];

        // select sort => quick sort
        for(int i = 0; i < res.length - 1; i++){
            for(int j = i+1; j < res.length; j++) {
                if(res[i] > res[j]) {
                    int temp = res[i];
                    res[i] = res[j];
                    res[j] = temp;
                }
            }
        }

        printArray(res);
        return res;
    }

    public static int[] eliminateDuplicates(int[] inArray) {
        int dup = 0;
        for(int i = 0; i < inArray.length-1; i++){
            for(int j = i+1; j < inArray.length; j++){
                if(inArray[i] == inArray[j]) {
                    dup++;
                    break;
                }
            }
        }

        int[] res = new int[inArray.length - dup];
        int index = 0;
        for(int i = 0; i < inArray.length; i++) {
            boolean flag = false;
            
            // 중복성 검사 : 중복이 있으면 flag = true
            for(int j = 0; j < res.length; j++) {
                if(res[j] == inArray[i]) {
                    flag = true;
                    break;
                }
            }
            
            // 중복된 값이 없었을 경우
            if(!flag) res[index++] = inArray[i];
        }

        printArray(res);
        return res;
    }
    public static void main(String[] args) {
        int[] myIntegerArray = {1, 2, 4, 6, 1, 5, 4, 2, 7};
        eliminateDuplicates(myIntegerArray); // {1, 2, 4, 6, 5, 7}

        int[] list1 = {1, 10, 17, 101, 171, 201, 214};
        int[] list2 = {2, 3, 4, 12, 13, 21, 211, 512, 1024};
        mergeIntArrays(list1, list2);
    }
}
