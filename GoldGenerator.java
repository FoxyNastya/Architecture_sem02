public class GoldGenerator extends ItemFabric{
    @Override
    public iGameItem createItem() {
        System.out.println("Создал золотой сундук");
        return new GoldReward();
    }
}