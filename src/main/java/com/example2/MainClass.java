package com.example2;

import com.example.service.Cv;
import com.example.service.CvCatalogImpl;
import com.example.service.CvCatalogImplService;
import com.example.service.NoCvException_Exception;

import java.util.List;

/**
 * @author MariusBalanuca
 * @since 09.12.2017
 **/
public class MainClass {
    static CvCatalogImplService cvCatalogImplService = new CvCatalogImplService();

    static CvCatalogImpl cvCatalog = cvCatalogImplService.getCvCatalogImplPort();

    public static void main(String[] args) {

        /*try {
            getCvByName();
        } catch (NoCvException_Exception e) {
            e.printStackTrace();
        }
        System.out.println("**************************************");
        addCv();
        System.out.println("**************************************");
        getAllCv();
        System.out.println("**************************************");
        deleteCv();
        System.out.println("**************************************");*/
        while (true){
            try {
                getAllCv();
                System.out.println("**************************************");
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void deleteCv() {
        cvCatalog.deleteCv("Test");
    }

    private static void getAllCv() {
        List<Cv> fullCvList = cvCatalog.showAll();
        for(Cv cv : fullCvList){
            System.out.println(cv.getName() + ", " + cv.getJob() + ", " + cv.getSalary() + ", " + cv.getAge());
        }
    }

    private static void addCv() {
        cvCatalog.addCv("Test", "test", 1, 2);
    }

    public static void getCvByName() throws NoCvException_Exception {
        List<Cv> cvList =  cvCatalog.getCv("java");
        for(Cv cv : cvList){
            System.out.println(cv.getName());
        }
    }
}
