package hib;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class person {
	private int pid;
	private String pname;
	private int page;
	private passport pt;
	
	private List<course> cou;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="percourse")
	@JoinColumn(name="fkpid")
	public List<course> getCou() {
		return cou;
	}

	public void setCou(List<course> cou) {
		this.cou = cou;
	}

	private List<mobile> mobb;
@OneToMany(mappedBy = "per", cascade = CascadeType.ALL)
	public List<mobile> getMobb() {
		return mobb;
	}

	public void setMobb(List<mobile> mobb) {
		this.mobb = mobb;
	}

	@Id
	@GeneratedValue
	@Column(name="pid")
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	@Column(name = "pname")
	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Column(name = "page")
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	@OneToOne(mappedBy = "pers", cascade = CascadeType.ALL)
	public passport getPt() {
		return pt;
	}

	public void setPt(passport pt) {
		this.pt = pt;
	}

}
