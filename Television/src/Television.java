
public class Television {
	String tv_color;
	int tv_prize;
	int tv_inches;
	String tv_brand;
	int tv_warranty;
	String tv_type;
	int tv_weight;
	String tv_manufacture_place;
	int tv_age;
	String tv_model;

	public Television(String tv_color, int tv_prize, int tv_inches, String tv_brand, int tv_warranty, String tv_type,
			int tv_weight, String tv_manufacture_place, int tv_age, String tv_model) {
		super();
		this.tv_color = tv_color;
		this.tv_prize = tv_prize;
		this.tv_inches = tv_inches;
		this.tv_brand = tv_brand;
		this.tv_warranty = tv_warranty;
		this.tv_type = tv_type;
		this.tv_weight = tv_weight;
		this.tv_manufacture_place = tv_manufacture_place;
		this.tv_age = tv_age;
		this.tv_model = tv_model;
	}

	void on() {
		System.out.println("I purchased TV where its color is"+" "+tv_color+" with a prize of"+" "+tv_prize);
		System.out.println("i think its"+" "+tv_inches+" inches"+" "+"of brand"+" "+tv_brand);	
		System.out.println("where its"+" "+tv_warranty+" "+"years of warranty"+" "+"of type");
		System.out.println(tv_type+" "+"with weight of"+" "+tv_weight+" kgs"+" "+"its made in");
		System.out.println(tv_manufacture_place+" "+"and with age of"+" "+tv_age+" "+"years");
		System.out.println("of tv model"+" "+tv_model+" is on now");
	}
	void change_channel_tv() {
		System.out.println("i changed channels in"+" "+ tv_brand+" "+"brand tv");
	}
}
	


