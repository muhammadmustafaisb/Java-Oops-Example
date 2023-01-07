package javasecond;

interface Books{
	
	public abstract void BookName();
	public abstract void AuthorName();
	public abstract void BookPrice();
	
}


class Fictional implements Books{

	private String type;
	private String page;
	private String agetype;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {

		this.type = type;
	}

	public String getPage() {
		
		return page;
	}

	public void setPage(String page) {
		
		this.page = page;
	}

	public String getAgetype() {
		
		return agetype;
	}

	public void setAgetype(String agetype) {
		
		this.agetype = agetype;
	}

	
	@Override
	public void BookName() {
		// TODO Auto-generated method stub
		System.out.println("Fictional Book");
	}

	@Override
	public void AuthorName() {
		// TODO Auto-generated method stub
		System.out.println("James");
	}

	@Override
	public void BookPrice() {
		// TODO Auto-generated method stub
		System.out.println("Price = $-999");
	}
	
	
}


class NonFictional implements Books{

	private String type;
	private String page;
	private String agetype;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getAgetype() {
		return agetype;
	}

	public void setAgetype(String agetype) {
		this.agetype = agetype;
	}

	
	@Override
	public void BookName() {
		// TODO Auto-generated method stub
		System.out.println("Non Fictional");
	}

	@Override
	public void AuthorName() {
		// TODO Auto-generated method stub
		System.out.println("Tom");
		
	}

	@Override
	public void BookPrice() {
		// TODO Auto-generated method stub
		System.out.println("Price = $-499");
	}
	
}


public class Second {

	public static void main(String[] args) {

		Fictional type2 = new Fictional();
		type2.AuthorName();
		type2.BookName();
		type2.BookPrice();
		
		type2.setType("Horror");
		type2.setPage("Pages = 249");
		type2.setAgetype("Adult");
		
		System.out.println(type2.getType());
		System.out.println(type2.getPage());
		System.out.println(type2.getAgetype());
		
		NonFictional type1 = new NonFictional();
		type1.AuthorName();
		type1.BookName();
		type1.BookPrice();
		
		type1.setType("Non Horror");
		type1.setPage("Pages = 399");
		type1.setAgetype("Non Adult");
		
		System.out.println(type1.getType());
		System.out.println(type1.getPage());
		System.out.println(type1.getAgetype());
		
	}
}		