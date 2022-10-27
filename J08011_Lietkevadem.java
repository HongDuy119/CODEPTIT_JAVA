import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J08011_Lietkevadem {
    public static boolean check(int n)
    {
        String s = String.valueOf(n);
        for(int i = 0 ; i< s.length()-1 ; i++)
        {
            if(s.charAt(i)>s.charAt(i+1)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] res = new int[100005];
        int s = 0;
        while(scanner.hasNext())
        {
            int c = scanner.nextInt();
            if(check(c))
            {
               res[s] = c;
               s++;
            }
            if(c==0) break;
        }
        int[] d = new int[100005];
        int k = 0;
        for(int i =0 ; i<s ; i++)
        {
            if(check(res[i]) && res[i]!=-1)
            {
                int dem = 1;
                for(int j = i+1 ; j<s ; j++)
                {
                    if(res[i]==res[j] && res[j]!=-1)
                    {
                        d[k] = dem;
                        k++;
                        dem++;
                        res[j]=-1;
                    }
                }
                System.out.printf("%s %d\n",res[i],dem);
            }
        }
        for(int i = 0 ; i<k ; i++)
        {
            for(int j = i+1 ; j< k ; j++)
            {
                if(d[i]<d[j])
                {
                    int temp = d[i];
                    d[i]=d[j];
                    d[j] = temp;
                }
            }
        }
        while(k>=0)
        {
            for(int i = 0 ; i<s ; i++ )
            {
                if(d[i]==)
            }
        }
    
    }
}