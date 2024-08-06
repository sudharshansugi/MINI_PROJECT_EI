public class SpecialistSupport extends SupportHandler {
    @Override
    public void handleRequest(String issue) {
        if (issue.equals("specialist")) {
            System.out.println("Specialist Support: Handling specialist issue.");
        } else {
            System.out.println("Specialist Support: Issue cannot be resolved.");
        }
    }
}
