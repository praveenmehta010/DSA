interface Character {  
    void attack();  
}  
  
interface Weapon {  
    void use();  
}  

interface Magic{
    void spell();
}
  
class Warrior implements Character, Weapon, Magic {  
    public void attack() {  
        System.out.println("Warrior attacks with a sword.");  
    }  
  
    public void use() {  
        System.out.println("Warrior uses a sword.");  
    }  

    @Override
    public void spell() {
        System.out.println("Warrior uses Spell too");
    }
}  
    
class Ex8 {  
    public static void main(String[] args) {  
        Warrior warrior = new Warrior();  
  
        warrior.attack(); 
        warrior.use();
        warrior.spell();
    }  
}  