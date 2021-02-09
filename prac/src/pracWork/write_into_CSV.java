package pracWork;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class write_into_CSV {

	//	private String filePath = "G:\\java\\prac.csv";


	public static void writeCsv(String filepath) {
		List<User> users = new ArrayList<User>();


		// create demo users
		User user = new User();
		user.setId(1);
		user.setFirstname("Adnan Ali");
		user.setLastname("Khan");
		users.add(user);

		user = new User();
		user.setId(2);
		user.setFirstname("Ahmed");
		user.setLastname("Ali");
		users.add(user);

		user = new User();
		user.setId(3);
		user.setFirstname("Kinza");
		user.setLastname("Cool");
		users.add(user);

		FileWriter fileWriter = null;

		try {
			fileWriter = new FileWriter(filepath);
			fileWriter.append("id, First Name, Last Name\n");

			for(User u: users) {
				fileWriter.append(String.valueOf(u.getId()));
				fileWriter.append(",");
				fileWriter.append(u.getFirstname());
				fileWriter.append(",");
				fileWriter.append(u.getLastname());
				fileWriter.append("\n");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "G:\\java\\prac.csv";
		writeCsv(filePath);


	}

}
