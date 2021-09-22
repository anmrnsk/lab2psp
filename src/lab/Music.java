package lab;

public class Music {
    private String name; // название произведения
    private int copies; // количество выпущенных копий
    private boolean possibility; //возможность скачать mp3 в интернете

    public Music() {    //конструктор без параметров(по умолчанию)
    }

    public Music(String name, int copies, boolean possibility) { //конструктор с полным набором параметров. То есть переданными значениями будет инициализирован объект
        this.name = name;
        this.copies = copies;
        this.possibility = possibility;
    }

    public Music(Music obj) { //конструктора копирования
        this.name = obj.name;
        this.possibility = obj.possibility;
        this.copies = obj.copies;
    }

    public Music(String name, boolean possibility) { // конструктор с неполным набором параметров (перегруженный конструктор)
        this.name = name;
        this.possibility = possibility;
    }

    public Music(String name) { // конструктор с неполным набором параметров (перегруженный конструктор)
        this.name = name;
    }

    //методы получения полей объекта.

    public String getName() {
        return name;
    }

    public int getCopies() {
        return copies;
    }

    public boolean isPossibility() {
        return possibility;
    }


    public static int amountCopies(Music[] music) { //статический метод подсчёта общего количества копий
        int amount = 0;
        for (int i = 0; i < music.length; i++) {
            amount += music[i].copies;
        }
        return amount;
    }

    public static int downloadableQuantity(Music[] music) {
        int pos = 0;
        for (int i = 0; i < music.length; i++)
            if (music[i].possibility)
                pos++;
        return pos;
    }

    public void print(int i) { //метод для вывода введенной информации
        System.out.println("-------Песня №"+ i +"--------");
        System.out.println("Название:" + this.getName() + "\n" +
                "Количество проданных копий:" +this.getCopies());
        if (this.isPossibility()) {
            System.out.println("Возможность скачать с интернета формат mp3: Да");
        } else {
            System.out.println("Возможность скачать с интернета формат mp3: Нет");
        }
        System.out.println("-----------------------------\n");
    }


}


