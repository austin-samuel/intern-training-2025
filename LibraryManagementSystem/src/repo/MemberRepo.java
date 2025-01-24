package repo;
import model.Member;

import java.util.HashMap;

public class MemberRepo extends Member {
    private static HashMap<Integer, Member> memberMap = new HashMap<>();

    // memberId as key
    // fetch all member details
    public static Member getMember(int memberId) {
        // apply try and catch if not found memberId
        return memberMap.get(memberId);
    }

    public static void addMember() {

    }
}
