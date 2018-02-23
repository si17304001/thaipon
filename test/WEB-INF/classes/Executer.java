package DBA;
import Bean.*;
import java.util.ArrayList;


public class Executer{
	public ArrayList<ThreadBean> getThread(){
		DBAccessor dba = new DBAccessor();
		return dba.getThread();
	}
	public ArrayList<ResBean> getRes(String tID){
		DBAccessor dba = new DBAccessor();
		return dba.getRes(tID);
	}
	public void writeThread(String Tname, String user){
		DBAccessor dba = new DBAccessor();
		if(user == null){
			dba.writeThread(Tname,"名無しさん");
		}else{dba.writeThread(Tname,user);}
	}
	public void writeRes(String rContent, String user, String id){
		DBAccessor dba = new DBAccessor();
		if(user == null){
			dba.writeRes(rContent, "名無しさん", id);
		}else{dba.writeRes(rContent,user,id);}
	}
	public void addAccount(String user, String pass){
		DBAccessor dba = new DBAccessor();
		dba.addAccount(user,pass);
	}
	public String getUser(String uname, String pass){
		DBAccessor dba = new DBAccessor();
		return dba.getUser(uname, pass);
	} 
	
	public void Like(String like){
		DBAccessor dba=new DBAccessor();
		dba.setLike(like);
	}
}