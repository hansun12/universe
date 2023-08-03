package CSE114.HW.Asingment5;

public class chatTest {

        public static void printArray(int[] array) {
            for(int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    
        public static int[] eliminateDuplicates(int[] inArray) {
            int[] outArray = new int[inArray.length];
            int outIndex = 0;
    
            for(int i = 0; i < inArray.length; i++) {
                boolean isDuplicate = false;
    
                for(int j = 0; j < outIndex; j++) {
                    if(inArray[i] == outArray[j]) {
                        isDuplicate = true;
                        break;
                    }
                }
    
                if(!isDuplicate) {
                    outArray[outIndex] = inArray[i];
                    outIndex++;
                }
            }
    
            int[] result = new int[outIndex];
            for(int i = 0; i < outIndex; i++) {
                result[i] = outArray[i];
            }
    
            return result;
        }
    }
    

