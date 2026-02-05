public class RgbToHex {
​
    public static String rgb(int r, int g, int b) {
        return convert(r) + convert(g) + convert(b);
    }
    public static String convert(int i){
        StringBuilder rgb = new StringBuilder();
        if(i > 255){
            return "FF";
        } else if (i <= 0) {
            return "00";
        }
        String str = "ABCDEF";
        int i0_parts = i / 16;
        int i0_remain = i - i0_parts * 16;
        if(i0_parts >= 10){
            if(i0_parts == 15){
                rgb.append("F");
            }else{
                int f = i0_parts - 10;
                rgb.append(str.charAt(f));
            }
        }else if (i0_parts < 10){
            rgb.append(i0_parts);
        }
        if(i0_remain >= 10){
            if(i0_remain == 15){
                rgb.append("F");
            }else{
                int f = i0_remain - 10;
                rgb.append(str.charAt(f));
            }
        }else if (i0_remain < 10){
            rgb.append(i0_remain);
        }
​
        return rgb.toString();
    }
}
​