package lr7;

public class Example5 {

    public static class SuperClassTest {

        private String str;

        public SuperClassTest(String strEx) {
            this.str = strEx;
        }

        public void Show() {
            String SubClassNameAndFieldValue = "Super\nClassName: " + this.getClass().getSimpleName() + "\nFields: " + str;
            System.out.println(SubClassNameAndFieldValue);
        }
    }

    public static class subClass1 extends SuperClassTest {

        private int num;

        public subClass1(String strEx, int numEx) {
            super(strEx);
            this.num = numEx;
        }

        @Override
        public void Show() {
            String SubClassNameAndFieldValue = "Sub\nClassName: " + this.getClass().getSimpleName() + "\nFields: " + num;
            System.out.println(SubClassNameAndFieldValue);
        }
    }

    public static class subClass2 extends SuperClassTest {

        private char symb;

        public subClass2(String strEx, char symbEx) {
            super(strEx);
            this.symb = symbEx;
        }

        @Override
        public void Show() {
            String SubClassNameAndFieldValue = "Sub\nClassName: " + this.getClass().getSimpleName() + "\nFields: " + symb;
            System.out.println(SubClassNameAndFieldValue);
        }
    }
    public static void main(String[] args) {
        SuperClassTest superClassTestObj = new SuperClassTest("SuperClass");
        superClassTestObj.Show();
        subClass1 subClass1Obj = new subClass1("subclass1", 1);
        subClass1Obj.Show();
        subClass2 subClass2Obj = new subClass2("subclass2", '2');
        subClass2Obj.Show();
    }
}
