package Chapter8_Inheritance.MultiLvevleInheritance;

public class BagMultileveleInheritance {

    public static class Bag{
        protected String bagName;
        public void displayBagName (){
            System.out.println("Name of bag is "+bagName+".");
        }
    }

    public static  class noteBooks extends Bag {
        protected int noteBooks;

        public void display() {
            System.out.println("There are " + noteBooks + " notebooks are present in the " + bagName);
        }
    }

        public static class Books extends noteBooks{
            protected int books;
            public void displayBooks()
            {
                System.out.println("In the "+bagName+" There are "+noteBooks+" noteBooks And "+books+" books");
            }

          public  Books(String name, int books,int notebook){
                this.books=books;
                this.noteBooks=notebook;
                this.bagName=name;

            }
        }

        public static void main(String[] args){
        Books obj= new Books("SkyBag",5,9);
        obj.displayBagName();
        obj.display();
        obj.displayBooks();
        }















}
