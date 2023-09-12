class Circle {
	protected int radius;
	public Circle(int r) {radius = r;
	}
	String name;
}

class Pizza extends Circle {
    private String name;

    // Pizza 클래스의 생성자
    public Pizza(String name, int radius) {
        super(radius); // Circle 클래스의 생성자를 호출하여 반지름을 설정합니다.
        this.name = name;
    }

    // 피자 세부 정보를 출력하는 메서드
    public void print() {
        System.out.println("피자 이름: " + name);
        System.out.println("크기: " + radius);
    }

    public static void main(String[] args) {
        Pizza obj = new Pizza("페퍼로니", 20);
        obj.print();
    }
}