package leetcode;

public class Q1108_DefanginganIPAddress {

    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[\\.]");
    }
}
