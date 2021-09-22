package lab2psp;

import lab.Music;

public class Main {

    public static void main(String[] args) {
        Music [] mus = new Music[5]; //создаём массив из 5 объектов класса Music
        mus[0] = new Music("Сердючка-Всё будет хорошо", 77777,true);
        mus[1] = new Music("КИНО-Проснись",true);
        mus[2]=new Music("Бетховен-Симфония№5");


        mus[3]=new Music();
        mus[4]=new Music(mus[0]); // вызов конструктора копий, здесь мы копируем информацию, из первого объекта
        for(int i=0;i< mus.length;i++){
            mus[i].print(i+1);        }// выводим полученную информацию.
        System.out.println("Общее количество проданных копий:" + Music.amountCopies(mus));  //выводим суммы зарплаты через вызов статистического метода
        System.out.println("Количество произведений, которые можно скачать mp3 в интернете: "+ Music.downloadableQuantity(mus));

    }
}
