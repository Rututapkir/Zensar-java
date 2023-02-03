public class compositionAsso {

        // HAS-A kind of relationship
        public static void main(String args[]){
            Customer customer = new Customer();
            customer.setCid(1);
            customer.setname("Rutuja");
            customer.setAddress("Ahmednagar");
            
            Account account = customer.getAccount();
            account.setaccno(1001);
            account.setbranch("Nagapur");
            account.setbalance(200000);
        }
        
    }
     class Customer{
        private int cId;
        private String name;
        private String address;
        private Account account;
        public Customer(){
            account = new Account();
        }
        // getter and setter method 
        public int getCid(){
            return cId;
        }
        public void setCid(int cId){
            this.cId = cId;
        }
        public String getname(){
            return name;
        }
        public void setname(String name){
            this.name = name;
        }
        public String getaddress(){
            return name;
        }
        public void setAddress(String address){
            this.address = address;
        }
        public Account getAccount(){
            return account;
        }
        public void setAccount(Account account){
            this.account = account;
        }
    }

     class Account{
        private int accno;
        private String bank;
        private String branch;
        private double balance;
        //setter and getter 
        public int getaccno(){
            return accno;
        }
        public void setaccno(int accno){
            this.accno = accno;
        }
        public String getbank(){
            return bank;
        }
        public void setbank(String bank){
            this.bank= bank;
        }
        public String  getbranch(){
            return branch;
        }
        public void setbranch(String accno){
            this.branch = branch;
        }
        public double getbalance(){
            return balance;
        }
        public void setbalance(double balance){
            this.balance = balance ;
        }
    }
    
    
    

