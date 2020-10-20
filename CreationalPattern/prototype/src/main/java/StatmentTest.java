

public class StatmentTest {
    public static void main(String[] args) {

        Statment statment=Statment.getBuilder()
                .setFrom("j")
                .setGroupBy("nn")
                .setOrderBy("l")
                .setWhere("mm")
                .setProjection("kk")
                .createStatment();
        System.out.println(statment.hashCode());
        System.out.println(statment.clone().hashCode());


        System.out.println(statment.getRecord().hashCode());
        System.out.println(statment.clone().getRecord().hashCode());
    }



}