public class Character {
    private double m_xPos;
    private double m_yPos;
    private double m_health;
    private double m_level;
    private double m_attackPower;

    public Character(double health, double attackPower) {
        m_xPos = 0;
        m_yPos = 0;
        m_health = health;
        m_level = 1;
        m_attackPower = attackPower;
    }

    public void basicAttack(Character victim) {
        victim.decreaseHealth(m_attackPower);
    }

    public void decreaseHealth(double amount) {
        m_health -= amount;
    }

    public void increaseAttackPower(double amount) {
        m_attackPower += amount;
    }

    public double getHealth() {
        return m_health;
    }
}
