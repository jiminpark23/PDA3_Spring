package member;

import java.lang.reflect.Member;

public class MemberDemoApp {
    public static void main(String[] args) {
        // 객체를 생성하는 용도로만 사용할 클래스 분리
        ObjectMaker objectMaker = new ObjectMaker();

        MemberRepository memberRepository = objectMaker.makeMemberRepository();
        MemberService memberService = objectMaker.makeMemberService();
        MemberController memberController = objectMaker.makeMemberController();

        System.out.println(MemberController.call1());;
    }
}

// 객체 지향의 분리
class ObjectMaker {
    MemberRepository memberRepository;
    MemberService memberService;
    MemberController memberController;

    // 필드, 생성자, 메소드
    MemberRepository makeMemberRepository() {
        if (memberRepository == null)
            memberRepository = new MemberRepository();

        return memberRepository;
    }

    MemberService makeMemberService() {
        if (memberService == null)
            memberService = new MemberService(makeMemberRepository());

        return memberService;
    }

    MemberController makeMemberController() {
        if (memberController == null)
            memberController = new MemberController(makeMemberService());

        return memberController;
    }
}