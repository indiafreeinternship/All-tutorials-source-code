class DemoParameter{

 void m1(){
  System.out.println("India Free Internship");
}

void m2(int a){
 System.out.println(a);
}

void m3(String name){
	System.out.println(name);
}

void profile(String name,int age,String addr){
  System.out.println(name);
  System.out.println(age);
  System.out.println(addr);
}

   public static void main(String[] args){
    DemoParameter ob=new DemoParameter();
    ob.m1();
    ob.m2(10);
   ob.m3("Ranjan");
   ob.profile("RAHUL",35,"INDIA");

   }
}