// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // tack1
        byte bVar = 105;
        short sVar = 1256;
        int iVar = 1232212;
        long lVar = 452264L;
        float fVar = 42.756f;
        double dVar = 123.546879;

        System.out.println("Значение переменной bVar с типом byte равно " + bVar);
        System.out.println("Значение переменной sVar с типом short равно " + sVar);
        System.out.println("Значение переменной iVar с типом int равно " + iVar);
        System.out.println("Значение переменной lVar с типом long равно " + lVar);
        System.out.println("Значение переменной fVar с типом float равно " + fVar);
        System.out.println("Значение переменной dVar с типом double равно " + dVar);

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
        int res20 = kolBout * 10;
        int res1d = kolBout * (12 * 60);
        int res3d = res1d * 3;
        int res1m = res3d * 10;

        System.out.println("За 20 минут машина произвела " + res20 + " штук бутылок");
        System.out.println("За 1 день машина произвела " + res1d + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + res3d + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + res1m + " штук бутылок");

        //tack5
        
        byte paintWhite = 2;
        byte paintBrown = 4;
        byte summa = 120;
        int result1 = 120 / (paintWhite + paintBrown);
        int resWhite = result1 * paintWhite;
        int resBrown = result1 * paintBrown;
        System.out.println("В школе, где " + result1 + " классов, нужно " + resWhite + " банок белой краски и " + resBrown + " банок коричневой краски");

        // tack6

        int mMilk = 105;
        int aMilk = 200;
        int mBanan = 80;
        int aBanan = 5;
        int mIceCream = 100;
        int aIceCream = 2;
        int mEgg = 70;
        int aEgg = 4;
        int recipeG = aMilk * mMilk + aBanan * mBanan + aIceCream * mIceCream + aEgg * mEgg;
        float recipeKg = recipeG / 1000f;
        System.out.println("Вес спортзавтрака соствляет " + recipeG + " грамм, или " + recipeKg + " кг.");

        //tack7

        int m_250 = 250;  // константа?
        int m_500 = 500;   // тоже константа?
        int totalM = 7000;
        int kolD250 = totalM / m_250;
        int kolD500 = totalM / m_500;
        int midleD = (kolD500 + kolD250) / 2;
        System.out.println("Если по 250 гр. снижать, потребуется " + kolD250 + " дней");
        System.out.println("Если по 500 гр. снижать, потребуется " + kolD500 + " дней");
        System.out.println("В среднем потребуется " + midleD + " дней");

        //tack8

        float salaryMasha = 67760f;
        float salaryDenis = 83690f;
        float salaryKristina = 76230f;
        float newSalaryMasha = salaryMasha * 1.1f;
        float newSalaryDenis = salaryDenis * 1.1f;
        float newSalaryKristina = salaryKristina * 1.1f;
        float diffMasha = (newSalaryMasha - salaryMasha) * 12;
        float diffDenis = (newSalaryDenis - salaryDenis) * 12;
        float diffKristina = (newSalaryKristina - salaryKristina) * 12;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + diffMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + diffDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + diffKristina + " рублей");


    }
}