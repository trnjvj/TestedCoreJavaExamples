import java.io.*;
import java.net.*;
import java.util.*;

class BitDemo {
    public static void main(String[] args) {
        int bitmask = 0x000F;
        int val = 0x2222;  
        System.out.println(val & bitmask);
    }
}
