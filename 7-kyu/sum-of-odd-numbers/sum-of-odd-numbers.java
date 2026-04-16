class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
            int sumOfRow = 0;
            int sum = 1;
            int rows = 2;
            for(int i = 1; i < n; i++){
                for(int j = 1; j <= rows; j++){
                    sum += 2;
                    if(i == n -1){
                        sumOfRow += sum;
                    }
                }
                rows++;
            }
            return n > 1? sumOfRow : n;
        }
}