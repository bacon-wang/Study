package demo.agent.staticagent;

public class Landlord implements Rent{

    @Override
    public void rent() {
        System.out.println("房东：签字出租");
    }
}
