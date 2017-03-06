//package com.kyj.base.test;
//
//import java.io.*;
//import java.util.HashMap;
//import java.util.Scanner;
//
///**
// * Created by zhangbinpc on 2016/11/30.
// */
//public class ArticleWordCount {
//    public static void main(String[] args) throws FileNotFoundException {
//        int count = 0;
//        HashMap map = new HashMap();
//        Scanner s = new Scanner(new File("d://test.txt")).useDelimiter(" |,|\\?|\\.");
//        while(s.hasNext()){
//            String word = s.next().trim();
//            count++;
//            if(word.length()>0 && word!=null){
//                if(map.get(word) !=null){
//                    int num = (int)map.get(word)+1;
//                    map.put(word,num);
//                }else {
//                    map.put(word,1);
//                }
//            }
//        }
//        System.out.println(map.toString());
//    }
//
//    public void calculate(){
//        BufferedReader br = null;
//        int num = 0;
//        String strLine = "";
//        try {
//            br = new BufferedReader(new FileReader(new File("d://test.txt")));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        try {
//            while ((strLine = br.readLine()) != null) {
//                strLine = strLine.trim();
//                String[] str = strLine.split("//W+");      //  "//W+" 表示一个或多个   非字母数字
//                num += str.length;                            //每次读一行，把每行的单词数累加
//            }
//            System.out.println("文章中单词总数为：" + num);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
