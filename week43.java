import java.io.*;
public class week43{
            public static void main(String[] args)throws IOException{
                         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                         System.out.print("請輸入月份 : ");
                         int month = Integer.parseInt(buf.readLine());
                         System.out.print("\n請輸入日期 : ");
                         int date = Integer.parseInt(buf.readLine());
                         if(month>=1&&month<=12&&date>=1&&date<=31){
                               switch(month){
                                    case 1:
                                          if(date>=1&&date<=19)
                                                 System.out.print("\n您的星座為 : 摩羯座");
                                          else if(date>=20&&date<=31)
                                                 System.out.print("\n您的星座為 : 水瓶座");
                                          else 
                                                 System.out.print("\n請輸入正確的日期");
                                          break;
                                     case 2:
                                          if(date>=1&&date<=18)
                                                 System.out.print("\n您的星座為 : 水瓶座");
                                          else if(date>=19&&date<=28)
                                                 System.out.print("\n您的星座為 : 雙魚座");
                                          else 
                                                 System.out.print("\n請輸入正確的日期");
                                          break;
                                     case 3:
                                          if(date>=1&&date<=20)
                                                 System.out.print("\n您的星座為 : 雙魚座");
                                          else if(date>=21&&date<=31)
                                                 System.out.print("\n您的星座為 : 白羊座");
                                          else 
                                                 System.out.print("\n請輸入正確的日期");
                                          break;
                                     case 4:
                                          if(date>=1&&date<=19)
                                                 System.out.print("\n您的星座為 : 白羊座");
                                          else if(date>=20&&date<=30)
                                                 System.out.print("\n您的星座為 : 金牛座");
                                          else 
                                                 System.out.print("\n請輸入正確的日期");
                                          break;
                                     case 5:
                                          if(date>=1&&date<=20)
                                                 System.out.print("\n您的星座為 : 金牛座");
                                          else if(date>=21&&date<=31)
                                                 System.out.print("\n您的星座為 : 雙子座");
                                          else 
                                                 System.out.print("\n請輸入正確的日期");
                                          break;
                                     case 6:
                                          if(date>=1&&date<=21)
                                                 System.out.print("\n您的星座為 : 雙子座");
                                          else if(date>=22&&date<=30)
                                                 System.out.print("\n您的星座為 : 巨蟹座");
                                          else 
                                                 System.out.print("\n請輸入正確的日期");
                                          break;
                                     case 7:
                                          if(date>=1&&date<=22)
                                                 System.out.print("\n您的星座為 : 巨蟹座");
                                          else if(date>=23&&date<=31)
                                                 System.out.print("\n您的星座為 : 獅子座");
                                          else 
                                                 System.out.print("\n請輸入正確的日期");
                                          break;
                                     case 8:
                                          if(date>=1&&date<=22)
                                                 System.out.print("\n您的星座為 : 獅子座");
                                          else if(date>=23&&date<=31)
                                                 System.out.print("\n您的星座為 : 處女座");
                                          else 
                                                 System.out.print("\n請輸入正確的日期");
                                          break;
                                     case 9:
                                          if(date>=1&&date<=22)
                                                 System.out.print("\n您的星座為 : 處女座");
                                          else if(date>=23&&date<=30)
                                                 System.out.print("\n您的星座為 : 天秤座");
                                          else 
                                                 System.out.print("\n請輸入正確的日期");
                                          break;
                                     case 10:
                                          if(date>=1&&date<=23)
                                                 System.out.print("\n您的星座為 : 天秤座");
                                          else if(date>=24&&date<=31)
                                                 System.out.print("\n您的星座為 : 天蠍座");
                                          else 
                                                 System.out.print("\n請輸入正確的日期");
                                          break;
                                     case 11:
                                          if(date>=1&&date<=22)
                                                 System.out.print("\n您的星座為 : 天蠍座");
                                          else if(date>=23&&date<=30)
                                                 System.out.print("\n您的星座為 : 射手座");
                                          else 
                                                 System.out.print("\n請輸入正確的日期");
                                          break;
                                     case 12:
                                          if(date>=1&&date<=21)
                                                 System.out.print("\n您的星座為 : 射手座");
                                          else if(date>=22&&date<=31)
                                                 System.out.print("\n您的星座為 : 魔羯座");
                                          else 
                                                 System.out.print("\n請輸入正確的日期");
                                          break;
                                     default:
                                          System.out.print("\n請輸入正確的日期");
                                          break;
                               }
                         }
                         else
                               System.out.println("\n請輸入正確的日期");
            }
}