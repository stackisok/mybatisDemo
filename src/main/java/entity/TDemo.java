package entity;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 14:58 2018/5/4
 *@Modified By:
 *
 */
public class TDemo {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
