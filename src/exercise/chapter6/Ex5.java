package exercise.chapter6;

public class Ex5 {
  public static void main(String[] args) {
    Phone[] phones = {
        new Phone("황진이"),
        new Telephone("길동이", "내일"),
        new SmartPhone("민국이", "갤러그")
    };
    // 코드 추가
    for (Phone phone : phones) {
      if(phone instanceof SmartPhone sm) {
        sm.playGame();
      } else if (phone instanceof Telephone tel) {
        tel.autoAnswering();
      } else if (phone instanceof Phone) {
        phone.talk();
      }
    }
  }
}

class Phone {
  protected String owner;
  void talk(){
    System.out.println(owner + " 가 통화 중");
  }

  public Phone(String owner) {
    this.owner = owner;
  }
}

class Telephone extends Phone {
  private String when;
  void autoAnswering(){
    System.out.println(owner + "가 부재중이니 " + when + "에 전화요망" );
  }

  public Telephone(String owner, String when) {
    super(owner);
    this.when = when;
  }
}

class SmartPhone extends Telephone {
  private String game;
  void playGame() {
    System.out.println(owner + "가 "+ game + " 게임 중");
  }

  public SmartPhone(String owner, String when, String game) {
    super(owner, when);
    this.game = game;
  }

  public SmartPhone(String owner, String game) {
    this(owner, "내일", game);
  }
}