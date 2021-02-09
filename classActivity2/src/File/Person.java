package File;

public class Person {

	private String login;
	private boolean authenticated;

	/**
	 * This method allows to check if the user is granted according to its couple (login/pwd)
	 * @param userLogin the input login
	 * @param userPassword the input password
	 * @return true if the user is authenticated
	 */
	public boolean authenticate(String userLogin, String userPassword){
		String foundPassword = getUserPassword(userLogin);
		if (foundPassword == null || foundPassword.trim().isEmpty()){
			//user was not found or no way to find a password
			return false;
		}
		authenticated = userPassword.equals(foundPassword) ;
		if (authenticated){
			System.out.println("Access is granted !");
			this.login = userLogin; //stores the login for further use
		}else{
			System.out.println("Access is denied ...");
		}
		return authenticated;
	}

	public String getLogin() {
		return login;
	}

	public boolean isAuthenticated() {
		return authenticated;
	}

	private String getUserPassword(String user){
		//Should be implemented later, it should check against a database for instance or in a file.
		return user;
	}
} 