class Test {
    public static void main(String args[]){
        int sum = 9;
        int[] arr = {1,2,3,4,5};
        for(int i = 0; i <arr.length - 1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == sum){
                    System.out.print(i + " and " + j);                }
            }
        }
    }
}