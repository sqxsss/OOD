import java.sql.Date;

public class File extends Node{
    // fields

    private String content;

    private long size;

    //methods

    public File(String name, Node parent, long size, boolean[] pm) {
        super(name, parent);
        this.size = size;
        this.permission = pm;
    }

    @Override
    public long getSize() {
        return this.size;
    }

    public String setContent(String content, long size){
        this.size = size;
        this.content = content;
        return content;
    }

}
