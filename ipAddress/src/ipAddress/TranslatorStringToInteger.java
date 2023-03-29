package ipAddress;

public class TranslatorStringToInteger {
    public static long ipFromStringToInt(String ipAddress){
        String[] ipAddressStringToInteger = ipAddress.split("\\.");
        long result = 0;
        for (int i = 0; i < ipAddressStringToInteger.length; i++) {
            long ip = Integer.parseInt(ipAddressStringToInteger[i]);
            result = result << 8 ;
            result |= ip;
        }
        return result;
    }
    public static String ipFromIntToString(long ipAddress){
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i <= 3; i++) {
            result.insert(0, ipAddress % 256);
            if (i < 3){
                result.insert(0, '.');
            }
            ipAddress /= 256;
        }
        return result.toString();
    }
}
