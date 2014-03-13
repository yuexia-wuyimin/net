package basicbean;

public class Location {
	private String username;
	private String latitude;
	private String longitude;
	private String invitedName;
	private String agreeinvite;
	private boolean agreeInviteBool;
	private int beadded;
	public String getAgreeInvite(){
		return agreeinvite;
	}
	public void setAgreeInvite(String agreeinvite){
		this.agreeinvite=agreeinvite;
	}
	public int getBeadded(){
		return beadded;
	}
	public void setBeadded(int beadded){
		this.beadded = beadded;
	}
	public boolean getAgreeInviteBool(){
		return agreeInviteBool;
	}
	public void setAgreeInvite(boolean agreeInviteBool){
		this.agreeInviteBool=agreeInviteBool;
	}
	public String getInvitedName(){
		return invitedName;
	}
	public void setInvitedName(String invitedName){
		this.invitedName =invitedName;
	}
	public String getUsername(){
		return username;
	}
	public void setUsername(String username){
		this.username =username;
	}
	public String getLatitude(){
		return latitude;
	}
	public void setLatitude(String latitude){
		this.latitude=latitude;
	}
	public String getLongitude(){
		return longitude;
	}
	public void setLongitude(String longitude){
		this.longitude=longitude;
	}
	public Location(String username,boolean agreeInviteBool,String invitedName){
		super();
		this.username=username;
		this.agreeInviteBool=agreeInviteBool;
		this.invitedName = invitedName;
	}
	
	public Location(String username,String invitedName,String latitude,String longitude,String agreeinvite,int beadded){
		super();
		this.username = username;
		this.invitedName = invitedName;
		this.latitude=latitude;
		this.longitude=longitude;
		this.agreeinvite = agreeinvite;
		this.beadded = beadded;
		
	}
	public Location(String latitude,String longitude){
		super();
		this.latitude=latitude;
		this.longitude=longitude;
	}
	public Location(String username,String latitude,String longitude){
		super();
		this.username=username;
		this.latitude=latitude;
		this.longitude=longitude;
	}
	public Location(String username,String latitude,String longitude,String invitedName){
		super();
		this.username = username;
		this.latitude=latitude;
		this.longitude=longitude;
		this.invitedName = invitedName;
		
	}
	public Location(){
		super();
	}

}
