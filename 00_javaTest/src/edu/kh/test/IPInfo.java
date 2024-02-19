package edu.kh.test;

/**
 * 컬렉션 List를 이용해 IP별 사용자를 관리하고, 
 * IP를 입력 받아 일치하는 사용자가 있는지 검색하는 
 * 코드를 작성하였으나
오류 발생 및 정상 수행되지 않았다

소스 코드를 분석하여 원인(문제점 + 발생 원인), 조치 내용(해결 방법 + 수정된 코드)을 작성하시오.

* IPInfo 클래스
 */
public class IPInfo {
	private String ip;
	private String user;
	
	public IPInfo() {}
	
	public IPInfo(String ip, String user) {
		this.ip = ip;
		this.user = user;
	}
	
	public String getIp() {
		return ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		return ip + " / " + user;
	}
	
	
	

}
