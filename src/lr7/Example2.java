package lr7;

public class Example2 {
    public static class SuperClassTest{
        private String  str1;

        SuperClassTest(String StrEx) {
            this.str1 = StrEx;
        }
        SuperClassTest(){
        }

        @Override
        public String toString(){
            String superClassNameAndFieldValue;
            superClassNameAndFieldValue = "super \n" + "Class name:" + this.getClass().getSimpleName() + "\n" + "str length = " + this.str1.length();
            return superClassNameAndFieldValue;
        }

        public void setStr1(String str1) {
            this.str1 = str1;
        }
        public void setStr1() {
            this.str1 = "Без параметров";
        }
    }

    public static class SubClassTest extends Example1.SuperClassTest {
        private String str;
        public int num;
        SubClassTest(String StrEx) {
            super(StrEx);
        }
        SubClassTest(String StrEx2, int numEx){
            this.str = StrEx2;
            this.num = numEx;
        }

        @Override
        public String toString(){
            String SubClassNameAndFieldValue;
            SubClassNameAndFieldValue = "Sub \nClass name:\nstr 1 = %s".formatted(this.getClass().getSimpleName()) + "\nstr = " + str + "\nnum = " + num;
            return SubClassNameAndFieldValue;
        }

        public void set() {
            this.str = "asdasd";
        }
        public void set(String strEx) {
            this.str = strEx;
        }
        public void set(int numEx) {
            this.num = numEx;
        }
        public void set(String strEx, int numEx) {
            this.str = strEx;
            this.num = numEx;
        }

    }
    public static void main(String[] args) {

        SuperClassTest superClassTestObj = new SuperClassTest("asdasd");
        System.out.println(superClassTestObj.toString());
        superClassTestObj.setStr1("2");
        System.out.println(superClassTestObj.toString());
        superClassTestObj.setStr1();
        System.out.println(superClassTestObj.toString());

        SubClassTest subClassTestObj = new SubClassTest("asdasd");
        System.out.println(subClassTestObj.toString());
        subClassTestObj.set();
        System.out.println(subClassTestObj.toString());
        subClassTestObj.set("str");
        System.out.println(subClassTestObj.toString());
        subClassTestObj.set(12);
        System.out.println(subClassTestObj.toString());
        subClassTestObj.set("asdasd", 23);
        System.out.println(subClassTestObj.toString());

    }
}
