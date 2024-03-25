package diary;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DiaryWriter {
    private Scanner sc = new Scanner(System.in);
    private String title = "";

    public void writer() throws Exception {
        save();

        File directory = new File("C:/Temp/diary");
        if (!directory.exists()) {
            directory.mkdirs();
        }

        FileWriter fw = new FileWriter(title, true);
        BufferedWriter br = new BufferedWriter(fw);

        System.out.println("일기 입력 : ");

        String str = "";

        while (!str.equals("끝")) {
            str = sc.nextLine();

            br.newLine();

            if (!str.equals("끝")) br.write(str);

        }
        br.close();
    }

    public void save() {
        System.out.println("일기 제목 입력 : ");
        String inputTitle = sc.nextLine();

        LocalDate now = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");

        String date = now.format(dtf);

        title = "C:/Temp/diary/" +date + "_" + inputTitle +".txt";
    }
}
