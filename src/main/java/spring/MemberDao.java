package spring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberDao {
	private static long nextId = 0;
	private Map<String, Member> map = new HashMap<String,Member>();
	
	public Member selectByEmail(String email){
		return map.get(email);
	}
	
	public void insert(Member member){
		member.setId(++nextId);
		map.put(member.getEmail(),member);
		System.out.println(member.getEmail()+member.getId()+member.getName()+member.getPassword()+member.getRegisterDate());
		
		
		
		
	}
	
	public void update(Member member){
		map.put(member.getEmail(),member);
	}
	
	public Collection<Member> selectAll(){
		System.out.println(map.size());
		return map.values();
	}
}
