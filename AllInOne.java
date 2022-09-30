public class AllInOne {
    boolean EvenOrOdd(int n){
        if(n%2==0)
        {
            System.out.println("Even number");
            return true;
        }
        else
        System.out.println("odd number");
        return false;
        
    }
    void SumEvenOdd(int arr[],int n)
    {
        int eve=0;
        int odd=0;
        for(int i=0;i<n;i++)
        {
           if(EvenOrOdd(arr[i]))
           {
                eve+=1;
           }
           else
           {
            odd+=1;
           }
        }
        System.out.println("Sum of even ="+eve+"and odd ="+odd);
    }
    void NegOrPos(int n)
    {
        if(n>0)
        {
            System.out.println("Positive number");
        }
        else{
            System.out.println("Negative number");
        }
    }
    void Largest(int a,int b, int c)
    {
        if(a<b&&c<a)
        {
            System.out.println(b+"is Largest number");
        }
        else if(b<a&&c<a)
        {
            System.out.println(a+"is Largest number");
        }
        else
        System.out.println(c+"is Largest number");
    }
    void swap(int a ,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+"is swapped with"+b);
    }
    void divisibility(int num)
    {
        if(num%5==0)
        System.out.println("Number is divisible by 5");
        else
        System.out.println("Number is not divisible by 5");
    }
    void Equality(int num,int num2)
    {
        if(num==num2)
        {
            System.out.println("Numbers are equal");
        }
        else
        System.out.println("Numbers are not equal");
    }
    void SumOfDigits(int n)
    {
        int r,sum=0;
        while(n>0)
        {
            r=n%10;
            sum+=r;
            n=n/10;
        }
        System.out.println(sum);
    }
    int SumOfDigitsRec(int n)
    {
        
        int sum=n%10;
        
         if(n==0)
         return 0;
         else  
           return sum+ SumOfDigitsRec(n/10);
         }
         void Extract(int num)
         {
            int rem;
            while(num!=0)
            {
                rem=num%10;
                System.out.println(rem+" ");
                num=num/10;
            }
         }

         

        }


