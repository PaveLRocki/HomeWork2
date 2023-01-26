package Rainbow;


import java.util.Scanner;

public class Rainbow {

    public static final String Red = "Красный";
    public static final String Orange = "Оранжевый";
    public static final String Yellow = "Жёлтый";
    public static final String Green = "Зеленый";
    public static final String Blue = "Голубой";
    public static final String Indigo = "Синий";
    public static final String Violet = "Фиолетовый";

    public static final String RedO = "Красно-";
    public static final String OrangO = "Оранжево-";
    public static final String YellowO = "Жёлто-";
    public static final String GreenO = "Зелено-";
    public static final String BluO = "Голубо-";
    public static final String IndigoVO = "Сине-";
    public static final String VioletOVO = "Фиолетово-";




    public void launch() {
        Scanner scanner = new Scanner(System.in);
        int str;


        System.out.print("Введите число от 1 до 7 для получения цвета\nИли введите комбинацию чисел 1-7 для получения полу-цвета: ");

        str = scanner.nextInt();
        if (str>0 && str<8)
            color(str);
        else{
            if (str==11)
                System.out.println(RedO + Red);
            else if (str==12)
                System.out.println(RedO + Orange);
            else if (str==13)
                System.out.println(RedO + Yellow);
            else if (str==14)
                System.out.println(RedO + Green);
            else if (str==15)
                System.out.println(RedO + Blue);
            else if (str==16)
                System.out.println(RedO + Indigo);
            else if (str==17)
                System.out.println(RedO + Violet);

            else if (str==21)
                System.out.println(OrangO + Red);
            else if (str==22)
                System.out.println(OrangO + Orange);
            else if (str==23)
                System.out.println(OrangO + Yellow);
            else if (str==24)
                System.out.println(OrangO + Green);
            else if (str==25)
                System.out.println(OrangO + Blue);
            else if (str==26)
                System.out.println(OrangO + Indigo);
            else if (str==27)
                System.out.println(OrangO + Violet);

            else if (str==31)
                System.out.println(YellowO + Red);
            else if (str==32)
                System.out.println(YellowO + Orange);
            else if (str==33)
                System.out.println(YellowO + Yellow);
            else if (str==34)
                System.out.println(YellowO + Green);
            else if (str==35)
                System.out.println(YellowO + Blue);
            else if (str==36)
                System.out.println(YellowO + Indigo);
            else if (str==37)
                System.out.println(YellowO + Violet);

            else if (str==41)
                System.out.println(GreenO + Red);
            else if (str==42)
                System.out.println(GreenO + Orange);
            else if (str==43)
                System.out.println(GreenO + Yellow);
            else if (str==44)
                System.out.println(GreenO + Green);
            else if (str==45)
                System.out.println(GreenO + Blue);
            else if (str==46)
                System.out.println(GreenO + Indigo);
            else if (str==47)
                System.out.println(GreenO + Violet);

            else if (str==51)
                System.out.println(BluO + Red);
            else if (str==52)
                System.out.println(BluO + Orange);
            else if (str==53)
                System.out.println(BluO + Yellow);
            else if (str==54)
                System.out.println(BluO + Green);
            else if (str==55)
                System.out.println(BluO + Blue);
            else if (str==56)
                System.out.println(BluO + Indigo);
            else if (str==57)
                System.out.println(BluO + Violet);

            else if (str==61)
                System.out.println(IndigoVO + Red);
            else if (str==62)
                System.out.println(IndigoVO + Orange);
            else if (str==63)
                System.out.println(IndigoVO + Yellow);
            else if (str==64)
                System.out.println(IndigoVO + Green);
            else if (str==65)
                System.out.println(IndigoVO + Blue);
            else if (str==66)
                System.out.println(IndigoVO + Indigo);
            else if (str==67)
                System.out.println(IndigoVO + Violet);

            else if (str==71)
                System.out.println(VioletOVO + Red);
            else if (str==72)
                System.out.println(VioletOVO + Orange);
            else if (str==73)
                System.out.println(VioletOVO + Yellow);
            else if (str==74)
                System.out.println(VioletOVO + Green);
            else if (str==75)
                System.out.println(VioletOVO + Blue);
            else if (str==76)
                System.out.println(VioletOVO + Indigo);
            else if (str==77)
                System.out.println(VioletOVO + Violet);

            else
            System.out.println("Нет такого цвета ");
        }
    }

        private void color(int i){
            switch (i){
                case 1: {
                    System.out.println(Red);
                    break;
                }
                case 2: {
                    System.out.println(Orange);
                    break;
                }
                case 3: {
                    System.out.println(Yellow);
                    break;
                }
                case 4: {
                    System.out.println(Green);
                    break;
                }
                case 5: {
                    System.out.println(Blue);
                    break;
                }
                case 6: {
                    System.out.println(Indigo);
                    break;
                }
                case 7: {
                    System.out.println(Violet);
                    break;
                }

                default:
                    System.out.println("Нет такого цвета ");
            }
        }

    }
