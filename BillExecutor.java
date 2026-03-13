class BillExecutor{
	public static void main(String[]args){
		Bill bill = new Bill();
		bill.billId = 465;
		System.out.println("The Bill ID is : "+bill.billId);
		bill.billAmount = 5442.23;
		System.out.println("The Amount to be paid is : "+bill.billAmount);
		bill.billInvoice="H126";
		System.out.println("The Invoice: "+bill.billInvoice);
		bill.billIssueDate="02-03-2026";
		System.out.println("Issue Date: "+bill.billIssueDate);
		bill.billDueDate="03-04-2026";
		System.out.println("Due date: "+bill.billDueDate);
		bill.isbillOverDue=false;
		System.out.println("Is the bill OverDue: "+bill.isbillOverDue);
		bill.isLatestbill=true;
		System.out.println("Is this latest bill? "+bill.isLatestbill);
		bill.isFinalbill=true;
		System.out.println("Is this final bill? "+bill.isFinalbill);
	}
	
}