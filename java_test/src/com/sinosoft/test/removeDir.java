package com.sinosoft.test;

import java.io.File;

public class removeDir {
    public static void main(String[] args) {
        String dirPath = "";
        File file = new File(dirPath);
    }
    //dirPath  :文件夹磁盘路径
//判断文件夹是否存在，如果不存在则创建
    public static void isChartPathExist(String dirPath) {
        File file = new File(dirPath);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

//删除某个文件夹下面的所有文件
//dirPath  :文件夹磁盘路径

    public static void deleteFile(File file) {
        //判断文件不为null或文件目录存在
        if (file == null || !file.exists()) {
            System.out.println("文件删除失败,请检查文件路径是否正确");
            return;
        }
        //取得这个目录下的所有子文件对象
        File[] files = file.listFiles();
        //遍历该目录下的文件对象
        for (File f : files) {
            //打印文件名
            String name = file.getName();
            System.out.println(name);
            //判断子目录是否存在子目录,如果是文件则删除
            if (f.isDirectory()) {
                deleteFile(f);
            } else {
                f.delete();
            }
        }
        //删除空文件夹  for循环已经把上一层节点的目录清空。
//        file.delete();
    }



}
