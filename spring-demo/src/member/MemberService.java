package member;

public class MemberService {
    static MemberRepository memberRepository;

    MemberService(MemberRepository memberRepository) {
        MemberService.memberRepository = memberRepository;
    }

    String work1() {
        return memberRepository.get1();
    }

    String work2() {
        return MemberRepository.get2();
    }

    String work3() {
        return MemberRepository.get3();
    }

    String work4() {
        return MemberRepository.get4();
    }
}
