import java.util.Scanner;
public class J05033 {
    static Scanner scanner = new Scanner(System.in);
    static public class time{
//        public time(){
//        }
        private long h,m,s,sum;
        public time(long h, long m, long s, long sum) {
            this.h = h;
            this.m = m;
            this.s = s;
            this.sum = sum;
        }

        public long getSum() {
            return sum;
        }
        
        public void output(){
            System.out.println(this.h + " " + this.m +" "+this.s);
        }
        public static void sapxep(time[ ] a,int n){
            for(int i = 0 ; i<n ; i++)
            {
                for(int j = i+1 ; j<n ; j++)
                {
                    if(a[i].getSum()>a[j].getSum())
                    {
                        time tmp = a[i];
                        a[i] = a[j];
                        a[j] = tmp;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int test = scanner.nextInt();
        time[] a = new time[5005];
        int s_tmp = 0;
        while(test-->0)
        {
            long h = scanner.nextLong();
            long m = scanner.nextLong();
            long s = scanner.nextLong();
            long sum = h*60*60 + m*60 +s;
            time tmp = new time(h,m,s,sum);
            a[s_tmp] = tmp;
            s_tmp++;
        }
//        System.out.println("1");
        time.sapxep(a, s_tmp);
        for(int i = 0 ; i<s_tmp ; i++)
        {
//            System.out.println(1);
            time tmp = a[i];
            tmp.output();
//            a[i].output();
        }
    } 
    
}