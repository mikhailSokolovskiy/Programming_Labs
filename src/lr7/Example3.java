package lr7;

import javax.swing.plaf.synth.SynthButtonUI;

public class Example3 {

    public static class SuperClassTest{

        public int num;

        public SuperClassTest(int num) {
            this.num = num;
        }

        public void set(int num) {
            this.num = num;
        }
        @Override
        public String toString(){
            String SubClassNameAndFieldValue;
            SubClassNameAndFieldValue = "Super \n ClassName: " + this.getClass().getSimpleName() + "Fields: " + num;
            return SubClassNameAndFieldValue;
        }
    }

    public static class subClass extends SuperClassTest{

        public char symb;

        public void set(char symb, int num) {
            this.symb = symb;
            this.num = num;
        }

        public subClass(char symb, int num) {
            super(num);
            this.symb = symb;
        }

        @Override
        public String toString(){
            String SubClassNameAndFieldValue;
            SubClassNameAndFieldValue = "Sub \n ClassName: " + this.getClass().getSimpleName() + "Fields: " + num + "," + symb;
            return SubClassNameAndFieldValue;
        }
    }

    public static class subSubClass extends subClass{

        public String str;

        public void set(String str, char symb, int num) {
            this.str = str;
            this.symb = symb;
            this.num = num;
        }

        public subSubClass(String str, char symb, int num) {
            super(symb, num);
            this.str = str;
        }
        @Override
        public String toString(){
            String SubClassNameAndFieldValue;
            SubClassNameAndFieldValue = "SubSub \n ClassName: " + this.getClass().getSimpleName() + "Fields: " + num + "," + symb + "," + str;
            return SubClassNameAndFieldValue;
        }
    }

    public static void main(String[] args) {

        SuperClassTest superClassTestObj = new SuperClassTest(12);
        System.out.println(superClassTestObj.toString());
        subClass subClassObj = new subClass('z', 43);
        System.out.println(subClassObj.toString());
        subSubClass subSubClassObj = new subSubClass("privet", 'q', 342);
        System.out.println(subSubClassObj.toString());
    }
}
