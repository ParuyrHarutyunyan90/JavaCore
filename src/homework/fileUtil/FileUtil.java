package homework.fileUtil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws IOException {
        createFileWithContent();
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {
        System.out.println("Please input path ,file name");
        String pathFileStr = scanner.nextLine();
        String[] pathFile = pathFileStr.split(",");
        File file = new File(pathFile[0]);
        if (file.isDirectory()) {
            String[] list = file.list();
            for (String fileNames : list) {
                System.out.println(fileNames.equals(pathFile[1]));
            }
        } else System.out.println("please input correct path");
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() throws IOException {
        System.out.println("Please input path ,keyword");
        String pathFileStr = scanner.nextLine();
        try {
            String[] pathFile = pathFileStr.split(",");
            File file = new File(pathFile[0]);
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File textFiles : files) {
                    if (textFiles.getName().endsWith("txt")) {
                        String path = textFiles.getPath();
                        try (BufferedReader input = new BufferedReader(new FileReader(path))) {
                            String whileRun = input.readLine();
                            while (whileRun != null) {
                                String[] keywords = whileRun.split(" ");
                                for (String keyword : keywords) {
                                    if (keyword.equals(pathFile[1])) {
                                        System.out.println(textFiles.getName());
                                    }
                                }
                                whileRun = input.readLine();
                            }
                        }
                    }
                }
            } else System.out.println("please input correct path");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please input keyword");
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() throws IOException {
        System.out.println("Please input file path ,keyword");
        String pathFileStr = scanner.nextLine();
        try {
            String[] pathFile = pathFileStr.split(",");
            File file = new File(pathFile[0]);
            if (file.isDirectory()) {
                System.out.println("Please input correct path");
            } else {
                try (BufferedReader input = new BufferedReader(new FileReader(pathFile[0]))) {
                    String whileRun = input.readLine();
                    while (whileRun != null) {
                        String[] keywords = whileRun.split(" ");
                        for (String keyword : keywords) {
                            if (keyword.equals(pathFile[1])) {
                                System.out.println(whileRun);
                            }
                        }
                        whileRun = input.readLine();
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please input keyword");
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("Please input package path");
        String packagePath = scanner.nextLine();
        int count = 0;

        String whileRun = packagePath;
        while (whileRun != null) {
            File file = new File(whileRun);
            count++;
            whileRun = file.getParent();
        }
        System.out.println(count);

    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() throws IOException {
        System.out.println("Please input path, file name, content");
        String pathFileNameContentStr = scanner.nextLine();
        try {
            String[] pathFileNameContent = pathFileNameContentStr.split(",");
            String path = pathFileNameContent[0];
            String fileName = pathFileNameContent[1];
            String content = pathFileNameContent[2];
            File file = new File(path, fileName);
            boolean newFile = file.createNewFile();
            if (newFile) {
                try (BufferedWriter out = new BufferedWriter(new FileWriter(file.getAbsolutePath()))) {
                    out.write(content);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please input  file name or content");
        }
    }
}
