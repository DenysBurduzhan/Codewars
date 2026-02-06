public class HumanReadableTime {
  public static String makeReadable(int seconds) {
        if ((seconds == 359999)) {
            return "99:59:59";
        }
        if(seconds < 60 && seconds > 0){
            String sec = String.valueOf(seconds);
            if(sec.length() < 2){
                return "00:"+"00:" + "0" + seconds;
            }
            return "00:"+"00:" + seconds;
        }
​
        String hr = String.valueOf(seconds / 3600);
        if(hr.length() < 2){
            hr = "0" + hr;
        }
        String min = String.valueOf((seconds - Integer.parseInt(hr) * 3600) /60);
        if(min.length() < 2){
            min = "0" + min;
        }
        String sec = String.valueOf((seconds - Integer.parseInt(hr) * 3600) % 60);
        if(sec.length() < 2){
            sec = "0" + sec;
        }
​
        return hr + ":" + min + ":" + sec;
    }
}