public class PigLatin {
    public static String pigIt(String str) {
        StringBuilder builder = new StringBuilder();
        String[] pig = str.split(" ");
        for(int i = 0; i < pig.length; i++){
            String[] word = pig[i].split("");
            for(int f = 0; f < word.length; f++){
                if (!word[f].matches("[a-zA-Z]")) {
                    builder.append(word[f]);
                }else{
                    if(f+1 == word.length){
                        if(i == pig.length -1){
                            builder.append(word[0]).append("ay");
                        }else{
                            builder.append(word[0]).append("ay").append(" ");
                        }
                    }else{
                        builder.append(word[f+1]);
                    }
                }
            }
​
        }
​
        return builder.toString();
    }
}