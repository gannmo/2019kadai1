
        package itecafe;

import java.util.Scanner;

/**
 *
 * @author kbc19a14
 */
public class ITECafe {

    private static Object Scan;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item batcoffee = new Item(1, "バットコーヒー   280円", 280);
        Item icetea = new Item(2, "鮟鱇茶   260円", 260);
        Item tea = new Item(3, "茶   200円", 200);
        Item cake = new Item(4, "カーキ   300円", 300);
        Item biscuit = new Item(5, "バスケット   500円", 500);
        Item bermkuchen = new Item(6, "樹木   700円", 700);
        Item milktea = new Item(7,"ミルク茶   450円",450);
        Item pancake = new Item(8,"ポンケーキ   550ポン",550);
        Item sandwich = new Item(9,"挟むウィッチ   450円",450);
        Item orangejuice = new Item(10,"オレンジジュースィー   500C",500);
        
        Item[] items = new Item[20];
        items[0] = batcoffee;
        items[1] = icetea;
        items[2] = tea;
        items[3] = cake;
        items[4] = biscuit;
        items[5] = bermkuchen;
        items[6] = milktea;
        items[7] = pancake;
        items[8] = sandwich;
        items[9] = orangejuice;
        Scanner scan = new Scanner(System.in);

        //メニューを表示する
        int inputNum;
        int goukei = 0;

        while (true) {
            while (true) {
                System.out.println("■■■goudayuu様制作ITECafeシステム■■■");
                System.out.println(batcoffee.getNo() + ":" + batcoffee.getName());
                System.out.println(icetea.getNo() + ":" + icetea.getName());
                System.out.println(tea.getNo() + ":" + tea.getName());
                System.out.println(cake.getNo() + ":" + cake.getName());
                System.out.println(biscuit.getNo() + ":" + biscuit.getName());
                System.out.println(bermkuchen.getNo() + ":" + bermkuchen.getName());
                System.out.println(milktea.getNo() + ":" + milktea.getName());
                System.out.println(pancake.getNo() + ":" + pancake.getName());
                System.out.println(sandwich.getNo() + ":" + sandwich.getName());
                System.out.println(orangejuice.getNo() + ":" + orangejuice.getName());
                System.out.println("yuu「欲しいブツの番号を入力したまえ」");
                 
                
                
                try {

                    String inputStr;
                    inputStr = scan.next();
                    inputNum = Integer.parseInt(inputStr);
                    System.out.println(inputNum);
                    System.out.println(items[inputNum - 1].getNo() + ":" + items[inputNum - 1].getName()
                            + "" + items[inputNum - 1].getPrice() + "円が入力されましたん");
                    break;
                    
                    

                } catch (NumberFormatException e) {
                    System.out.println("入力エラー:yuu「数値を入力してくれ」");

                    // TODO code application logic here
                }

            }

            System.out.println("yuu「数量を入力してくれ」");
            String inputStr;
            inputStr = scan.next();
            inputNum = Integer.parseInt(inputStr);
            
            goukei += items[inputNum - 1].getPrice() * inputNum;
            goukei = (int)(goukei * 1.08);
            System.out.println( goukei );
            
            System.out.println("yuu「貴様が今から支払う金額は" + goukei + "円だ、払えよ？」");
            
            
            
            //break;
            System.out.println("yuu「入力は済んだかップシュウウゥゥ‼」");
            System.out.println("1:yuu「終わりだ」");
            inputStr = scan.next();
            inputNum = Integer.parseInt(inputStr);
            if( inputNum == 1 ){
                break;
            }
             
        }
        
         System.out.println("yuu「それで、いくら出すんだ？」");
          String inputStr;
            inputStr = scan.next();
            int osiharai = Integer.parseInt(inputStr);
            int oturi = osiharai-goukei;
         System.out.println("yuu「釣りは" + oturi + "円だ」");
        
         System.out.println("yuu「おー、また来いよー」");
        
        
      
                
        
        
        
    }
}
