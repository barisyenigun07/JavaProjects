package Generics;


public class Main{
    public static void main(String[] args){
        Character[] char_dizi = {'J','A','V','A'};
        Integer[] integer_dizi = {1,2,3,4,5};
        Ogrenci[] ogrenci_dizi = {new Ogrenci("Barış"),new Ogrenci("Erdem")};
        String[] string_dizi = {"Java","Python","C#","PHP"};

        YazdirmaSinifi<Character> yazdir_char = new YazdirmaSinifi<Character>();
        YazdirmaSinifi<Integer> yazdir_int = new YazdirmaSinifi<Integer>();
        YazdirmaSinifi<String> yazdir_str = new YazdirmaSinifi<String>();
        YazdirmaSinifi<Ogrenci> yazdir_ogrenci = new YazdirmaSinifi<Ogrenci>();

        yazdir_char.yazdir(char_dizi);
        System.out.println("**************");
        yazdir_str.yazdir(string_dizi);
        System.out.println("**************");
        yazdir_int.yazdir(integer_dizi);
        System.out.println("**************");
        yazdir_ogrenci.yazdir(ogrenci_dizi);


    }
}
