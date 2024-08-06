public class Main {
    public static void main(String[] args) {
        SupportHandler basicSupport = new BasicSupport();
        SupportHandler technicalSupport = new TechnicalSupport();
        SupportHandler specialistSupport = new SpecialistSupport();

        basicSupport.setNextHandler(technicalSupport);
        technicalSupport.setNextHandler(specialistSupport);

        /*basicSupport.handleRequest("technical");
        basicSupport.handleRequest("technical");
        basicSupport.handleRequest("specialist");*/
        basicSupport.handleRequest("unknown");
    }
}
