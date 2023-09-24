public class SilverGenerator extends ItemFabric{
    @Override
    public iGameItem createItem() {
        System.out.println("Создал серебряный сундук");
        return new GoldReward();
    }
}