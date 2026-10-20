package demo.agent.staticagent;

public class Tenant {
    public static void main(String[] args) {
        Agent agent = new Agent(new Landlord());
        agent.rent();
    }
}
