package top.fkxuexi.entity;

public class B {
    private int id;
    private String msg;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "B{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                '}';
    }
}
