package com.tns.inheritance;
class India{
	protected String lang="hindi";
	void displayNational() {
		System.out.println("National lang "+lang);
	}
	
}
 class Karnataka extends India {
	public String lang="kannada";
	void displayLocal() {
		System.out.println("Local lang "+lang);
	}

}
 
 class kerala extends India{
	public String lang="malyalum";
	void displayLocal() {
		System.out.println("Local lang "+lang);
}}