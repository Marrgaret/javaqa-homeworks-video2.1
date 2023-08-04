public class Main {

    public static void main(String[] args) {
        System.out.println("Авиаперевозчики предлагают различные бонусные программы, начисляющие бесплатные мили за перелёты.");
        System.out.println("Вы преобрели билет за 16 763 рубля и за каждые 20 рублей вы получите бесплатные мили/");
        int amount = 16_763;
        int mile = 20;
        int bonus = amount / mile;

        System.out.println("Итоговый бонус:" + bonus);

    }
}