package tasks;

/*
    You are required to build the blueprint for your company's login page.
    From the discussions with the product team, all login pages will have a
    username field, password field, forgot password field, and sign-in button
    while other elements like remember me checkbox, continue to homePage,
    OAuth button will not be applicable to all login pages. with your knowledge
    of Abstract classes, Create a class that others developers will have to inherit from.
* */
public abstract class Task17A_Login {
    public abstract void loginForm(String username, String password);
    public abstract void forgotPassword();
    public abstract void signInBtn();

    public Boolean rememberMe(boolean toggle){
        return toggle;
    };

    public void continueToHome(){
        System.out.println("Return to Home page");
    }
    public void oAuth(){
        System.out.println("Here is your authentication token");
    }
}
