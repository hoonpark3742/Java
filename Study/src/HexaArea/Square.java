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
        System.out.println("가로 : " + horizontal);
        System.out.println("세로 : " + vertical);
    }
    void SquareArea(){       
        System.out.println("넓이 : " + area);
    }
    int getArea(){
        return area;
    }
}

