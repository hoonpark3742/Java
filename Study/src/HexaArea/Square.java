package HexaArea;

public class Square {
    private int horizontal;
    private int vertical;
    private int area;
    Square(int h,int v){
        horizontal = h;
        vertical = v;
        area = horizontal * vertical;
    }
    void SquareHV(){
        System.out.println("���� : " + horizontal);
        System.out.println("���� : " + vertical);
    }
    void SquareArea(){       
        System.out.println("���� : " + area);
    }
    int getArea(){
        return area;
    }
}

