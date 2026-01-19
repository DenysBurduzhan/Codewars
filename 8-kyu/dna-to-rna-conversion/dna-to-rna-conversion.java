public class Bio {
    public String dnaToRna(String dna) {
        String[] str = dna.split("");
        StringBuilder builder = new StringBuilder();
        for(String t : str){
            if(t.equals("T")){
                builder.append("U");
            }else{
                builder.append(t);
            }
        }
        return builder.toString();  // Do your magic!
    }
}