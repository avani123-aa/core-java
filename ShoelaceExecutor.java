class ShoelaceExecutor{
public static void main(String[] args){

Shoelace s1=new Shoelace();
s1.brand="Nike";
s1.colour="Black";
s1.material="Cotton";
s1.length=120;
s1.width=0.5;
s1.type="Sports";
s1.shape="Flat";
s1.elastic=false;
s1.price=150;
s1.originCountry="USA";

System.out.println(s1.brand);
System.out.println(s1.colour);
System.out.println(s1.material);
System.out.println(s1.length);
System.out.println(s1.width);
System.out.println(s1.type);
System.out.println(s1.shape);
System.out.println(s1.elastic);
System.out.println(s1.price);
System.out.println(s1.originCountry);


Shoelace s2=new Shoelace();
s2.brand="Adidas";
s2.colour="White";
s2.material="Polyester";
s2.length=110;
s2.width=0.4;
s2.type="Casual";
s2.shape="Round";
s2.elastic=false;
s2.price=120;
s2.originCountry="Germany";

System.out.println(s2.brand);
System.out.println(s2.colour);
System.out.println(s2.material);
System.out.println(s2.length);
System.out.println(s2.width);
System.out.println(s2.type);
System.out.println(s2.shape);
System.out.println(s2.elastic);
System.out.println(s2.price);
System.out.println(s2.originCountry);


Shoelace s3=new Shoelace();
s3.brand="Puma";
s3.colour="Red";
s3.material="Nylon";
s3.length=115;
s3.width=0.45;
s3.type="Running";
s3.shape="Flat";
s3.elastic=true;
s3.price=140;
s3.originCountry="Germany";

System.out.println(s3.brand);
System.out.println(s3.colour);
System.out.println(s3.material);
System.out.println(s3.length);
System.out.println(s3.width);
System.out.println(s3.type);
System.out.println(s3.shape);
System.out.println(s3.elastic);
System.out.println(s3.price);
System.out.println(s3.originCountry);


Shoelace p1=new Shoelace("Nike","Black","Cotton",120,0.5,"Sports","Flat",false,150,"USA");
System.out.println(p1.brand);
System.out.println(p1.colour);
System.out.println(p1.material);
System.out.println(p1.length);
System.out.println(p1.width);
System.out.println(p1.type);
System.out.println(p1.shape);
System.out.println(p1.elastic);
System.out.println(p1.price);
System.out.println(p1.originCountry);


Shoelace p2=new Shoelace("Adidas","White","Polyester",110,0.4,"Casual","Round",false,120,"Germany");
System.out.println(p2.brand);
System.out.println(p2.colour);
System.out.println(p2.material);
System.out.println(p2.length);
System.out.println(p2.width);
System.out.println(p2.type);
System.out.println(p2.shape);
System.out.println(p2.elastic);
System.out.println(p2.price);
System.out.println(p2.originCountry);


Shoelace p3=new Shoelace("Puma","Red","Nylon",115,0.45,"Running","Flat",true,140,"Germany");
System.out.println(p3.brand);
System.out.println(p3.colour);
System.out.println(p3.material);
System.out.println(p3.length);
System.out.println(p3.width);
System.out.println(p3.type);
System.out.println(p3.shape);
System.out.println(p3.elastic);
System.out.println(p3.price);
System.out.println(p3.originCountry);

}
}