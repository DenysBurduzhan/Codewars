class Persist {
     public static int persistence(long n) {
        String str = String.valueOf(n);
        int per = 1;
        if(str.length() == 1){
            return 0;
        }
        for(int i = 0; i < str.length(); i++){
            per *= Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return 1 + persistence(per);
    }
  }
​