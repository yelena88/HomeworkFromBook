package com.lena.homework.ex33;

/*
Задание 33
Вывести список файлов и каталогов выбранного на диске. Файлы и катологи должны быть распечатаны отдельно.
 */

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FilesAndDirs {
    public static void main(String[] args) {
        //Выбираем каталог на диске
        getFilesAndDirs("C:\\Windows\\");
    }

    private static void getFilesAndDirs(String dir) {

        File file = new File(dir);
        List<String> files = new ArrayList<>();
        List<String> folders = new ArrayList<>();

        File[] filesList = file.listFiles();

        assert filesList != null;
        for (File file1 : filesList) {
            if (file1.isFile()){
                files.add(file1.getName());
            }else {
                folders.add(file1.getName());
            }
        }

        System.out.print("Файлы в выбранном каталоге: ");
        for (String s : files) {
            System.out.print(s + " ");
        }
        System.out.print("\n\nКаталоги в выбранном каталоге: ");
        for (String s : folders) {
            System.out.print(s + " ");
        }
    }
}
