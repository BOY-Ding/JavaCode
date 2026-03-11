class String2Basic {
	public static void main (String[] args) {
		//1.把基本数据类型转换成String。 通过 +"" 
		String n1 = "ABC";
		System.out.println(n1);

		//2.把"123"字符串转换成基本数据类型：原类.parseXXX()
		String n2 = "123";
		int n3 = Integer.parseInt(n2);
		System.out.println(n3);
	}

}

class Test01 {
	public static void main (String[] args) {
		String name = "BBoy";
		int age = 18;
		double score = 88.88;
		String hob = "打羽毛球";
		System.out.println("姓名\t年龄\t成绩\t爱好\n" + name + "\t" + age + "\t" + score + "\t" + hob);
	}
}