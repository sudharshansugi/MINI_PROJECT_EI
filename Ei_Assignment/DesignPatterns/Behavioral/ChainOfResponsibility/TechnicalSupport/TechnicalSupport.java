public class TechnicalSupport extends SupportHandler {
    @Override
    public void handleRequest(String issue) {
        if (issue.equals("technical")) {
            System.out.println("Technical Support: Handling technical issue.");
        } else {
            if (nextHandler != null) {
                nextHandler.handleRequest(issue);
            }
        }
    }
}
