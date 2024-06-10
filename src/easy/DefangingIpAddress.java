package src.easy;

import java.util.HashMap;

public class DefangingIpAddress {
    public String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < address.length(); i++){
            if(address.charAt(i) == '.'){
                result.append("[.]");
            }else {
                result.append(address.charAt(i));
            }
        }
        return result.toString();
    }

    public String defangIPaddrBetter(String address) {
        String modified = address.replace(".", "[.]");
        return modified;
    }
}
