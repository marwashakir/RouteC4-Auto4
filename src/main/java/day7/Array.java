package day7;

public class Array {
    public static void main(String[] args) {
        // Array != normal variable, it is a collection of variables of same data type

        // int x = 5, 10, 20
//
//        int[] arr = {1,2,3,4,5,6,7,8,9,10}; // non-primitive type
//
//        arr[9] = 11;
//         System.out.println(arr[3]); // 4
//
//         for(int i : arr)
//         {
//             System.out.println(i);
//         }
//
//         arr[10] = 5; // invalid -> out of bounds
//         arr[0] = 5.5; invalid -> incompatible types: possible lossy conversion from double to int

//        for(int i = 0; i < arr.length; i++)
//        {
//            System.out.println(arr[i]);
//        }
        LinearSearch obj = new LinearSearch();
        obj.search();

        TextProcess.countWords("Marwa Shakir Mohamed");
    }
}