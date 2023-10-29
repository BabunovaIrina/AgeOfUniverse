public class Main {
    public static void main(String[] args) {

        final long ageUniverse = 13000000000l;
        System.out.println("Возраст Вселенной - " + ageUniverse + " лет");

        final int ageHumanity = 100000;
        System.out.println("Возраст человека, как вида - " + ageHumanity + " лет");

        final long ageDifference = ageUniverse / ageHumanity;
        System.out.println("Вселенная старше человечества в " + ageDifference + " раз");
    }
}
