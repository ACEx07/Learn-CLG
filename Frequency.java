public class Frequency {  
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};
        int [] fr = new int [arr.length];  
        int t = -1;
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;
                    fr[j] = t;  
                }  
            }  
            if(fr[i] != t)  
                fr[i] = count;  
        }  
        System.out.println("Element Frequency:");
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != t)  
                System.out.println("    " + arr[i] + "    |    " + fr[i]);  
        }  
    }
}