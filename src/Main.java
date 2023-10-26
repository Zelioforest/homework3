// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // tack1
        byte b_v = 105;
        short s_v = 1256;
        int i_v = 1232212;
        long l_v = 452264L;
        float f_v = 42.756f;
        double d_v = 123.546879;

        System.out.println("Значение переменной b_v с типом byte равно " + b_v);
        System.out.println("Значение переменной s_v с типом short равно " + s_v);
        System.out.println("Значение переменной i_v с типом int равно " + i_v);
        System.out.println("Значение переменной l_v с типом long равно " + l_v);
        System.out.println("Значение переменной f_v с типом float равно " + f_v);
        System.out.println("Значение переменной d_v с типом double равно " + d_v);

        // tack2

        float  a = 27.12f;
        long b = 987_678_965_549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897; // можно и int, но выбирала по минималке
        byte g = 67;

        //tack3

        int LP = 23;
        int AC = 27;
        int EA = 30;
        int result = 480 / (LP + AC + EA);
        System.out.println("На каждого ученика рассчитано " + result + " листов бумаги");

        //tack4

        int kolBout = 16;
        int res_20 = kolBout * 10;
        int res_1d = kolBout * (12 * 60);
        int res_3d = res_1d * 3;
        int res_1m = res_3d * 10;

        System.out.println("За 20 минут машина произвела " + res_20 + " штук бутылок");
        System.out.println("За 1 день машина произвела " + res_1d + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + res_3d + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + res_1m + " штук бутылок");

        //tack5
        
        byte paintWhite = 2;
        byte paintBrown = 4;
        byte summa = 120;
        int result1 = 120 / (paintWhite + paintBrown);
        int res_W = result1 * paintWhite;
        int res_B = result1 * paintBrown;
        System.out.println("В школе, где " + result1 + " классов, нужно " + res_W + " банок белой краски и " + res_B + " банок коричневой краски");

        // tack6

        int m_milk = 105;
        int a_milk = 200;
        int m_banan = 80;
        int a_banan = 5;
        int m_iceCream = 100;
        int a_iceCream = 2;
        int m_egg = 70;
        int a_egg = 4;
        int recipeG = a_milk * m_milk + a_banan * m_banan + a_iceCream * m_iceCream + a_egg * m_egg;
        float recipeKg = recipeG / 1000f;
        System.out.println("Вес спортзавтрака соствляет " + recipeG + " грамм, или " + recipeKg + " кг.");

        //tack7

        int m_250 = 250;
        int m_500 = 500;
        int totalM = 7000;
        int kolD_250 = totalM / m_250;
        int kolD_500 = totalM / m_500;
        int midleD = (kolD_500 + kolD_250) / 2;
        System.out.println("Если по 250 гр. снижать, потребуется " + kolD_250 + " дней");
        System.out.println("Если по 500 гр. снижать, потребуется " + kolD_500 + " дней");
        System.out.println("В среднем потребуется " + midleD + " дней");

        //tack8

        float salaryMasha = 67760f;
        float salaryDenis = 83690f;
        float salaryKristina = 76230f;
        float new_salaryMasha = salaryMasha * 1.1f;
        float new_salaryDenis = salaryDenis * 1.1f;
        float new_salaryKristina = salaryKristina * 1.1f;
        float diff_Masha = (new_salaryMasha - salaryMasha) * 12;
        float diff_Denis = (new_salaryDenis - salaryDenis) * 12;
        float diff_Kristina = (new_salaryKristina - salaryKristina) * 12;
        System.out.println("Маша теперь получает " + new_salaryMasha + " рублей. Годовой доход вырос на " + diff_Masha + " рублей");
        System.out.println("Денис теперь получает " + new_salaryDenis + " рублей. Годовой доход вырос на " + diff_Denis + " рублей");
        System.out.println("Кристина теперь получает " + new_salaryKristina + " рублей. Годовой доход вырос на " + diff_Kristina + " рублей");


    }
}