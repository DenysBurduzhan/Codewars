class Solution {
    public static String whoLikesIt(String... names) {
        StringBuilder builder = new StringBuilder();
        int length = names.length;
       if(length >= 4){
           builder.append(names[0]).append(", ").append(names[1]).append(" and ").append(length - 2).append(" others like this");
       } else if (length == 3) {
           builder.append(names[0]).append(", ").append(names[1]).append(" and ").append(names[2]).append(" like this");
       } else if (length == 2) {
           builder.append(names[0]).append(" and ").append(names[1]).append(" like this");
       } else if (length == 1) {
           builder.append(names[0]).append(" likes this");
       }else {
           builder.append("no one likes this");
       }
        return builder.toString();
    }
}