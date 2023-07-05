import java.util.ArrayList;
import java.util.List;

public class Directory extends Node{
    // fields

    private List<Node> content;

    // methods

    public Directory(String name, Node parent, boolean[] pm) {
        super(name, parent);
        permission = pm;
        content = new ArrayList<>();
    }

    @Override
    public long getSize() {
        long size = 0;
        for(Node n : content){
            size += n.getSize();
        }
        return size;
    }

    public int countFiles(){
        int count = 0;
        for(Node child : content){
            if(child instanceof File){
                count++;
            }else{
                count += ((Directory)child).countFiles();
            }
        }
        return count;
    }

    public List<Node> getContent(){
        return this.content;
    }

    public void addNode(Node node){
        content.add(node);
//        node.setParent(this);
    }

    public void deleteNode(Node node){
        content.remove(node);
    }
}
