package pracWork;

//public class Person {
//	
//	private String name;
//	private String sex;
//	private int age;
//	private int height;
//	private int weight;
//	
//	/**
//	 * @return the name
//	 */
//	public String getName() {
//		return name;
//	}
//	/**
//	 * @param name the name to set
//	 */
//	public void setName(String name) {
//		this.name = name;
//	}
//	/**
//	 * @return the sex
//	 */
//	public String getSex() {
//		return sex;
//	}
//	/**
//	 * @param sex the sex to set
//	 */
//	public void setSex(String sex) {
//		this.sex = sex;
//	}
//	/**
//	 * @return the age
//	 */
//	public int getAge() {
//		return age;
//	}
//	/**
//	 * @param age the age to set
//	 */
//	public void setAge(int age) {
//		this.age = age;
//	}
//	/**
//	 * @return the height
//	 */
//	public int getHeight() {
//		return height;
//	}
//	/**
//	 * @param height the height to set
//	 */
//	public void setHeight(int height) {
//		this.height = height;
//	}
//	/**
//	 * @return the weight
//	 */
//	public int getWeight() {
//		return weight;
//	}
//	/**
//	 * @param weight the weight to set
//	 */
//	public void setWeight(int weight) {
//		this.weight = weight;
//	}
//	public Person(String name, String sex, int age, int height, int weight) {
//		super();
//		this.name = name;
//		this.sex = sex;
//		this.age = age;
//		this.height = height;
//		this.weight = weight;
//	}
//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", sex=" + sex + ", age=" + age + ", height=" + height + ", weight=" + weight
//				+ "]\n";
//	}
//
//	
//}


public class Person {

	private String name;
	private int age;
	private int weight;
	private int height;
	private String sex;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Person(String name, int age, int weight, int height, String sex) {
	
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + ", height=" + height + ", sex=" + sex
				+ "]\n";
	}
	
	
	
}