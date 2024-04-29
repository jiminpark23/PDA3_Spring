package member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    static Map<Integer, String> memberMap = new HashMap<>();

    MemberRepository() {
        for(int i=1;i<5;i++){
            memberMap.put(i, "work" + Integer.toString(i));
        }
    }

    public static String get1() {
        return memberMap.get(1);
    }
    public static String get2() {
        return memberMap.get(2);
    }
    public static String get3() {
        return memberMap.get(3);
    }
    public static String get4() {
        return memberMap.get(4);
    }

}
