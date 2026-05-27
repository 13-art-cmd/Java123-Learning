class University{
    private String uniName = "Gurukul Kangri";
    class Department{
        void display(){
            System.out.println(uniName);
        }
    }

    public static void main(String[] args){
        University u1 = new University();
        University.Department d1 = u1.new Department();
        d1.display();
    }
}
