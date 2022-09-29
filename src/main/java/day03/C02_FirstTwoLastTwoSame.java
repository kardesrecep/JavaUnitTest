package day03;

public class C02_FirstTwoLastTwoSame {
    //Task: ilk iki ve son iki karakteri ayni mi test edelim

    public boolean check_If_First_Two_Last_Two_Are_Same(String str){
     if (str.length()<=1) return false;
     if (str.length()==2)return true;

     String firstTwochars=str.substring(0,2);
     String lastTwochars=str.substring(str.length()-2);
     return  firstTwochars.equals(lastTwochars);
    }

    }