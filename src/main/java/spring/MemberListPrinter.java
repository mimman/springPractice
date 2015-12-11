package spring;

import java.util.Collection;

public class MemberListPrinter {
	private MemberDao memberDao;
	private MemberPrinter printer;
	
	public MemberListPrinter(MemberDao memberDao, MemberPrinter memberPrinter){
		this.memberDao = memberDao;
		this.printer = memberPrinter;
	}
	
	public void selectAll(){
		
		Collection<Member> members = memberDao.selectAll();
		System.out.println("selectAll-dao 실행"+ "members 사이즈 : "+members.size());
		for(Member member : members){
			System.out.println(member.getEmail());
			printer.print(member);
		}
	}
}
