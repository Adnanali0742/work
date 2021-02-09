package csvHandling;

public class twoDarray {
	
	
	private String name;
	private String sex;
	private String age;
	private String height;
	private String weight;
	
	public twoDarray(String name, String sex, String age, String height, String weight) { 
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.weight = weight;
		}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	
	public String toString() {
		
		
		
		String[][] arr = {{name, sex, age, height, weight}};		
		for(int i=0;i<arr.length;i++)  
	    { 
	        for(int j=0;j<5;j++)  
	        {  
	            System.out.print(arr[i][j]+"\t");  
	        }  
	    }  
		return "";
	}
}
