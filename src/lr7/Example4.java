package lr7;

public class Example4 {
    public static class SuperClassTest {

        public char symb;

        public SuperClassTest(char symb) {
            this.symb = symb;
        }

        public SuperClassTest(SuperClassTest copySuper) {
            this.symb = 'c';
        }

        public void set(char symb) {
            this.symb = symb;
        }

        @Override
        public String toString() {
            String SubClassNameAndFieldValue;
            SubClassNameAndFieldValue = "Super \n ClassName: " + this.getClass().getSimpleName() + "Fields: " + symb;
            return SubClassNameAndFieldValue;
        }
    }

    public static class subClass extends SuperClassTest {

        public String str;

        public void set(char symb, String str) {
            this.symb = symb;
            this.str = str;

        }

        public subClass(char symb, String str) {
            super(symb);
            this.str = str;
        }

        public subClass(subClass copySub) {
            super(copySub);
            this.str = "copySub";
        }

        @Override
        public String toString() {
            String SubClassNameAndFieldValue;
            SubClassNameAndFieldValue = "Sub \n ClassName: " + this.getClass().getSimpleName() + "Fields: " + symb + "," + str;
            return SubClassNameAndFieldValue;
        }
    }

    public static class subSubClass extends subClass {

        public int num;

        public void set(String str, char symb, int num) {
            this.str = str;
            this.symb = symb;
            this.num = num;
        }

        public subSubClass(String str, char symb, int num) {
            super(symb, str);
            this.num = num;
        }

        public subSubClass(subSubClass copySubSub) {
            super(copySubSub);
            this.num = 1;
        }


        @Override
        public String toString() {
            String SubClassNameAndFieldValue;
            SubClassNameAndFieldValue = "SubSub \n ClassName: " + this.getClass().getSimpleName() + "Fields: " + num + "," + symb + "," + str;
            return SubClassNameAndFieldValue;
        }
    }

    public static void main(String[] args) {

        SuperClassTest superClassTestObj = new SuperClassTest('z');
        System.out.println(superClassTestObj.toString());
        subClass subClassObj = new subClass('z', "string");
        System.out.println(subClassObj.toString());
        subSubClass subSubClassObj = new subSubClass("privet", 'q', 342);
        System.out.println(subSubClassObj.toString());
        SuperClassTest copySuper = new SuperClassTest(superClassTestObj);
        System.out.println(copySuper.toString());
        subClass copySub = new subClass(subClassObj);
        System.out.println(copySub.toString());
        subSubClass copySubSub = new subSubClass(subSubClassObj);
        System.out.println(copySubSub.toString());
    }
}
