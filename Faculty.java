package package1;

class Faculty extends Employee {
	private boolean status;
	
	
	public void setStatus(char t) {
		if(t == 'Y') {
			this.status = true;
		}
		else {
			this.status = false;
		}
	}
	public boolean isRegular() {
		return status;
	}
	
}
