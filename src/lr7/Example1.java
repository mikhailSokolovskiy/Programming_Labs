package lr7;

public class Example1 {
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
            superClassNameAndFieldValue = "super \n" + "Class name:" + this.getClass().getSimpleName() + "\n" + "str 1 = " + this.getStr1();
            return superClassNameAndFieldValue;
        }

        public void setStr1(String str1) {
            this.str1 = str1;
        }

        public String getStr1() {
            return str1;
        }
    }

    public static class SubClassTest extends SuperClassTest{
        private String str2;
        private String str3;
        SubClassTest(String StrEx) {
            super(StrEx);
        }
        SubClassTest(String StrEx2, String StrEx3){
            this.str2 = StrEx2;
            this.str3 = StrEx3;
        }

        @Override
        public String toString(){
            String SubClassNameAndFieldValue;
            SubClassNameAndFieldValue = "Sub \n" + "Class name:" + this.getClass().getSimpleName() + "\n" + "str 1 = " + this.getStr1() + "\n" + "str 2 = " + this.getStr2() + "\n" + "str 3 = " + this.getStr3();
            return SubClassNameAndFieldValue;
        }

        public String getStr2() {
            return str2;
        }

        public void setStr2(String str2) {
            this.str2 = str2;
        }

        public String getStr3() {
            return str3;
        }

        public void setStr3(String str3) {
            this.str3 = str3;
        }
    }
    public static void main(String[] args) {

        SuperClassTest superClassTestObj = new SuperClassTest("Констурктор суперкласса");
        System.out.println(superClassTestObj.toString());

        SubClassTest subClassTestObj1 = new SubClassTest("Конструктор подкласса с одним аругментом");
        System.out.println(subClassTestObj1.toString());

        SubClassTest subClassTestObj2  = new SubClassTest("Конструктор подкласса", "с двумя аргументами");
        System.out.println(subClassTestObj2.toString());
    }
}
