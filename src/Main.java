public class Main {
    public static void main(String[] args) {
        System.out.println(" Задача 1 ");
        int a = 1000;
        System.out.println(" Значение переменной   a   с типом   int   равно " + a);
        byte b = 1;
        System.out.println(" Значение переменной b с типом byte равно " + b );
        short c = 130;
        System.out.println(" Значение переменной c с типом short равно " + c );
        long d = 1200L;
        System.out.println(" Значение переменной d с типом long равно " + d );
        float e = 3.25f;
        System.out.println(" Значение переменной e с типом float равно " + e );
        double f = 3.15;
        System.out.println(" Значение переменной f с типом double равно " + f );

        System.out.println(" Задача 2");
        float m = 27.12f;
        System.out.println(" Значение переменной m с типом float равно " + m );
        long h = 987678965549L;
        System.out.println(" Значение переменной h с типом long равно " + h );
        double g = 2.786;
        System.out.println(" Значение переменной g с типом double равно " + g );
        short s = 569;
        System.out.println(" Значение переменной s с типом short равно " + s );
        short l = -159;
        System.out.println(" Значение переменной l с типом short равно " + l );
        int aa = 27897;
        System.out.println(" Значение переменной   aa   с типом   int   равно " + aa );
        byte ii = 67;
        System.out.println(" Значение переменной ii с типом byte равно " + ii );

        System.out.println(" Задача 3");
        byte ludmilaP = 23;
        byte annaS = 27;
        byte ekaterinaA = 30;
        short totalLists = 480;
        int totalStudents = ludmilaP + annaS + ekaterinaA;
        int sheetsFor1Student = totalLists / totalStudents;
        System.out.println(" На каждого ученика рассчитано " + sheetsFor1Student + "  листов бумаги " );

        System.out.println(" Задача 4");
        byte makingMachine = 20;
        short makingMachine1 = 1440;
        short makingMachine2 = 1440 * 3;
        int makingMachine3 = 1440 * 30;
        byte bottlesPerMinute = 16 / 2;
        System.out.println(" За 1 минуту машина произвела " + bottlesPerMinute + " штук бутылок");
        int bottles20Min = bottlesPerMinute * makingMachine;
        System.out.println(" За 20 минут мишина произвела " + bottles20Min + " штук бутылок");
        int bottles1440Min = bottlesPerMinute * makingMachine1;
        System.out.println(" За 1440 минут (сутки) машина произвела " + bottles1440Min + " штук бутылок");
        int bottles4320Min = bottlesPerMinute * makingMachine2;
        System.out.println(" За 4320 минут (3 дня ) машина произвела " + bottles4320Min + " штук бутылок");
        int bottles43200Min = bottlesPerMinute * makingMachine3;
        System.out.println(" За 43200 минут ( 30 дней ) машина произвела " + bottles43200Min + " штук бутылок");

        System.out.println(" Задача 5");
        byte totalColors = 120;
        byte whitePaintOneClass = 2;
        byte brownPaintOneClass = 4;
        int totalColorsOneClass =  whitePaintOneClass + brownPaintOneClass;
        int numberOfClass = totalColors / totalColorsOneClass;
        int whitePaintAllClass = numberOfClass * whitePaintOneClass;
        int brownPaintAllClass = numberOfClass * brownPaintOneClass;
        System.out.println(" В школе, где " + numberOfClass + " классов, нужно " + whitePaintAllClass + " банок белой краски и " + brownPaintAllClass + " банок коричневой краски ");

        System.out.println(" Задача 6 ");
        byte bananas = 5;
        byte oneBananasGram = 80;

        short milk = 200;
        byte halfServingOfMilk = 100;
        byte gramsIn100MillilitersOfMilk = 105;
        int amountOfMilkNeeded = milk / halfServingOfMilk;

        byte iceCream = 2;
        byte oneBriquetteIceCream = 100;

        byte eggs = 4;
        byte gramsInOneEgg = 70;

        int howManyGramsIn5Bananas = bananas * oneBananasGram;
        int numberOfGramsIn200MlOfMilk = amountOfMilkNeeded * gramsIn100MillilitersOfMilk;
        int numberOfGramsIn2IceCreamBriquettes = iceCream * oneBriquetteIceCream;
        int numberOfGramsIn4RawEggs = eggs * gramsInOneEgg;
        int totalGramsInBreakfast = howManyGramsIn5Bananas + numberOfGramsIn200MlOfMilk + numberOfGramsIn2IceCreamBriquettes + numberOfGramsIn4RawEggs;
        float totalGramInKg = 1000f;

        float totalKgInBreakfast = totalGramsInBreakfast / totalGramInKg;
        System.out.println("Вес (количество граммов) такого спортзавтрака составляет " + totalGramsInBreakfast + " граммов");
        System.out.println("Вес (количество килограммов) такого спортзавтрака составляет " + totalKgInBreakfast + " килограмм");

        System.out.println("Задача 7");

        byte totalNumberOfKgForWeightLoss = 7;
        short totalNumberOfGramsInKilogram = 1000;
        int totalGramsForWeightLoss = 7 * 1000;
        short firstWayToLoseWeight = 250;
        short secondWayToLoseWeight = 500;
        int numberOfDaysWithTheFirstMethodOfLosingWeight = totalGramsForWeightLoss / firstWayToLoseWeight;
        int numberOfDaysWithTheSecondMethodOfLosingWeight = totalGramsForWeightLoss / secondWayToLoseWeight;
        System.out.println(numberOfDaysWithTheFirstMethodOfLosingWeight + "  дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println(numberOfDaysWithTheSecondMethodOfLosingWeight + " дней уйдет на похудение, если спортсмен каждый день будет худеть на 500 грамм");

        byte numberOfWaysToLoseWeight = 2;
        int sumOfDaysForCalculatingTheArithmeticMean = numberOfDaysWithTheFirstMethodOfLosingWeight + numberOfDaysWithTheSecondMethodOfLosingWeight;
        int numberOfDaysToLoseWeightOnAverage = sumOfDaysForCalculatingTheArithmeticMean / numberOfWaysToLoseWeight;
        System.out.println(numberOfDaysToLoseWeightOnAverage + " дней уйдет на похудение в среднем");

        System.out.println("Задача 8");

        int mashaCurrentSalaryPerMonth = 67760;
        int denisSalaryCurrentPerMonth = 83690;
        int christinaSalaryCurrentPerMonth = 76230;

        float salaryIncreasePercentage = 10 / 100f;
        float amountOf10PercentOfMashaCurrentSalary = mashaCurrentSalaryPerMonth * salaryIncreasePercentage;
        float amountOf10PercentOfDenisCurrentSalary = denisSalaryCurrentPerMonth * salaryIncreasePercentage;
        float amountOf10PercentOfChristinaCurrentSalary = christinaSalaryCurrentPerMonth * salaryIncreasePercentage;
        System.out.println("Сумма 10% от месячной зарплаты сотрудников: Маши, Дениса, Кристины соответсвенно");
        System.out.println(amountOf10PercentOfMashaCurrentSalary);
        System.out.println(amountOf10PercentOfDenisCurrentSalary);
        System.out.println(amountOf10PercentOfChristinaCurrentSalary);

        float mashaSalaryPerMonthAfterTheIncrease = mashaCurrentSalaryPerMonth + amountOf10PercentOfMashaCurrentSalary;
        float denisSalaryPerMonthAfterTheIncrease = denisSalaryCurrentPerMonth + amountOf10PercentOfDenisCurrentSalary;
        float christinaSalaryPerMonthAfterTheIncrease = christinaSalaryCurrentPerMonth + amountOf10PercentOfChristinaCurrentSalary;
        System.out.println("Месячная зарплата сотрудников после повышения: Маши, Дениса, Кристины соответсвенно");
        System.out.println(mashaSalaryPerMonthAfterTheIncrease);
        System.out.println(denisSalaryPerMonthAfterTheIncrease);
        System.out.println(christinaSalaryPerMonthAfterTheIncrease);

        byte month = 12;
        double annualIncomeOfMashaAfterTheIncrease = mashaSalaryPerMonthAfterTheIncrease * month;
        double annualIncomeOfDenisAfterTheIncrease = denisSalaryPerMonthAfterTheIncrease * month;
        double annualIncomeOfChristinaAfterTheIncrease = christinaSalaryPerMonthAfterTheIncrease * month;
        System.out.println("Годовая зарплата сотрудников после повышения: Маши, Дениса, Кристины соответсвенно");
        System.out.println(annualIncomeOfMashaAfterTheIncrease);
        System.out.println(annualIncomeOfDenisAfterTheIncrease);
        System.out.println(annualIncomeOfChristinaAfterTheIncrease);

        int mashaAnnualIncomeBeforeTheIncrease = mashaCurrentSalaryPerMonth * month;
        int denisAnnualIncomeBeforeTheIncrease = denisSalaryCurrentPerMonth * month;
        int christinaAnnualIncomeBeforeTheIncrease = christinaSalaryCurrentPerMonth * month;
        System.out.println("Годовая зарплата сотрудников до повышения: Маши, Дениса, Кристины соответсвенно");
        System.out.println(mashaAnnualIncomeBeforeTheIncrease);
        System.out.println(denisAnnualIncomeBeforeTheIncrease);
        System.out.println(christinaAnnualIncomeBeforeTheIncrease);

        System.out.println("Разница между годовыми зарплатами сотрудников до повышения и после: Маши, Дениса, Кристины соответсвенно");
        double differenceBetweenMashaAnnualSalaryBeforeThePromotionAndAfter = annualIncomeOfMashaAfterTheIncrease - mashaAnnualIncomeBeforeTheIncrease;
        double differenceBetweenDenisAnnualSalaryBeforeThePromotionAndAfter = annualIncomeOfDenisAfterTheIncrease - denisAnnualIncomeBeforeTheIncrease;
        double differenceBetweenChristinaAnnualSalaryBeforeThePromotionAndAfter = annualIncomeOfChristinaAfterTheIncrease - christinaAnnualIncomeBeforeTheIncrease;
        System.out.println(differenceBetweenMashaAnnualSalaryBeforeThePromotionAndAfter);
        System.out.println(differenceBetweenDenisAnnualSalaryBeforeThePromotionAndAfter);
        System.out.println(differenceBetweenChristinaAnnualSalaryBeforeThePromotionAndAfter);

        System.out.println("Маша теперь получает " + mashaSalaryPerMonthAfterTheIncrease + " рублей в месяц. " + "Годовой доход вырос на " + differenceBetweenMashaAnnualSalaryBeforeThePromotionAndAfter + " рублей. ");
        System.out.println("Денис теперь получает " + denisSalaryPerMonthAfterTheIncrease + " рублей в месяц. " + "Годовой доход вырос на " + differenceBetweenDenisAnnualSalaryBeforeThePromotionAndAfter + " рублей.");
        System.out.println("Кристина теперь получает " + christinaSalaryPerMonthAfterTheIncrease + " рублей в месяц. " + "Годовой доход вырос на " + differenceBetweenChristinaAnnualSalaryBeforeThePromotionAndAfter + " рублей.");























    }
}