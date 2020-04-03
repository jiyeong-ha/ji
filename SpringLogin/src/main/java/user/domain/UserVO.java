package user.domain;

import java.util.Date;

public class UserVO {//회원가입 페이지에서 받아온 정보를 저장하기 위한 클래스

	private String userid;
	private String userpw;
	private String username;
	private String useremail;
	private Date userjoindate;
	private Date userloginDate;
	private String usersignature;
	private String userimg;
	private int userpoint;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public Date getUserjoindate() {
		return userjoindate;
	}
	public void setUserjoindate(Date userjoindate) {
		this.userjoindate = userjoindate;
	}
	public Date getUserloginDate() {
		return userloginDate;
	}
	public void setUserloginDate(Date userloginDate) {
		this.userloginDate = userloginDate;
	}
	public String getUsersignature() {
		return usersignature;
	}
	public void setUsersignature(String usersignature) {
		this.usersignature = usersignature;
	}
	public String getUserimg() {
		return userimg;
	}
	public void setUserimg(String userimg) {
		this.userimg = userimg;
	}
	public int getUserpoint() {
		return userpoint;
	}
	public void setUserpoint(int userpoint) {
		this.userpoint = userpoint;
	}
	@Override
	public String toString() {
		return "UserVO [userid=" + userid + ", userpw=" + userpw + ", username=" + username + ", useremail=" + useremail
				+ ", userjoindate=" + userjoindate + ", userloginDate=" + userloginDate + ", usersignature="
				+ usersignature + ", userimg=" + userimg + ", userpoint=" + userpoint + "]";
	}
	
}
