package chap3;

import org.springframework.stereotype.Component;

@Component
public class Parrot {

    private String name = "Koko";
    public Parrot() {
        System.out.println("Parrot이 생성되었습니다.");
    }
    @Override
    public String toString() {
        return "Parrot : " + name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
