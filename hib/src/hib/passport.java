package hib;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "passport")
public class passport {
	private int ppid;
	private String ppnumber;
	private int ped;
	private person pers;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fkpid")
	public person getPers() {
		return pers;
	}

	public void setPers(person pers) {
		this.pers = pers;
	}

	@Id
	@GeneratedValue
	@Column(name = "ppid")
	public int getPpid() {
		return ppid;
	}

	public void setPpid(int ppid) {
		this.ppid = ppid;
	}

	@Column(name = "ppnumber")
	public String getPpnumber() {
		return ppnumber;
	}

	public void setPpnumber(String ppnumber) {
		this.ppnumber = ppnumber;
	}

	@Column(name = "ped")
	public int getPed() {
		return ped;
	}

	public void setPed(int ped) {
		this.ped = ped;
	}
}
