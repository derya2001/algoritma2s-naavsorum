
/*# Algoritma2sınavsorum
dışardan girilen hastaneye 
yatış ve hemşire sayısına göre 
hemşire sayısının yeterli olup 
olmadığını söylen program */
package benimalgoritma2sorum;

import java.util.Scanner;

class hemşireyoğunluğu { 
    private  String durum;
     private int bölümdekihemşireyogunlugu ;
     private int genelhemşireyogunlugu ;
     
     public int bölümdekihemşireyoğunluğu(int yatanhasta, int hemşiresayısı){
        int bolümdekihemşireyoğunluğu = yatanhasta / hemşiresayısı;
        return bölümdekihemşireyoğunluğu ;
        
        
        public int genelhemşireyogunlugu (int tümyatanhasta, int tümhemşiresayısı){
       
       int genelhemşireyogunlugu = tümyatanhasa / tümhemşiresayısı;
       return genelhemşireyogunlugu ;
        
        
         
     }
           public String durum (int bölümdekihemşireyoğunluğu, int genehemşireyogunlugu ){
               if (genelhemşireyogunlugu < bölümdekihemşireyoğunluğu ){
                   durum = "bölüme hemşire alınmalı";
                   
                           
               } else if (genelhemşireyogunlugu > bölümdekihemşireyoğunluğu){
                   durum = "normal";
                   
                           
               } else if (genelhemşireyogunlugu == bölümdekihemşireyoğunluğu){
                   durum ="gelecek zamanda hemşire alınmalı";
               }
           return durum;
           
     
public class Soru extends hemşireyoğunluğu {
 public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("tüm yatan hasta sayısını giriniz : ");
        int tümyatanhasta = input.nextInt();
        System.out.print("tüm hemşire sayısını giriniz : ");
        int tümhemşiresayısı = input.nextInt();
        System.out.print("bölümde yatan hasta sayısı giriniz: ");
        int yatanhasa = input.nextInt();
        System.out.print("bölümdeki hemşire sayısını giriniz: ");
        int hemşiresayısı = input.nextInt();
        Corona class hemşireyogunlugu = new hemşireyogunlugu();
        class hemşireyogunlugu.bölümdekihemşireyoğunluğu(yatanhasta,hemşiresayısı );
        class hemşireyoğunluğu.genelhemşireyogunlugu (tümyatanhasta,tümhemşiresayısı);
                
