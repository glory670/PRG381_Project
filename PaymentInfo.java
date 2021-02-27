class PaymentInfor 
{

   private int payid;
   private int bookingnr;
   public static  double priceperguest=50;
   private int totalprice;
   private int percentagepayed;
   private int noofguest;
   private int discount;

   public PaymentInfor(int payid,int bookingid, int totalprice,int percentagepayed,int noofguest,int disount)
   {
       this.payid=payid;
       this.bookingnr=bookingid;
       this.totalprice=totalprice;
       this.percentagepayed=percentagepayed;
       this.noofguest=discount;
       this.discount=discount;
   }


 
//default constructor
public PaymentInfor()
{
 noofguest=0;
 totalprice=0;

}
//Method to get payid 
public int getPayid()
{
    return payid;
}
//Method to get bookingnr 
public int Getbookingnr()
{
    return bookingnr;
}
//Method to set numberofguest
public void setguests(int numberofguest)
{
    this.noofguest=numberofguest;
    //computeprice(numberofguest);
}


// Method to get number of guest
public int getGuest()
{
    return noofguest;
}
//Method to get totalprice
public int gettotalprice()
{
    return totalprice;
}
public void settotalprice( int totalprice)
{
    this.totalprice= totalprice;

}

public int getnoofguest()
{
    return noofguest;
}
public int getdiscount()
{
    return discount;
}
public void setdiscount(int discount)
{
   this.discount= discount;

}
}


