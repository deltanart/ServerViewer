package model;

//DB Test Object
public class Server {
	
	private String
		str_host,
		str_user,
		str_password,
		servername,
		bezeichnung,
		ip,
		os
		
	;
	private Integer
		int_id,
		int_port = 22
	;
	
	private Boolean enabled;
	
	public static Server getServerById(Integer int_id) {
		return new Server(int_id);
	}
	
	public Server() {
		
	}
	
	public Server(Integer int_id) {
		this
			.setId(int_id)
			.load()
		;
	}
	
	public Server load() {
		//TODO get data from DB
		
		switch(this.getId()) {
		case 1:
			this
				.setHost("161.97.73.151")
				.setUser("test")
				.setPassword("+-X+g#zDNeHYe!:F")
			;
			break;
		case 2:
			this
				.setHost("144.91.125.174")
				.setUser("astest")
				.setPassword("=X(efR_#_zwj9wZ{")
			;
			break;
		}
		
		return this;
	}
	
	public Server save() {
		//TODO save data to DB
		return this;
	}
	
	public Integer getId() {
		return this.int_id;
	}
	public Server setId(Integer int_id) {
		this.int_id = int_id;
		return this;
	}
	
	public Integer getPort() {
		return this.int_port;
	}
	public Server setPort(Integer int_port) {
		this.int_port = int_port;
		return this;
	}
	
	public String getHost() {
		return this.str_host;
	}
	public Server setHost(String str_host) {
		this.str_host = str_host;
		return this;
	}
	
	public String getUser() {
		return this.str_user;
	}
	public Server setUser(String str_user) {
		this.str_user = str_user;
		return this;
	}
	
	public String getPassword() {
		return this.str_password;
	}
	public Server setPassword(String str_password) {
		this.str_password = str_password;
		return this;
	}
	
	
	public String getServername() {
		return servername;
	}

	public void setServername(String servername) {
		this.servername = servername;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getHash() {
		return
			this.getHost() + "|"
			+ this.getPassword() + "|"
			+ this.getUser() + "|"
			+ Integer.toString(this.getId()) + "|"
			+ Integer.toString(this.getPort())
		;
	}
}