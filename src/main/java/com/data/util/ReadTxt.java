package com.data.util;

import javafx.scene.layout.BorderWidths;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ReadTxt {



    public static HashMap<String,Map<String,List>> readByTypeEEG(String date, String student, String type) throws Exception{
        String newDate=date.split("-" )[1]+date.split("-" )[2];

        HashMap<String,Map<String,List>> EEGDatas=new LinkedHashMap<>();
        String[] students=student.split(",");

        String[] types=type.split(",");


        for (int i=0;i<students.length;i++){
            students[i]=students[i].split("学生")[1];
            String pathname = "E:/new_data/new_"+newDate+"_"+students[i]+".txt";

            for (int  j= 0;j<types.length;j++){
                Integer tempK= EEGtoInt.BOW_TYPE.get(types[j]);
                int k=tempK.intValue();
                List<String> time=new LinkedList<>();
                List<String> bow=new LinkedList<>();
                try (FileReader reader = new FileReader(pathname);
                     BufferedReader br = new BufferedReader(reader) // 建立一个对象，它把文件内容转成计算机能读懂的语言
                )
                {
                    String line;

                    //网友推荐更加简洁的写法
                    while ((line = br.readLine()) != null) {
                        // 一次读入一行数据
                        String[] lines=line.split(",");
                        time.add(lines[0]);
                        bow.add(lines[k]);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                HashMap<String ,List> map = new HashMap<>();
                map.put("time", time);
                map.put("bow", bow);
                EEGDatas.put("学生"+students[i]+"的"+types[j],map);
            }


        }

        return EEGDatas;
    }

    public static Map<String, Map<String, List>> readByTypeStatus(String date, String student, String StatusTypes) {
        String newDate=date.split("-" )[1]+date.split("-" )[2];

        HashMap<String,Map<String,List>> EEGDatas=new LinkedHashMap<>();
        String[] students=student.split(",");

        String[] types=StatusTypes.split(",");


        for (int i=0;i<students.length;i++){
            students[i]=students[i].split("学生")[1];
            String pathname = "E:\\new_data\\status_students\\num_final_addTime_sort_clearData_"+newDate+"_"+students[i]+".csv";

            for (int  j= 0;j<types.length;j++){
                Integer tempK= StatustoInt.STATUS_TYPES.get(types[j]);
                int k=tempK.intValue();
                List<String> time=new LinkedList<>();
                List<String> status=new LinkedList<>();
                try (FileReader reader = new FileReader(pathname);
                     BufferedReader br = new BufferedReader(reader) // 建立一个对象，它把文件内容转成计算机能读懂的语言
                )
                {
                    String line;

                    //网友推荐更加简洁的写法
                    while ((line = br.readLine()) != null) {
                        // 一次读入一行数据
                        String[] lines=line.split(",");
                        time.add(lines[0]);
                        status.add(lines[k]);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                HashMap<String ,List> map = new HashMap<>();
                map.put("time", time);
                map.put("status", status);
                EEGDatas.put("学生"+students[i]+"的"+types[j],map);
            }


        }

        return EEGDatas;
    }
}
