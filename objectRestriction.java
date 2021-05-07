package assignment;


class class1 {

    private static class1 obj;
    public static int objCount = 0;

    private class1(){
        objCount++;
    }

    public static  class1 method1(){
        if(objCount < 4 ){
        	obj = new class1();
        }
        return obj;
    }
}
public class objectRestriction {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class1 obj1 = class1.method1();
		class1 obj2 = class1.method1();
        class1 obj3 = class1.method1();
        class1 obj4 = class1.method1();
        class1 obj5 = class1.method1();
        class1 obj6 = class1.method1();

        System.out.println(obj1);
        System.out.println(obj2);

        System.out.println(obj3);
        System.out.println(obj4);
        System.out.println(obj5);
        System.out.println(obj6);

	}

}
