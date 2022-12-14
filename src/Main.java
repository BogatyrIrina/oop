public class Main {
    public static void main(String[] args) {

        int CurrentYear = 2022;

        Human maxim = new Human ();
        maxim.name = "Максим";
        maxim.age = 35;
        maxim.city = "Минск";
        maxim.speciality = "бренд-менеджер";

        Human anya = new Human ();
        anya.name = "Аня";
        anya.age = 29;
        anya.city = "Москва";
        anya.speciality = "методист образовательных программ";

        Human katya = new Human ();
        katya.name = "Катя";
        katya.age = 28;
        katya.city = "Калининград";
        katya.speciality = "продакт-менеджер";

        Human artem = new Human ();
        artem.name = "Артем";
        artem.age = 27;
        artem.city = "Москва";
        artem.speciality = "директор по развитию бизнеса";

        System.out.println("Привет! Меня зовут " + maxim.name + ". Я из города " + maxim.city + ". Я родился в " + (CurrentYear - maxim.age) + " году. Я работаю на должности " + maxim.speciality + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + anya.name + ". Я из города " + anya.city + ". Я родился в " + (CurrentYear - anya.age) + " году. Я работаю на должности " + anya.speciality + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + katya.name + ". Я из города " + katya.city + ". Я родился в " + (CurrentYear - katya.age) + " году. Я работаю на должности " + katya.speciality + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + artem.name + ". Я из города " + artem.city + ". Я родился в " + (CurrentYear - artem.age) + " году. Я работаю на должности " + artem.speciality + ". Будем знакомы!");
    }
}