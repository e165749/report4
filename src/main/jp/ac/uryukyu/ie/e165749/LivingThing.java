package jp.ac.uryukyu.ie.e165749;

/**
 * Created by South on 2016/11/28.
 */


public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;


    public LivingThing(String name, int  maximumHP, int attack){ //コンストラクタ。初期値を入力する。
        this.name = "name";
        this.attack = attack;
        hitPoint =  maximumHP;
        this.dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }


    public boolean isDead(){
        return dead;
    }

    public String getName(){
        return name;
    }

    public void attack(LivingThing opponent){
        if(hitPoint >= 0) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

}
