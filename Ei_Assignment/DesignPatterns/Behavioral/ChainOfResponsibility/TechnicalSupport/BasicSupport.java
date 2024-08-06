
public class BasicSupport extends SupportHandler {
    @Override
    public void handleRequest(String issue) {
        if (issue.equals("basic")) {
            System.out.println("Basic Support: Handling basic issue.");
        } else {
            if (nextHandler != null) {
                nextHandler.handleRequest(issue);
            }
        }
    }
}

