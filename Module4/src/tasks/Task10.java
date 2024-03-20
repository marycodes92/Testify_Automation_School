package tasks;

public class Task10 {
//    Create a method that verify that visitors on the slack channel are
//    coming for testify Trainings. If they write" Testify" then print out a
//    welcome message if not , the user should be shown rejection message.
//    after creating this method,then invoke the created method in your main method
    public static void main(String[] args) {
        Task10 tasks = new Task10();

       String firstPerson = tasks.verifyVisitor("reading");
       String secondPerson = tasks.verifyVisitor("Testify");

        System.out.println(firstPerson);
        System.out.println(secondPerson);
    }

    public String verifyVisitor(String slackChannel){
        String message = "";

        if(slackChannel.equals("Testify")){
            message = "Welcome to Testify slack channel";
        } else {
            message = "You are at the wrong channel";
        }
        return message;
    }
}
