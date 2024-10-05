class Super {
    int id;

    Super() {
        id = 100;
    }

    void methodA() {
        System.out.println("Superクラスのid：" + id);
    }
}

class Sub extends Super {
    int id;

    Sub() {
    }

    Sub(int id) {
        this.id = id;
    }

    void methodA() {
        System.out.println("superで呼び出したメソッドの戻り値が下記。");
        super.methodA();    // スーパークラスのメソッドを呼び出す
    }

    void methodB() {
        System.out.println("Subクラスのid：" + id);
    }
}

public class Practice29 {
    public static void main(String[] args) {
        Super superObj = new Super();
        Sub subObjA = new Sub();
        Sub subObjB = new Sub(9999);

        superObj.methodA();
        subObjA.methodA();
        subObjB.methodB();
    }
}
