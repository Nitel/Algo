import java.util.HashMap;
import java.util.Random;

/**
 * Class PACKAGE_NAME.Main
 * @author vnahi
 * @project TriTab
 */
public class main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tab = new int[]{ 8, 2, 3, 2, 7, 8, 3, 10, 2, 1 };
        //        while (1 == 1) {
        //            for (int j = 0; j<=tab.length-1; j++) {
        //                tab[j] = 1;
        //            }
        //  naifMaj(tab);
        //    }
        tabCount(tab);
    }

    static boolean naifMaj(int[] tab) {
        int tmp;
        int count;
        for (int i = 0; i<tab.length; i++) {
            count = 1;
            tmp = tab[i];
            for (int j = i; j<tab.length; j++) {
                if (tab[j] == tmp) {
                    count++;
                    if (count>tab.length/2-1) {
                        System.out.println("true");
                        return true;
                    }
                    if (i>tab.length/2-1 && count != i) {
                        System.out.println("False");
                        return false;
                    }
                }
            }
        }
        System.out.println("False");
        return false;
    }

    static void tabCount(int[] tab) {
        Random random = new Random();
        int[] tab2 = new int[tab.length+1];
        for (int j = 0; j<=tab.length; j++) {
            tab2[j] = 0;
            System.out.println(tab2[j]);
        }
        for (int i = 0; i<tab.length; i++) {
            tab2[tab[i]]++;
            System.out.println(tab2[i]);
        }
    }

    static void divRegne(int[] tab){
        int count =0;
        int[] tabVal = new int[2];
        if (tab.length>1) {
            int[] tab1 = new int[tab.length/2];
            int[] tab2 = new int[tab.length/2];
            for (int i = 0; i<tab.length; i++) {
                if (i<tab.length/2)
                    tab1[i] = tab[i];
                if (i>tab.length/2)
                    tab2[i] = tab[i];
            }
            if (tab1.length>1)
                divRegne(tab1);
            if (tab2.length>1)
                divRegne(tab2);
            if (tab1.length == 1 ) {
                int[] val ={0,0};
                val[0]=tab1[0];
                val[1]++;

            }
            if (tab2.length == 1 ){
                int[] val ={0,0};
                val[0]=tab2[0];
                val[1]++;
            }
        }
    }

    static int divReg(int[] tab, int i, int j){
        HashMap<Integer, Integer> maj = new HashMap<Integer, Integer>();
        if(i == j){
            return divReg(tab, i, 1);
        }
        divReg(tab, i, (i+j-1)/2);
        divReg(tab, (i+j+1)/2, j);

        if(i == -1 && j == -1){

        }
    }
}







