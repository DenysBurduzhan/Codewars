int get_sum(int a , int b) {
    int sum = 0;
    if(a > b){
        int temp = a;
        a = b;
        b = temp;
    }
    for (int i = a; i <= b; i++) {
        if (a != b) {
            sum += i;
        } else {
            return a;
        }
    }
    return sum;
}