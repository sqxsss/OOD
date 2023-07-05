import java.sql.Date;
import java.sql.Timestamp;

public abstract class Node {
    // fields

    protected String name;

    protected boolean[] permission;

    protected Node parent;

    protected final Date created;

    protected Date modified;

    // methods

    protected Node(String name, Node parent){
        this.name = name;
        this.parent = parent;
        this.created = new Date(System.currentTimeMillis());
    }

    protected abstract long getSize();

    public String getCurrentPath(){
        if(this.parent == null){
            return "C:/";
        }
        return getParent().getCurrentPath()+'/'+getName();
    }

    public String getName() {
        return name;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node node){
        this.parent = node;
    }

    public Date getCreated() {
        return created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date time) {
        this.modified = time;
    }
}
