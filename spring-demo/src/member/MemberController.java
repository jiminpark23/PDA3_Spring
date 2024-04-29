package member;

public class MemberController {
    static MemberService memberService;

    MemberController(MemberService memberService) {
        MemberController.memberService = memberService;
    }

    static String call1() {
        return memberService.work1();
    }
    static String call2() {
        return memberService.work2();
    }
    static String call3() {
        return memberService.work3();
    }
    static String call4() {
        return memberService.work4();
    }
}
