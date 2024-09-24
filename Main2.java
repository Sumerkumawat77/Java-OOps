class india {
    public String StateName = "";
    public String StateCapital = "";
    public int NumDistric;
    public String Population = "";
  
    public void DisplayData() {
      System.out.println("State Name : " + StateName);
      System.out.println("State Capital : " + StateCapital);
      System.out.println("State No of Dis : " + NumDistric);
      System.out.println("State Population : " + Population + "\n");
    }
  }
  
  class Main2 {
    public static void main(String[] args) {
  
      india State1 = new india();
      State1.StateName = "Rajesthan";
      State1.StateCapital = "Jaipur";
      State1.NumDistric = 50;
      State1.Population = "10Cr";
      State1.DisplayData();
  
      india State5 = new india();
      State5.StateName = "Gujrat";
      State5.StateCapital = "Gandhinagar";
      State5.NumDistric = 33;
      State5.Population = "8Cr";
      State5.DisplayData();
  
      india State2 = new india();
      State2.StateName = "MP";
      State2.StateCapital = "Bhopal";
      State2.NumDistric = 54;
      State2.Population = "18Cr";
      State2.DisplayData();
  
      india State3 = new india();
      State3.StateName = "UP";
      State3.StateCapital = "Lucknow ";
      State3.NumDistric = 75;
      State3.Population = "25Cr";
      State3.DisplayData();
  
      india State4 = new india();
      State4.StateName = "Maharashtra";
      State4.StateCapital = "Mumbai";
      State4.NumDistric = 36;
      State4.Population = "20Cr";
      State4.DisplayData();
    }
  }