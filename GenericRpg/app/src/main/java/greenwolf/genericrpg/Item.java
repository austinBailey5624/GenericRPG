package greenwolf.genericrpg;

/**
 * Created by Michael on 3/26/2016.
 */
public class Item extends Actor {
    private int m_type;
    private int m_potionCount;
    private String m_name;
    private boolean m_used;
    private boolean potionUsed;

    public Item(int typeOfItem)
    {
        m_name = "";
        m_used = false;
        m_potionCount = 0;
        if(typeOfItem == 1)
        {
            m_type = 1;
            m_name = "sword";
        }
        else if(typeOfItem == 2)
        {
            m_type = 2;
            m_name = "shield";
        }
        else if(typeOfItem == 3)
        {
            m_type = 3;
            m_name = "hPotion";
            potionUsed = false;
            m_potionCount++;
        }
    }
    public void ability(PlayerActor pa, boolean isUsed)
    {
        if(m_type == 1)
        {
            if(isUsed == true)
            {
                m_used = true;
                pa.setAtk(pa.getAtk() + 5);
            }
        }
        if(m_type == 2)
        {
            if(isUsed == true)
            {
                m_used = true;
                pa.setDef(pa.getDef() + 5);
            }
        }
        if(m_type == 3)
        {
            if(isUsed == true)
            {
                m_used = true;
                pa.setCurHp(pa.getCurHp() + 10);
                potionUsed = true;
            }
        }
    }
    public void PotionGone()
    {
        if(potionUsed == true)
        {
            m_potionCount--;
        }
    }


}
