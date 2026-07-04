package p1;

public class CustDetails {
	
	public String custId;
	public String custName;
	
	public CustContact cc=new CustContact();
	
	public void getCustDetails() {
		System.out.println("======CustDetails=======");
		System.out.println("CustId : "+custId);
		System.out.println("custName :"+custName);
	}

}
