public class FileSystem {
    // fields

    private Node root;

    // methods

    public FileSystem(){
        root = new Directory("anyName", null, new boolean[]{true});
        root.setParent(root);
    }

    public int countFiles(){
        return ((Directory)root).countFiles();
    }

    public long getSize(){
        return root.getSize();
    }

    public void mkdir(String path){
        if(path == null || path.length() == 0){
            return;
        }
        String[] pathNames = path.split("/");
        Node cur = root;
        for(String name : pathNames){
            boolean flag = false;
            for(Node child : ((Directory)cur).getContent()){
                if(child.name.equals(name)){
                    cur = child;
                    flag = true;
                    break;
                }
            }
            if(!flag){
                Node newDir = new Directory(name, cur, new boolean[]{true});
                ((Directory)cur).addNode(newDir);
                cur = newDir;
            }
        }
    }
}
