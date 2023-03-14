package com.khadri.hibernate.combo.list.set;

import java.util.List;
import java.util.Set;

public class Phone {

	private int phnId;
	private String phnName;
	private List<String> phnApps;
	private Set<String> phnNumbers;

	public int getPhnId() {
		return phnId;
	}

	public void setPhnId(int phnId) {
		this.phnId = phnId;
	}

	public String getPhnName() {
		return phnName;
	}

	public void setPhnName(String phnName) {
		this.phnName = phnName;
	}

	public List<String> getPhnApps() {
		return phnApps;
	}

	public void setPhnApps(List<String> phnApps) {
		this.phnApps = phnApps;
	}

	public Set<String> getPhnNumbers() {
		return phnNumbers;
	}

	public void setPhnNumbers(Set<String> phnNumbers) {
		this.phnNumbers = phnNumbers;
	}

}
