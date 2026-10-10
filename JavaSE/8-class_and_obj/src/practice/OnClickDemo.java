package practice;

interface OnClick {
    void onClick(String buttonName);
}

public class OnClickDemo {
    public static void main(String[] args) {
        new OnClick() {
            @Override
            public void onClick(String buttonName) {
                System.out.println(buttonName + " 按钮被点击");
            }
        }.onClick("提交");

        OnClick btn2 = buttonName -> System.out.println(buttonName + " 按钮被点击");
        btn2.onClick("刷新");
    }
}
