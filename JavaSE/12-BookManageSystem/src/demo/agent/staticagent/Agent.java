package demo.agent.staticagent;

public class Agent implements Rent{
    private final Landlord landlord;

    public Agent(Landlord landlord) {
        this.landlord = landlord;
    }

    @Override
    public void rent() {
        System.out.println("中介：筛选租客，带客户看房");
        this.landlord.rent();
        System.out.println("中介：收取中介费");
    }

}
